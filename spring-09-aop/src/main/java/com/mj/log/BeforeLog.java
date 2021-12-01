package com.mj.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author : MaJ
 * @date : 2021/11/30
 * @description ：前置通知
 */
public class BeforeLog implements MethodBeforeAdvice {
    /**
     * @param method 要执行的目标对象的方法
     * @param args  参数
     * @param target 目标对象
     */
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("【BeforeLog】执行了类的 " + target.getClass().getName() + " 的方法：" + method.getName());
    }
}
