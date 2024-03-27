package com.example.spring.Proj4Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Config.xml");
        
        Employee empobj=(Employee)ctx.getBean("emp");
        
        System.out.println(empobj);
    }
}
