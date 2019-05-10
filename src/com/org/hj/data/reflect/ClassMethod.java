package com.org.hj.data.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassMethod {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method[] methods = System.class.getDeclaredMethods();
        System.out.println("\n\nSystem的method清单.........");
        for (Method method1 : methods) {
            System.out.println(method1);
        }
        Method[] publicMethods = System.class.getMethods();
        System.out.printf("\n\nSystem 的public method清单.......\n");
        for (Method publicMethod : publicMethods) {
            System.out.println(publicMethod);
        }
        System.out.println("\n\n获取当前时间............");
        Method method = System.class.getMethod("currentTimeMillis");
        System.out.println(method);
        System.out.println(method.invoke(method, null));
    }
}
