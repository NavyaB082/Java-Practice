package com.example.spring.Proj1Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        Student stobj=(Student)ctx.getBean("st");
        System.out.println(stobj);
        
        JavaTeacher jtobj=(JavaTeacher)ctx.getBean("jt");
        System.out.println(jtobj);
        
        PythonTeacher ptobj=(PythonTeacher)ctx.getBean("pt");
        System.out.println(ptobj);
        
        SqlTeacher stobj1=(SqlTeacher)ctx.getBean("st1");
        System.out.println(stobj1);
    }


}
