package com.spring.mvc.service;

import com.spring.mvc.model.ChowHoundModel;

/**
 * @author guojunguang
 * @date 2017/7/31
 * @decription
 */
public interface LoginService {
    /**
     * 用户登录
     * @param chowHound
     * @return
     */
    public int login(ChowHoundModel chowHound);
}
