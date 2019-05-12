package com.org.hj.data.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassConstructor {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Constructor<?>[] constructors = String.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("名称:" + constructor.getName() + " 返回参数:" + constructor.getAnnotatedReturnType());
        }

        Constructor<?>[] publicConstructors = String.class.getConstructors();
        for (Constructor constructor : publicConstructors) {
            System.out.println("公共类：" + constructor);
        }

        Constructor stringConstructor = String.class.getConstructor(String.class);
        System.out.println("String的构造方法： " + stringConstructor);

        String as = (String) stringConstructor.newInstance("abx");
        System.out.println(as);

    }
}
