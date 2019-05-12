package com.org.hj.data.reflect.dyproxy;

public class RealSubject implements Subject {
    @Override
    public void hello(String str) {
        System.out.println("hello " + str);
    }

    @Override
    public String bye() {
        System.out.println("good bye");
        return "Over";
    }
}
