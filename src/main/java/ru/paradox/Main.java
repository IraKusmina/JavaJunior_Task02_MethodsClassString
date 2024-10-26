package ru.paradox;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clazzString = Class.forName("java.lang.String");

        Method[] displayInfoMethod = clazzString.getMethods();
        for (Method method: displayInfoMethod){
            System.out.println(method.toString());
        }
    }
}