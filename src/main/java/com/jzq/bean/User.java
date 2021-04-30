package com.jzq.bean;

import java.io.Serializable;

/**
 * @author jianzhiqiang
 * @date 2021/3/22 22:39
 */
public class User implements Serializable {
    private static final long serialVersionUID = -6849794472222267710L;
    private String name;
    private String password;
    private String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
