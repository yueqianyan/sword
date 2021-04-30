package com.jzq.proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author jianzhiqiang
 * @date 2021/3/22 22:12
 */
@Aspect
@Component
public class LoginAop {
    @Pointcut("execution(* com.jzq.controller.*.*(..))")
    public void beforeController() {}

    @Before(value = "beforeController()")
    public void login() {
        System.out.println("请先登录");
    }
}
