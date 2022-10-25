package com.souravsahoo.hibernate.demo.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrieveDataToStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			// get curreent session
			session = factory.getCurrentSession();
			// start transaction
			session.beginTransaction();
			
			//Retrieve particular student record
			int studentId = 5;

			// create Student object to store retrieved values from DB
			Student theStud = session.get(Student.class, studentId);
			System.out.println(theStud);

			//get all records
			System.out.println("\n Getting all student records:");
			List<Student> studentList = session.createQuery("from Student").getResultList();
			for(Student temp : studentList) {
				System.out.println(temp);
			}
			
			// commit transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}

	}

}
