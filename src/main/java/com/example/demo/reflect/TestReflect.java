package com.example.demo.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        /**
         * 获取TargetObject类的Class对象并且创建TargetObject类实例
         */
        Class<TargetObject> targetObjectClass = TargetObject.class;
        TargetObject targetObject = targetObjectClass.newInstance();

        Class<?> aClass = Class.forName("com.example.demo.reflect.TargetObject");
        TargetObject object = (TargetObject) aClass.newInstance();

        TargetObject targetObj = new TargetObject();
        Class<? extends TargetObject> objClass = targetObj.getClass();
        String name = objClass.getName();
        System.out.println("---" + name);

        /**
         * 获取类中所有定义的方法
         */
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }

        /**
         * 获取指定方法并调用
         */
        Method publicMethod = targetObjectClass.getDeclaredMethod("publicMethod", String.class);
        publicMethod.invoke(object, "javaReflect");

        /**
         * 获取指定参数并对参数进行修改
         */
        Field value = aClass.getDeclaredField("value");
        //为了对类中的参数进行修改我们取消安全检查
        value.setAccessible(true);
        value.set(object, "javaReflectValue");

        /**
         * 调用private方法
         */
        Method privateMethod = aClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(object);
    }
}
