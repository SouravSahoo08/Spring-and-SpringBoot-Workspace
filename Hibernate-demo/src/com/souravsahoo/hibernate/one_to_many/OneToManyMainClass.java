package com.souravsahoo.hibernate.one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyMainClass {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			int id = 1;
			Instructor tempInstructor = session.get(Instructor.class, id);

			Course course1 = new Course("Java");
			Course course2 = new Course("Python");

			tempInstructor.add(course1);
			tempInstructor.add(course2);

			session.save(course1);
			session.save(course2);

			session.getTransaction().commit();
			System.out.println("done");
		} finally {
			session.close();
			factory.close();
		}

	}

}
