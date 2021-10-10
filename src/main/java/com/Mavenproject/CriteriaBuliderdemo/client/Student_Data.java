package com.Mavenproject.CriteriaBuliderdemo.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.Mavenproject.CriteriaBuliderdemo.entity.Student;
import com.Mavenproject.CriteriaBuliderdemo.util.Hiberutil;

public class Student_Data 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
        //factory.getCurrentSession();
        try (Session session = Hiberutil.getSessionFactory().openSession()) 
        		{
			session.beginTransaction();
			// Insert Data in table
			
			Student st = new Student();
			st.setId(101);
			st.setName("Sakshi joshi");
			st.setAge(16);

			Student st1 = new Student();
			st1.setId(102);
			st1.setName("Mera Rajput");
			st1.setAge(16);
			
			Student st2 = new Student();
			st2.setId(103);
			st2.setName("Naradra Modi ");
			st2.setAge(15);
			
			session.save(st);
			session.save(st1);
			session.save(st2);
			
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
     }
    }
}

