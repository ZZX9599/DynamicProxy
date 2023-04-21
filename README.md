# README

JDK 动态代理是非常非常重要的，后面的框架都会使用到动态代理的机制，学习动态代理是后面学习框架的基础，例如Spring的AOP，SpringMVC的拦截器，SpringSecurity的权限认证，AspectJ的各种通知等，这里主要是记录一下原生的JDK动态代理的写法，打好基础便于后续的理解，主要涉及



- Proxy.newProxyInstance 的使用
- InvocationHandler 的使用