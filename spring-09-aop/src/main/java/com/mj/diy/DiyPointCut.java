package com.mj.diy;

/**
 * @author : MaJ
 * @date : 2021/11/30
 * @description ：自定义切面类
 */
public class DiyPointCut {
    public void before() {
        System.out.println("========== 方法执行之前 ==========");
    }
    public void after() {
        System.out.println("========== 方法执行之后 ==========");
    }
}
