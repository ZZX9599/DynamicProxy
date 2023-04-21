package com.zzx.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ZZX
 * @version 1.0.0
 * @date 2023:04:21 10:39:51
 */

public class ProxyFactory {

    /**
     * 返回动态代理对象，参数是某个接口的实现类
     * @param target
     * @return
     */
    public static Object returnProxyObjectNotInterface(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("业务执行之前先唱一会");
                System.out.println("业务执行之前先跳一会");

                // 执行实现类的业务
                Object result = method.invoke(target, args);

                System.out.println("业务执行之后先打一会篮球");
                return result;
            }
        });
    }
}
