package com.souravsahoo.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StoreDataToStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {

			// create student class object
			Student s1 = new Student("Sourav", "Sahoo", "abc@gmail.com");
			Student s2 = new Student("Jhon", "Doe", "foo@gmail.com");
			Student s3 = new Student("Scooby", "Drape", "scoop@yahoo.com");
			Student s4 = new Student("Jack", "kale", "jack.123@hotmail.com");
			Student s5 = new Student("Danny", "Hemsworth", "DanH@gmail.com");

			// start transaction
			session.beginTransaction();

			// save student object
			session.save(s1);
			session.save(s2);
			session.save(s3);
			session.save(s4);
			session.save(s5);

			// commit transaction
			session.getTransaction().commit();
			System.out.println("commit success!!");

		} finally {
			factory.close();
		}

	}

}
