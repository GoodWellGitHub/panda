package com.org.hj.data.reflect.dyproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerDemo implements InvocationHandler {
    private Object object;//真正要代理的对象

    public InvocationHandlerDemo(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before Method ");
        System.out.println("Call Method : " + method);
        Object obj = method.invoke(object, args);
        System.out.println("after method");
        System.out.println();
        return obj;
    }
}
