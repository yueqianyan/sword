package com.jzq.bean;

import org.springframework.context.annotation.Bean;

/**
 * @author jianzhiqiang
 * @date 2021/3/12 23:30
 */
public class Rate {
    private int id;
    private String name;
    private int ability;
    private String designation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
