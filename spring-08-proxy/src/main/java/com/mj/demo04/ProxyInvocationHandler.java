package com.mj.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : MaJ
 * @date : 2021/11/29
 * @description ：代理调用程序，用该类自动生成代理类
 */
public class ProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的接口
     */
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 生成得到代理类
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * 处理代理实例，并返回结果
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 动态代理的本质就是使用反射机制
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg) {
        System.out.println("执行了 " + msg + " 方法");
    }

}
