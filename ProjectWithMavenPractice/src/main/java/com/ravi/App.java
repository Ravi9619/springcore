package com.ravi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate-cfg.xml");
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	Student st = new Student();
    	st.setStudent_id(100);
    	st.setStudent_name("abc");
    	st.setStudent_address("Mum");
    	
    	Session s = factory.openSession();
    	
    	Transaction tx = s.beginTransaction();
    	s.save(st);
    	tx.commit();
    	s.close();
    	factory.close();
    	
    	
    	
    }
}
