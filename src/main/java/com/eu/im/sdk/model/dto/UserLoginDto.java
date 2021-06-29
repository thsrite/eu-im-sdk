package com.eu.im.sdk.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 用户登录
 * 登录即注册
 */
@Data
public class UserLoginDto {

    /**
     * 登录手机号
     */
    @NotBlank(message = "请输入登录手机号")
    private String phone;

    /**
     * 用户名
     */
    @NotBlank(message = "用户名")
    private String username;

}
