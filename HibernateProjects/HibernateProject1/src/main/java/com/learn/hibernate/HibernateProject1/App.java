package com.learn.hibernate.HibernateProject1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        
        Person p1=new Person();
        Person p2=new Person();
        
        Bike b1=new Bike(1,"honda",35000,p1);
        
        Bike b2=new Bike(2,"hero",45000,p2);
        
	    p1.setP_id(1);
	    p1.setP_name("navya");
	    p1.setP_age(23);
	    p1.setB(b1);
	       
	    p2.setP_id(2);
	    p2.setP_name("nav");
	    p2.setP_age(24);
	    p2.setB(b2);
        
        
        session.save(p1);
        session.save(p2);
        session.save(p1);
        session.save(p2);
        
        session.flush();
        
        tr.commit();
        System.out.println("Objects are saved.");
        
    }
}
