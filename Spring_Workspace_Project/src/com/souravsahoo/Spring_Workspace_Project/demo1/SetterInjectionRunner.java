package com.souravsahoo.Spring_Workspace_Project.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionRunner {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context 
			= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		
		System.out.println(myCoach.getEmailAddress());
		System.out.println(myCoach.getTeam());
		context.close();
	}

}
