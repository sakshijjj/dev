package com.Mavenproject.CriteriaBuliderdemo.client;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.query.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.Mavenproject.CriteriaBuliderdemo.entity.Student;
import com.Mavenproject.CriteriaBuliderdemo.util.Hiberutil;

public class StudentQuery {
public static void main(String[] args) {
	
	try (Session session = Hiberutil.getSessionFactory().openSession()) {
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Student> criteriaQuery = builder.createQuery(Student.class);
		Root<Student> root = criteriaQuery.from(Student.class);
		criteriaQuery.select(root);
		
		criteriaQuery.where(builder.equal(root.get("name"),"Sakshi Joshi"));
		criteriaQuery.having(builder.equal(root.get("id"), 102));
		
		Query<Student> query = session.createQuery(criteriaQuery);
		List<Student> stList = query.list();
		stList.forEach(System.out::println);// method refrence in java 8
	} catch (HibernateException e) {
		e.printStackTrace();
	}
	System.out.println("/////////////////// Result Second ///////////////////////////");

	try (Session session = Hiberutil.getSessionFactory().openSession()) {
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<String> criteriaQuery = builder.createQuery(String.class);
		Root<Student> root = criteriaQuery.from(Student.class);
		criteriaQuery.select(root.get("name"));
		Query<String> Criquery = session.createQuery(criteriaQuery);
		List<String> list = Criquery.list();
		list.forEach(System.out::println);// method reference in java 8
	} catch (HibernateException e) {
		e.printStackTrace();
	}	
}	
}
