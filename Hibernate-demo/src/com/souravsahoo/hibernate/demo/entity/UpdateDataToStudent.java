package com.souravsahoo.hibernate.demo.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateDataToStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			// get curreent session
			session = factory.getCurrentSession();
			// start transaction
			session.beginTransaction();

			//method 1
			//Retrieve particular student record
			int studentId = 5;

			// create Student object to store retrieved values from DB
			Student theStud = session.get(Student.class, studentId);
			theStud.setLastName("Jenkins");
			
			
			//method 2
			session.createQuery("update Student set email = 'danny.jenkins@gmail.com'"+
			"where id = 5").executeUpdate();
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("done");

		} finally {
			factory.close();
		}

	}

}
