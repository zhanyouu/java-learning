package com.pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象工厂, 用来获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {
    // 火车站对象
    private TrainStation station = new TrainStation();
    // 获取代理对象
    public TrainStation getProxyObject() {
        // 创建Enhancer对象,类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象(指定父类)
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    /**
     *
     * @param o 代理对象
     * @param method 真实对象中的方法的Method实例
     * @param objects 实际参数
     * @param methodProxy 代理对象中的方法的method实例
     * @return 方法执行结果
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取一定的服务费用(Cglib代理)");
        // 要调用目标对象的方法
        Object invoke = method.invoke(station, objects);
        return invoke;
    }
}
