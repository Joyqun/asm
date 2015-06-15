package com.sam.yh.dao;

import java.util.List;

import com.sam.yh.model.UserFollow;
import com.sam.yh.model.UserFollowKey;

public interface UserFollowMapper {
    int deleteByPrimaryKey(UserFollowKey key);

    int insert(UserFollow record);

    int insertSelective(UserFollow record);

    UserFollow selectByPrimaryKey(UserFollowKey key);

    int updateByPrimaryKeySelective(UserFollow record);

    int updateByPrimaryKey(UserFollow record);

    List<UserFollow> selectByUserId(int userId);
}