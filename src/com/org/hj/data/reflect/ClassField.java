package com.org.hj.data.reflect;

import java.lang.reflect.Field;
import java.util.List;

public class ClassField {
    class FieldSpy<T> {
        public Boolean[][] b = {{false, false}, {true, true}};
        public String name = "stringName";
        public Integer integer = 12;
        public int anInt = 30;
        public List<String> arrList;
        public T val;
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Field field = FieldSpy.class.getField("b");
        System.out.format("Type %s%n", field.getType());
        Field strField = FieldSpy.class.getField("integer");
        System.out.println(strField.getType());
        Field anIntField = FieldSpy.class.getField("anInt");
        System.out.println(anIntField.getType());
        Field arrListField = FieldSpy.class.getField("arrList");
        System.out.println(arrListField.getType());
        Field valField = FieldSpy.class.getField("val");
        System.out.println(valField.getType());
    }
}
