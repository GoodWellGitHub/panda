package com.org.hj.data.test;

import com.org.hj.data.domain.Student;
import com.org.hj.data.reflect.InterfaceInstance;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by huajun.wang01 on 2018/12/12.
 */
public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Student student = new Student();
        student.setName("zh");

        Class stuClass = Student.class;
        Field[] fields = stuClass.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        Class interfaceClass = InterfaceInstance.class;
        Field field = interfaceClass.getField("hello");
        System.out.println(field);
        Method[] methods = interfaceClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("field hello value ");
        //
        InterfaceInstance instance = (InterfaceInstance) interfaceClass.newInstance();
        System.out.println(instance);
    }

}
