package com.souravsahoo.Spring_Workspace_Project.demo1;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService theFortuneService) {
		System.out.println("Baseball : param constructor");
		fortuneService = theFortuneService;
	}

	@Override
	public String getWorkoutDetail() {
		return "Daily run for 1km";
	}

	@Override
	public String getFortuneDetail() {
		return fortuneService.getFortune();
	}

}
