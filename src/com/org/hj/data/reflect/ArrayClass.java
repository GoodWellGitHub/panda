package com.org.hj.data.reflect;

import java.lang.reflect.Array;

public class ArrayClass {
    public static void main(String[] args) throws ClassNotFoundException{
        Class<?> str=Class.forName("java.lang.String");
        Object array= Array.newInstance(str,25);
        Array.set(array, 0, "Scala");
        Array.set(array, 1, "Java");
        Array.set(array, 2, "Groovy");
        Array.set(array, 3, "Scala");
        Array.set(array, 4, "Clojure");

        System.out.println(Array.get(array,3));

    }
}
