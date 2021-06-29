package com.eu.im.sdk.model.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 添加好友dto
 */
@Data
public class FriendAddDto {

    /**
     * 好友uid
     */
    @NotNull(message = "请传入好友uid")
    private Long tid;

    /**
     * 申请内容
     */
    private String utMsg;

}
