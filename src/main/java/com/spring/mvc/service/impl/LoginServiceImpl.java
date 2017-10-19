package com.spring.mvc.service.impl;

import com.spring.mvc.dao.ChowHoundDao;
import com.spring.mvc.model.ChowHoundModel;
import com.spring.mvc.service.LoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author guojunguang
 * @date 2017/7/31
 * @decription
 */
@Service
public class LoginServiceImpl implements LoginService {
    private static final Logger logger = Logger.getLogger(LoginServiceImpl.class);

    @Autowired
    private ChowHoundDao chowHoundDao;

    public int login(ChowHoundModel chowHound) {
        return chowHoundDao.findChowHoundByName(chowHound);
    }
}
