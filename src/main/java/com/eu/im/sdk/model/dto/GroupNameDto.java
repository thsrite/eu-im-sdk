package com.eu.im.sdk.model.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 修改群名称
 */
@Data
public class GroupNameDto {

    /**
     * 群id
     */
    @NotNull(message = "请选择群组")
    private Long gid;

    /**
     * 群名称
     */
    @NotNull(message = "请输入群名称")
    private String groupName;

}
