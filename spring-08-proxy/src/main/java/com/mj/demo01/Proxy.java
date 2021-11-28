package com.mj.demo01;

public class Proxy implements Rent {

    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        this.host.rent();
        heTong();
        fare();
    }

    public void seeHouse() {
        System.out.println("中介带你看房子");
    }

    public void heTong() {
        System.out.println("中介带你签合同");
    }

    public void fare() {
        System.out.println("收中介费");
    }
}
