package com.souravsahoo.Spring_Workspace_Project.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("myCoach", Coach.class);
		System.out.println(myCoach.getWorkoutDetail());
		System.out.println(myCoach.getFortuneDetail());
		context.close();
	}

}
