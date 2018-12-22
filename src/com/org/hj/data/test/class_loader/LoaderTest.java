package com.org.hj.data.test.class_loader;

import com.org.hj.data.class_loader.SimpleClassLoader;

/**
 * Created by huajun.wang01 on 2018/12/12.
 */
public class LoaderTest {
    public static void main(String[] args) throws ClassNotFoundException{
        SimpleClassLoader simpleClassLoader=new SimpleClassLoader();
        Class<?> aclass=simpleClassLoader.loadClass("JDK.Array.Man1");
        System.out.println(aclass);
    }
}
