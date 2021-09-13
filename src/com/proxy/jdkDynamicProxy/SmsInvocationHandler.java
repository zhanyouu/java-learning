package com.proxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SmsInvocationHandler implements InvocationHandler {
    /**
     * 代理中的真实对象
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
//     */
    private final Object target;

    public SmsInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method:"+method.getName());
        Object result = method.invoke(target,args);
        System.out.println("after method:"+method.getName());
        return result;
    }
}
