package com.jzq.interceptor;

import com.jzq.filter.LoginFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jianzhiqiang
 * @date 2021/4/19 10:07
 */
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {
    Logger logger = LoggerFactory.getLogger(LoginFilter.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("###### 方法前执行 ######");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("###### 方法后执行 ######");
    }
}
