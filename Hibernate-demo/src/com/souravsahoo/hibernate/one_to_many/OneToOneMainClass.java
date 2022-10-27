package com.souravsahoo.hibernate.one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class OneToOneMainClass {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			Instructor tempInstructor = new Instructor("Sourav", "sahoo", "abc@gmail.com");
			InstructorDetail tempInstructorDetail =
					new InstructorDetail("http://www.souravsahoo.com/youtube", "coding");
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			session.beginTransaction();
			
			session.save(tempInstructor);
			
			session.getTransaction().commit();
			System.out.println("done");
		} finally{
			factory.close();
		}

	}

}
