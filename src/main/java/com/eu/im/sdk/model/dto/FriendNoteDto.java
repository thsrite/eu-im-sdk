package com.eu.im.sdk.model.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 修改好友备注
 */
@Data
public class FriendNoteDto {

    /**
     * 好友id
     */
    @NotNull(message = "请选择好友")
    private Long tid;

    /**
     * 好友备注
     */
    @NotNull(message = "请输入好友备注")
    private String notename;

}
