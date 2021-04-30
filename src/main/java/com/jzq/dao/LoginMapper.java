package com.jzq.dao;

import com.jzq.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author jianzhiqiang
 * @date 2021/3/22 22:37
 */
@Mapper
public interface LoginMapper {
    User selectUserInfo(@Param("name") String name, @Param("password") String password);
}
