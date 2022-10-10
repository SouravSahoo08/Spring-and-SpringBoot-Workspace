package com.souravsahoo.java_config_code_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaCodeConfigRunner {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrive bean
		Coach theCoach = context.getBean("swimCoach",Coach.class);
		//call method
		System.out.println(theCoach.getWorkoutDetail());
		System.out.println(theCoach.getFortuneDetail());
		//close context
		context.close();
	}

}
