package com.spring.mvc.service;

import com.spring.mvc.model.Test;

import java.util.List;

/**
 * @author guojunguang
 * @date 2017/7/19
 * @decription
 */
public interface TestService {
    List<Test> getAllTest();

    Test getTestByPhoneOrEmail(String emailOrPhone, Short state);

    Test getTestById(Long testId);
}
