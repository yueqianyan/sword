package com.jzq.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @author jianzhiqiang
 * @date 2021/4/19 9:14
 * 登录过滤器
 */
//@Component
public class LoginFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(LoginFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("****** 登录过滤器初始化 ******");
    }

    /**
     * @author jian zhi qiang
     * @date 2020-09-07 17:02:50
     * @description 获取参数
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("****** 执行登录过滤器 ******");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        logger.info("****** 过滤器已销毁 ******");
    }
}
