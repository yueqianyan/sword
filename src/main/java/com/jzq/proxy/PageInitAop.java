package com.jzq.proxy;

import com.jzq.bean.Page;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

/**
 * @author jianzhiqiang
 * @date 2021/3/22 21:34
 */

@Aspect
@Component
public class PageInitAop {
    @Pointcut("execution(* com.jzq.service.SwordService.selectSword(..))")
    public void beforeService() {}

    @Before(value = "beforeService()")
    public void pageInit(JoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        Map<String, Object> map = (Map<String, Object>) args[0];
        Page page = Page.getInstance();
        // 分页查询
        // 当前页页码
        int current = (Integer) Optional.ofNullable(map.get("current")).orElse(Optional.of(0));
        // 每页显示数
        int size = (Integer) Optional.ofNullable(map.get("size")).orElse(Optional.of(0));

        if(current != 0 && size != 0) {
            // 设置 limit 两个参数。
            page.setBeginIndex((current - 1) * size);
            page.setSize(size);
        }
    }



}
