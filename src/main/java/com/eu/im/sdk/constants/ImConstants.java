package com.eu.im.sdk.constants;

public interface ImConstants {

    /************************ 用户 *************************/

    /**
     * 用户登录
     * POST
     */
    String LOGIN = "/login";

    /************************ 群组 *************************/

    /**
     * 群组列表
     * POST
     */
    String CHART_LIST = "/system/chart/group";

    /**
     * 查看群组消息
     * args1: 群组gid
     * GET
     */
    String CHART_MESSAGE = "/chart/enter/%s";

    /**
     * 创建群组
     * PUT
     */
    String GROUP_CREATE = "/chart/group";

}
