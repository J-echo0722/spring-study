package com.mj.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author : MaJ
 * @date : 2021/11/30
 * @description ：注解方式实现 aop
 */

/**
 * 标注这个类是一个切面
 */
@Aspect
public class AnnotationPointCut {

    /** 切入点 */
    @Pointcut("execution(* com.mj.service.UserServiceImpl.*(..))")
    public void matchMethod() {
    }

    @Before(value = "matchMethod()")
    public void before() {
        System.out.println("========== 方法执行之前 ==========");
    }

    @Before(value = "matchMethod()")
    public void after() {
        System.out.println("========== 方法执行之后 ==========");
    }

    /**
     * 在环绕增强中，可以给定一个参数，代表要获取处理切入的点
     */
    @Around("execution(* com.mj.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        // 获得签名
        System.out.println("signature: " + joinPoint.getSignature());
        // 执行方法
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
    }
}
