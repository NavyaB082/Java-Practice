package com.example.spring.Proj3Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Config.xml");
        
        Employee emp1obj=(Employee)ctx.getBean("emp1");
        System.out.println(emp1obj);
        
        Employee emp2obj=(Employee)ctx.getBean("emp2");
        System.out.println(emp2obj);
        
        Company cmpobj=(Company)ctx.getBean("cmp");
        System.out.println(cmpobj);
        
    }
}
