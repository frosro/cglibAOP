package com.sy.proxyDemo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author sy
 * @data 21:08
 */
public class CGlibProxy implements MethodInterceptor {

    private Object target;

    public CGlibProxy(Object target) {
        this.target = target;
    }

   public Object getProxy(){

       Enhancer enhancer = new Enhancer();

       enhancer.setSuperclass(target.getClass());

       enhancer.setCallback(this);

       return enhancer.create();

   }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("前");
        Object result = method.invoke(target, objects);
        System.out.println("后");
        return result;
    }
}
