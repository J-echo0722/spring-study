package com.mj.demo03;

/**
 * @author : MaJ
 * @date : 2021/11/29
 * @description ：
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();
        // 代理角色，现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);
        // 这里的 proxy 就是动态生产的，我们没自己生成
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
