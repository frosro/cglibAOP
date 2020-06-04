package com.sy.demo1;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author sy
 * @data 22:49
 */
public class MyAdvice implements MethodBeforeAdvice {



    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置增强...");
    }
}
