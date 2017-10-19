package com.spring.mvc.service.impl;

import com.spring.mvc.dao.TestDao;
import com.spring.mvc.model.Test;
import com.spring.mvc.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author guojunguang
 * @date 2017/7/19
 * @decription
 */
@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestDao testDao;

    public List<Test> getAllTest() {
        return testDao.selectAllUser();
    }

    public Test getTestByPhoneOrEmail(String emailOrPhone, Short state) {
        return testDao.selectUserByPhoneOrEmail(emailOrPhone,state);
    }

    public Test getTestById(Long testId) {
        return testDao.selectUserById(testId);
    }
}
