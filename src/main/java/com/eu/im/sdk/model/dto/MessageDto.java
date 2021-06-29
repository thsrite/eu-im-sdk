package com.eu.im.sdk.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 发送消息dto
 */
@Data
public class MessageDto {

    /**
     * 群组id
     */
    @NotNull(message = "群组id不能为空")
    private Long gid;

    /**
     * 消息内容
     */
    @NotBlank(message = "发送消息不能为空")
    private String message;

    /**
     * 消息类型
     * SubMsgType
     */
    @NotNull(message = "请选择消息类型 SubMsgType")
    private Integer msgType;

}
