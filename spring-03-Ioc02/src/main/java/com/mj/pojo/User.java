package com.mj.pojo;

/**
 * @author : MaJ
 * @date : 2021/11/26
 * @description ：
 */
public class User {
    private String name;

    public User() {
        System.out.println("User 的无参构造！");
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name = " + name);
    }
}
