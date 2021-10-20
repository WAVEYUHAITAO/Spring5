package com.hito.diy;
//使用注解方式实现aop

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.hito.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }

    @After("execution(* com.hito.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.hito.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名："+jp.getSignature());//获取签名
        //执行方法
        Object proceed = jp.proceed();

        System.out.println("环绕后");
    }
}