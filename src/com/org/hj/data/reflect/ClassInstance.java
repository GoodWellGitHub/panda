package com.org.hj.data.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public class ClassInstance {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        /**
         * 判断某个类的实例
         */
        HashSet hashSet = new HashSet();
        if (hashSet instanceof Set) {
            System.out.println("hashSet is a HashSet");
        }
        if (HashSet.class.isInstance(hashSet)) {
            System.out.println("hashSet is ...");
        }

        /**
         * 创建对象实例
         */
        //1.用Class对象的newInstance（）方法
        Class<?> stringBuilderClass = StringBuilder.class;
        StringBuilder stringBuilder = (StringBuilder) stringBuilderClass.newInstance();
        stringBuilder.append("ab");
        System.out.println(stringBuilder.toString());
        //2.用Constructor对象的newInstance()方法
        Class<?> c2 = String.class;
        Constructor constructor = c2.getConstructor(java.lang.String.class);
        String cInstance = (String) constructor.newInstance("bbb");
        System.out.println(cInstance);
        Constructor constructor1 = c2.getConstructor();
        String string1 = (String) constructor1.newInstance();
        System.out.println("str"+string1);
    }
}
