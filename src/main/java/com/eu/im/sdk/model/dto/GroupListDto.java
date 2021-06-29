package com.eu.im.sdk.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 群组列表 查询
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupListDto {

    /**
     * 搜索内容
     */
    private String queryStr;

}
