package com.souravsahoo.java_annotations_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	
	 //HappyFortuneService   randomFortuneService
	private FortuneService fortuneService;
	
	@Autowired
	public BaseballCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getWorkoutDetail() {
		return "Do catch practice";
	}

	@Override
	public String getFortuneDetail() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
