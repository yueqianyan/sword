package com.jzq.controller;

import com.alibaba.fastjson.JSON;
import com.jzq.bean.User;
import com.jzq.dao.LoginMapper;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Optional;

/**
 * @author jianzhiqiang
 * @date 2021/3/22 22:22
 */
@RestController
public class LoginController {
    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private LoginMapper loginMapper;

    @PostMapping("/login")
    public String loginVerify(@RequestBody Map<String, String> map) {
        String name = Optional.ofNullable(map.get("name")).orElse("");
        String password = Optional.ofNullable(map.get("password")).orElse("");
        // 从数据库中查询用户信息
        User user = loginMapper.selectUserInfo(name, password);
        if(user != null) {
            String userJson = JSON.toJSONString(user);
            redisTemplate.opsForHash().put("token", "user", user.getName());
            return "登录成功";
        }
        return "登录失败";
    }
}
