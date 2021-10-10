package com.Mavenproject.CriteriaBuliderdemo.client;

import java.util.ArrayList;
import java.util.List;
import com.Mavenproject.CriteriaBuliderdemo.entity.Student;
import com.Mavenproject.CriteriaBuliderdemo.util.Hiberutil;
import com.Mavenproject.CriteriaBuliderdemo.warpper.Studentwarpper;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;;

public class StudentMultiplevalues {

	public static void main(String[] args) {

		
		try (Session session = Hiberutil.getSessionFactory().openSession()) {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Studentwarpper> criteriaQuery = builder.createQuery(Studentwarpper.class);
			
			Root<Student> root = criteriaQuery.from(Student.class);// more than one Query
			
			criteriaQuery.multiselect(root.get("name"),root.get("age"));
			
			Query<Studentwarpper> query = session.createQuery(criteriaQuery);
			
//	    List<Student> stList = query.list();
//			for(Student objs :stList)
//			{
//				System.out.println(objs.getAge());
//			    System.out.println(objs.getName());
//			    
//			}
			//System.out.println(stList.toString());

			List<Studentwarpper> query1 = new ArrayList<Studentwarpper>();
			
			for(Studentwarpper objs :query1)
			{
			Studentwarpper stwapper = new Studentwarpper();
			  stwapper.setAge(objs.getAge());
			  stwapper.setName(objs.getName());
			  query1.add(stwapper);
			
			}
			System.out.println(query1);
			//System.out.println(stwapper1);
//			System.out.println(stwapper2);
			
		} catch (HibernateException e) {
			e.printStackTrace();
			
    }
  }
}

