package com.org.hj.data.class_loader;

import com.org.hj.data.test.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by huajun.wang01 on 2018/12/12.
 */
public class SimpleClassLoader extends ClassLoader {
    //加载class类的入口就是这个方法，在双亲委派机制中，如果父加载器的findClass方法找不到类时，最后就会执行本方法
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        InputStream map = Test.class.getResourceAsStream("Test.class");
        try {
            byte[] bytes = new byte[map.available()];
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

}
