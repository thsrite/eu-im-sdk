package com.eu.im.sdk.model.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 处理好友申请
 */
@Data
public class FriendHandleDto {

    /**
     * 好友申请id
     */
    @NotNull(message = "请选择需要操作的好友申请")
    private Long ufid;

    /**
     * 好友状态
     * 2通过 3拒绝
     */
    @NotNull(message = "请选择通过或拒绝")
    private Integer ufState;

}
