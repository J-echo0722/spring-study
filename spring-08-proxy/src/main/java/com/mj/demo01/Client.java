package com.mj.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        // 原来直接找房东
        // host.rent();

        // 中介代理房东，帮房东出租房子，但中介一般会有一些自己但附属操作
        Proxy proxy = new Proxy(host);
        // 不用面对房东，直接找中介租房
        proxy.rent();
    }
}
