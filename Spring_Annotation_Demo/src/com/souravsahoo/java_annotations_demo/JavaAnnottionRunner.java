package com.souravsahoo.java_annotations_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaAnnottionRunner {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean
		Coach theCoach = context.getBean("baseballCoach",BaseballCoach.class);
		//call method
		System.out.println(theCoach.getWorkoutDetail());
		System.out.println(theCoach.getFortuneDetail());
		//close context
		context.close();
	}

}
