package com.example.spring.Proj2Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext cxt=new ClassPathXmlApplicationContext("Config.xml");
        
        Laptop ltobj=(Laptop)cxt.getBean("lt");
        System.out.println(ltobj);
        		
        Laptop ltobj1=(Laptop)cxt.getBean("lt1");
        System.out.println(ltobj1);
    }
}
