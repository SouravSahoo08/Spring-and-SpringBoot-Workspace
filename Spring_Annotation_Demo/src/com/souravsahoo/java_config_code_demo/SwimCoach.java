package com.souravsahoo.java_config_code_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SwimCoach implements Coach {
	@Autowired
	private FortuneService fortuneService;

	public SwimCoach() {

	}

	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getWorkoutDetail() {
		// TODO Auto-generated method stub
		return "swim 1km";
	}

	@Override
	public String getFortuneDetail() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
