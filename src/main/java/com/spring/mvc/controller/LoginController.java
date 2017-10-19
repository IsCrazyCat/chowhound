package com.spring.mvc.controller;

import com.spring.mvc.dto.response.ResponseDTO;
import com.spring.mvc.enums.ResponseEnum;
import com.spring.mvc.model.ChowHoundModel;
import com.spring.mvc.service.impl.LoginServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 * @author guojunguang
 * @date 2017/7/31
 * @decription 登录相关Controller
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Inject
    private LoginServiceImpl loginServiceImpl;

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String goLogin(){
        return "/login/login";
    }

    /**
     * 登陆
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<String> doLogin(ChowHoundModel chowHound, HttpServletRequest request){
        ResponseDTO<String> responseDTO = new ResponseDTO<String>();
        try {
            if (null != chowHound && "" != chowHound.getName() && "" != chowHound.getPassword()
                    && loginServiceImpl.login(chowHound) > 0){
                request.getSession().setAttribute("username",chowHound.getName());
                LOGGER.info("INFO LoginController doLogin POST login success");
                responseDTO.setCode(ResponseEnum.SUCCESS.getCode());
            }
        } catch (Exception e){
            LOGGER.error("ERROR LoginController doLogin POST Exception:{}",e);
        }
        return responseDTO;
    }
}
