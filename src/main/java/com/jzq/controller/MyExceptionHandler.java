package com.jzq.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author jianzhiqiang
 * @date 2021/4/30 9:33
 * 全局异常捕获
 */
//@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public void warn() {
        System.out.println("捕获到了异常");
    }
}
