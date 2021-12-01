package com.mj.demo04;

import com.mj.demo02.UserService;
import com.mj.demo02.UserServiceImpl;

/**
 * @author : MaJ
 * @date : 2021/11/30
 * @description ：
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserService userService = new UserServiceImpl();
        // 代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置要代理的对象
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
    }
}
