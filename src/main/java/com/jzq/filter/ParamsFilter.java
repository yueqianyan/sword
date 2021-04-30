package com.jzq.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
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
 * 参数过滤器
 */
//@Component
public class ParamsFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(ParamsFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("****** 参数过滤器初始化 ******");
    }

    /**
     * @author jian zhi qiang
     * @date 2020-09-07 17:02:50
     * @description 获取参数
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("****** 执行参数过滤器 ******");
        StringBuilder sb = new StringBuilder();
        InputStream inputStream = null;
        BufferedReader reader = null;
        try {
            inputStream = servletRequest.getInputStream();  // 获取输入流。
            reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            String str;
            while ((str = reader.readLine()) != null) {
                sb.append(str + "\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb.toString());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        logger.info("****** 过滤器已销毁 ******");
    }
}
