package com.jzq.service;

import com.jzq.Application;
import com.jzq.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author jianzhiqiang
 * @date 2021/4/19 14:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MyTest {

    @Test
    public void contextLoads() {
        throw new RuntimeException();
    }
}
