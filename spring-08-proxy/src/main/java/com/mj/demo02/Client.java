package com.mj.demo02;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        Proxy proxy = new Proxy();
        proxy.setUserService(userService);

        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
    }
}
