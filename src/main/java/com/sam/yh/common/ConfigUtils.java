package com.sam.yh.common;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigUtils {

    private static final Logger logger = LoggerFactory.getLogger(ConfigUtils.class);

    private static PropertiesConfiguration config;

    public static final String DAHANT_SERVERURL = "dahant.serverurl";
    public static final String DAHANT_ACCOUNT = "dahant.account";
    public static final String DAHANT_PASSWORD = "dahant.password";
    public static final String SMS_ENABLE = "sms.enable";
    public static final String ADMIN_PHONE = "admin.phone";

    public static final String ANDROID_LATEST_VERSION = "android.latest.version";
    public static final String ANDRIOD_LATEST_DOWNLOADURL = "android.latest.downloadurl";
    public static final String ANDRIOD_LATEST_SHORTURL = "android.latest.shortUrl";

    public static final String MAIL_HOST = "mail.host";
    public static final String MAIL_SENDER = "mail.sender";
    public static final String MAIL_USERNAME = "mail.username";
    public static final String MAIL_PASSWORD = "mail.password";
    public static final String MAIL_REVEIVER = "mail.receiver";

    public static final String MOVE_DISTANCE = "move.distance";

    public static final String M2M_URL = "m2m.url";
    public static final String M2M_USERNAME = "m2m.username";
    public static final String M2M_PASSWORD = "m2m.password";
    public static final String M2M_APIKEY = "m2m.apikey";

    public static PropertiesConfiguration getConfig() {
        if (config == null) {
            synchronized (ConfigUtils.class) {
                if (config == null) {
                    try {
                        config = new PropertiesConfiguration("server.properties");
                    } catch (ConfigurationException e) {
                        logger.error("can not load server.properties file");
                    }
                }
            }
        }

        return config;
    }

}