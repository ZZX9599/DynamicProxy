package com.zzx.test;

import com.zzx.proxy.ProxyFactory;
import com.zzx.service.Swimmable;
import com.zzx.service.impl.SwimmableImpl;

/**
 * @author ZZX
 * @version 1.0.0
 * @date 2023:04:21 10:47:12
 */

public class ProxyTest {
    public static void main(String[] args) {
        // 目标对象
        Swimmable swimmable = new SwimmableImpl();

        // 得到代理对象
        Swimmable proxy = (Swimmable)  ProxyFactory.returnProxyObjectNotInterface(swimmable);

        // 执行代理对象
        proxy.swim();
    }
}
