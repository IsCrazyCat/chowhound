//package com.spring.mvc.filter;
//
//import org.springframework.util.StringUtils;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @author guojunguang
// * @date 2017/7/31
// * @decription
// */
//@WebFilter(filterName = "LoginFilter",value = "/*")
//public class LoginFilter implements Filter {
//    public void destroy() {
//    }
//
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        HttpServletRequest request = (HttpServletRequest)req;
//        HttpServletResponse response = (HttpServletResponse)resp;
//        System.out.println("This is LoginFilter"+request.getRequestURL());
//        if(StringUtils.isEmpty(((HttpServletRequest) req).getSession().getAttribute("login"))){
//            req.getRequestDispatcher("/login/login").forward(request, response);//转发到apage.js
//        }
//        chain.doFilter(req, resp);
//    }
//
//    public void init(FilterConfig config) throws ServletException {
//
//    }
//
//}
