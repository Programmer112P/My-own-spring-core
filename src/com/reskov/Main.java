package com.reskov;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello spring!");
//        BeanFactory beanFactory = new BeanFactory();
//        beanFactory.addPostProcessor(new CustomPostProcessor());
//        //Создание бинов
//        beanFactory.instantiate("com.reskov");
//        //Внедрение зависимостей
//        beanFactory.populateProperties();
//        //Метод init после внедрения зависимостей
//        beanFactory.initializeBeans();
//
//
//        beanFactory.injectBeanNames();
//        beanFactory.injectFactory();

        ApplicationContext applicationContext = new ApplicationContext("com.reskov");
        applicationContext.close();
    }
}