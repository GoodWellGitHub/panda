package com.org.hj.data.reflect;

import java.util.HashSet;
import java.util.Set;

public class ClassInfo {

    enum E {
        AE, BE
    }

    public static void main(String[] args) throws Exception {

        /**
         *
         * 使用Class.forName获取类来反射对象的Class对象，必须知道类的全限定名
         */
        Class userClass = Class.forName("com.org.hj.data.domain.User");
        System.out.println(userClass.getCanonicalName());
        Class c2 = Class.forName("[D");
        System.out.println(c2.getCanonicalName());
        Class c3 = Class.forName("[[Ljava.lang.String;");
        System.out.println(c3.getCanonicalName());


        System.out.println("##################################");


        /**
         * 用类获取类的Class对象
         */
        Boolean b;
        // Class booleanClass = b.getClass();  编译错误
        Class booleanClass = Boolean.class;
        System.out.println(booleanClass);

        Class c12 = java.io.InputStream.class;
        System.out.println(c12);

        Class c13 = int[][][].class;
        System.out.println(c13);


        System.out.println("######################");


        /**
         * 调用Object的getClass方法
         */
        Class c20 = "foo".getClass();
        System.out.println(c20);
        Class c21 = E.AE.getClass();
        System.out.println(c21);

        byte[] bytes = new byte[12];
        Class c22 = bytes.getClass();
        System.out.println(c22);

        Set<String> sets = new HashSet<>();
        Class c23 = sets.getClass();
        System.out.println(c23);


    }
}
