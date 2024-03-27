package com.learn.hibernate.HibernateProject2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Technology t1=new Technology();
    	Technology t2=new Technology();
    	Technology t3=new Technology();
    	
    	
    	SoftwareEng se1=new SoftwareEng();
    	SoftwareEng se2=new SoftwareEng();
    	SoftwareEng se3=new SoftwareEng();
    	
    	
    	List<Technology>techList1=new ArrayList<Technology>();
    	techList1.add(t1);
    	techList1.add(t2);
    	
    	
    	List<Technology>techList2=new ArrayList<Technology>();
    	techList2.add(t1);
    	techList2.add(t2);
    	techList2.add(t3);
    	
    	List<Technology>techList3=new ArrayList<Technology>();
    	techList3.add(t1);
    	techList3.add(t3);
    	
    	List<SoftwareEng>seList1=new ArrayList<SoftwareEng>();
    	seList1.add(se1);
    	seList1.add(se2);
    	seList1.add(se3);
    	
    	List<SoftwareEng>seList2=new ArrayList<SoftwareEng>();
    	seList2.add(se1);
    	seList2.add(se2);
    	
    	
    	List<SoftwareEng>seList3=new ArrayList<SoftwareEng>();
    	seList3.add(se1);
    	
    	
    	t1.setT_id(1);
    	t1.setT_name("JAVA");
    	t1.setSe(seList1);
    	
    	t2.setT_id(2);
    	t2.setT_name("HTML");
    	t2.setSe(seList2);
    	
    	t3.setT_id(3);
    	t3.setT_name("SQL");
    	t3.setSe(seList3);
    	
    	se1.setId(4);
    	se1.setName("navya");
    	se1.setAge(23);
    	se1.setTech(techList1);
    	
    	se2.setId(5);
    	se2.setName("Sachin");
    	se2.setAge(24);
    	se2.setTech(techList2);
    	
    	se3.setId(6);
    	se3.setName("sourav");
    	se3.setAge(25);
    	se3.setTech(techList3);
    	
    	
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        
        
        session.save(t1);
        session.save(t2);
        session.save(t3);
        session.save(se1);
        session.save(se2);
        session.save(se3);
        
        tr.commit();
        System.out.println("Obejcts are saved");
    }
}
