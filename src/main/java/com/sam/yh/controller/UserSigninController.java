package com.sam.yh.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.sam.yh.common.MobilePhoneUtils;
import com.sam.yh.common.PwdUtils;
import com.sam.yh.crud.exception.CrudException;
import com.sam.yh.crud.exception.UserSignupException;
import com.sam.yh.model.User;
import com.sam.yh.req.bean.IllegalRepParamsException;
import com.sam.yh.req.bean.UserSigninReq;
import com.sam.yh.resp.bean.ResponseUtils;
import com.sam.yh.resp.bean.SamResponse;
import com.sam.yh.resp.bean.UserInfoResp;
import com.sam.yh.service.UserService;

@RestController
@RequestMapping("/user")
public class UserSigninController {

    @Autowired
    UserService userService;

    private static final Logger logger = LoggerFactory.getLogger(UserSigninController.class);

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public SamResponse signin(HttpServletRequest httpServletRequest, @RequestParam("jsonReq") String jsonReq) {

        logger.debug("Request json String:" + jsonReq);

        UserSigninReq req = JSON.parseObject(jsonReq, UserSigninReq.class);

        try {
            validateSigninArgs(req);

            User user = userService.signin(req.getUserPhone(), req.getPassword(), req.getDeviceInfo());

            UserInfoResp respData = new UserInfoResp();
            respData.setUserUid(user.getUuid());

            return ResponseUtils.getNormalResp(respData);
        } catch (IllegalRepParamsException e) {
            return ResponseUtils.getParamsErrorResp(e.getMessage());
        } catch (CrudException e) {
            logger.error("signin exception, " + req.getUserPhone(), e);
            if (e instanceof UserSignupException) {
                return ResponseUtils.getServiceErrorResp(e.getMessage());
            } else {
                return ResponseUtils.getSysErrorResp();
            }
        } catch (Exception e) {
            logger.error("signin exception, " + req.getUserPhone(), e);
            return ResponseUtils.getSysErrorResp();
        }
    }

    private void validateSigninArgs(UserSigninReq userSigninReq) throws IllegalRepParamsException {
        if (!MobilePhoneUtils.isValidPhone(userSigninReq.getUserPhone())) {
            throw new IllegalRepParamsException("请输入正确的手机号码");
        }

        if (!PwdUtils.isValidPwd(userSigninReq.getPassword())) {
            throw new IllegalRepParamsException("密码长度为8-20位字符");
        }

    }

}
