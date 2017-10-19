package com.spring.mvc.dao;

import com.spring.mvc.model.ChowHoundModel;

/**
 * @author guojunguang
 * @date 2017/7/31
 * @decription
 */
public interface ChowHoundDao {
    /**
     * 根据用户名和密码登录
     * @param chowHound
     * @return
     */
    public int findChowHoundByName(ChowHoundModel chowHound);
}
