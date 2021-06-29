package com.eu.im.sdk.common.auth;

import cn.hutool.core.util.StrUtil;

public class DefaultCredentialProvider {

    private volatile DefaultCredentials creds;

    public DefaultCredentialProvider(DefaultCredentials creds) {
        setCredentials(creds);
    }

    public DefaultCredentialProvider(String accessKeyId, String accessKeySecret) {
        checkCredentials(accessKeyId, accessKeySecret);
        setCredentials(new DefaultCredentials(accessKeyId, accessKeySecret));
    }

    public synchronized void setCredentials(DefaultCredentials creds) {
        if (creds == null) {
            throw new InvalidCredentialsException("creds should not be null.");
        }

        checkCredentials(creds.getAccessKeyId(), creds.getAccessKeySecret());
        this.creds = creds;
    }

    public DefaultCredentials getCredentials() {
        if (this.creds == null) {
            throw new InvalidCredentialsException("Invalid credentials");
        }

        return this.creds;
    }

    private static void checkCredentials(String accessKeyId, String accessKeySecret) {
        if (StrUtil.isBlank(accessKeyId)) {
            throw new InvalidCredentialsException("Access key id should not be null or empty.");
        }

        if (StrUtil.isBlank(accessKeySecret)) {
            throw new InvalidCredentialsException("Secret access key should not be null or empty.");
        }
    }

}
