package com.example.spring.Proj5Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Config.xml");
        
        Engine engobj1=(Engine)ctx.getBean("eng1");
        System.out.println(engobj1);
        
//        Engine engobj2=(Engine)ctx.getBean("eng2");
//        System.out.println(engobj2);
        
        Car carobj=(Car)ctx.getBean("cr");
        System.out.println(carobj);
    }
}
