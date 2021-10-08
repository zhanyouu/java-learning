package com.proxy.jdkDynamicProxy;

import com.proxy.staticProxy.SmsService;
import com.proxy.staticProxy.SmsServiceImp;

import java.lang.reflect.Proxy;

public class MainTest {
    public static void main(String[] args) {
//        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImp());
        SmsService smsService = (SmsService) Proxy.newProxyInstance(new SmsServiceImp().getClass().getClassLoader(),
                new SmsServiceImp().getClass().getInterfaces(),new SmsInvocationHandler(new SmsServiceImp()));
        smsService.send("java");
    }
}
/**
 * jdk动态代理
 * 生成代理实例需要传三个目标实例类加载器、目标实例接口、调度器
 * 调用smsService.send("java")方法时，会将该实例的方法method和参数agrs传入调度器SmsInvocationHandler中
 * 通过反射调用method.invoke(target,args)
 */
/**
 * 动态代理和静态代理的区别：
 * 静态代理每一个接口、都需要生成一个代理类；动态代理只用生成一个代理类（调度器），所有接口复用
 * 静态代理、代理类需要和目标类实现同一个接口；动态代理不需要
 * 静态代理在编译器生成、动态代理在运行期动态生成
 */