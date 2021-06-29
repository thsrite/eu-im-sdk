package com.eu.im.sdk.model.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 消息转发dto
 */
@Data
public class MessageForwardDto {

    /**
     * 消息id
     */
    @NotNull(message = "消息id")
    private Long mid;

    /**
     * 转发列表
     */
    @NotEmpty(message = "转发列表")
    private List<Long> gidList;

}
