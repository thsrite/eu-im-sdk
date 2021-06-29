package com.eu.im.sdk.client;

import com.eu.im.sdk.constants.ImConstants;
import com.eu.im.sdk.model.dto.GroupCreateDto;
import com.eu.im.sdk.model.dto.GroupListDto;
import com.eu.im.sdk.utils.HttpUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 即时通信客户端
 */
@Slf4j
public class ImClient {

    /**
     * 请求端点
     */
    private final String endpoint;

    /**
     * 请求token
     */
    private final String token;


    /**
     * 实例化客户端
     *
     * @param endpoint
     * @param token
     */
    public ImClient(String endpoint, String token) {
        this.endpoint = endpoint;
        this.token = token;
    }

    /**
     * 用户登录
     * 返回用户token，用于请求其他接口及连接websocket
     */
    public String login() {
        return HttpUtil.INSTANCE.post(this.endpoint + ImConstants.LOGIN, null, null, String::valueOf);
    }

    /**
     * 群组列表
     * 查询所有
     */
    public String chartList() {
        return this.chartList(null);
    }

    /**
     * 群组列表
     * 条件检索群组列表
     *
     * @param queryStr 群组检索内容
     */
    public String chartList(String queryStr) {
        return HttpUtil.INSTANCE.post(this.endpoint + ImConstants.CHART_LIST, this.token, new GroupListDto(queryStr), String::valueOf);
    }

    /**
     * 查看群组消息
     *
     * @param gid 群组gid
     */
    public String chartMessage(Long gid) {
        return HttpUtil.INSTANCE.get(this.endpoint + String.format(ImConstants.CHART_MESSAGE, gid), this.token, String::valueOf);
    }

    /**
     * 创建群组
     *
     * @param groupName 群组名称
     * @param uidList   群成员uid列表
     */
    public String groupCreate(String groupName, List<Long> uidList) {
        return HttpUtil.INSTANCE.put(this.endpoint + ImConstants.GROUP_CREATE, this.token, new GroupCreateDto(groupName, uidList), String::valueOf);
    }

}
