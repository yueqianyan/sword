package com.jzq.filter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author jianzhiqiang
 * @date 2021/4/19 10:42
 */
//@Component
public class ParamsFormFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String accept = request.getHeader("accept");
        String reqWith = request.getHeader("X-requested-with");
        if(StringUtils.isNotBlank(accept) && accept.equalsIgnoreCase("application/json")
            || StringUtils.isNotBlank(reqWith) && reqWith.equalsIgnoreCase("XMLHttpRequest")) {
            System.out.println("通过");
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            System.out.println("不通过");
//            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
