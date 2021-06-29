package com.eu.im.sdk.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 创建群组
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupCreateDto {

    /**
     * 群组名称
     */
    @NotBlank(message = "群组名称不能为空")
    private String groupName;

    /**
     * 群组成员id列表
     */
    @NotEmpty(message = "请选择群成员")
    private List<Long> uidList;

}
