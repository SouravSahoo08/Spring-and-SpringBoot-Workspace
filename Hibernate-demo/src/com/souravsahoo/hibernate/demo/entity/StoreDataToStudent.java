package com.souravsahoo.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StoreDataToStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			//create student class object
			Student student = new Student(1,"Sourav", "Sahoo", "abc@gmail.com");
			
			//start transaction
			session.beginTransaction();
			
			//save student object
			session.save(student);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("commit success!!");
			
		}finally{
			factory.close();
		}

	}

}
