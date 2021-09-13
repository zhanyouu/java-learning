package com.proxy.cglibDynamicProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class SmsInterceptorHandler implements MethodInterceptor {
    /**
     * 代理中的真实对象
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
    //     */
    private final Object target;

    public SmsInterceptorHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before method:"+method.getName());
        Object result = method.invoke(target, args);
        System.out.println("after method:"+method.getName());
        return result;
    }
}
