package com.mj.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author : MaJ
 * @date : 2021/11/30
 * @description ：带有返回的后置通知
 */
public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("【AfterLog】执行了 " + method.getName() + " 返回结果为： " + returnValue);
    }
}
