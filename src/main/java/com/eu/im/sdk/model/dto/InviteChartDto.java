package com.eu.im.sdk.model.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 邀请加入群聊
 */
@Data
public class InviteChartDto {

    /**
     * 群聊id
     */
    @NotNull(message = "群聊id不能为空")
    private Long gid;

    /**
     * 邀请人id list
     */
    @NotEmpty(message = "请邀请至少一位加入")
    private List<Long> uidList;

}
