package com.org.hj.data.reflect.dyproxy;


import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandlerDemo invocationHandlerDemo = new InvocationHandlerDemo(subject);

        Subject proxySubject = (Subject) Proxy.newProxyInstance(invocationHandlerDemo.getClass().getClassLoader(), subject.getClass().getInterfaces(), invocationHandlerDemo);
        System.out.println(proxySubject.getClass().getName());
        proxySubject.hello("world");
        System.out.println(proxySubject.bye());
    }
}
