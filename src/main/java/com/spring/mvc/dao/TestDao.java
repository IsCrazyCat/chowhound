package com.spring.mvc.dao;

import com.spring.mvc.model.Test;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author guojunguang
 * @date 2017/7/19
 * @decription
 */
@Repository
public interface TestDao {
    Test selectUserById(@Param("userId") Long userId);

    Test selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone, @Param("state") Short state);

    List<Test> selectAllUser();
}
