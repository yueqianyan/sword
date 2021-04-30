package com.jzq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jianzhiqiang
 * @date 2021/3/12 23:12
 */
@SpringBootApplication(scanBasePackages = "com.jzq")
//@MapperScan(basePackages = "com.jzq.service")123
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
