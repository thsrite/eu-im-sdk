package com.eu.im.sdk.common.auth;

import cn.hutool.core.util.StrUtil;

public class DefaultCredentials  {

    private final String accessKeyId;
    private final String accessKeySecret;

    public DefaultCredentials(String accessKeyId, String accessKeySecret) {
        if (StrUtil.isBlank(accessKeyId)) {
            throw new InvalidCredentialsException("Access key id should not be null or empty.");
        }
        if (StrUtil.isBlank(accessKeySecret)) {
            throw new InvalidCredentialsException("Secret access key should not be null or empty.");
        }

        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

}

