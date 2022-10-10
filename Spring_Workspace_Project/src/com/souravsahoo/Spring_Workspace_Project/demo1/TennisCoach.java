package com.souravsahoo.Spring_Workspace_Project.demo1;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkoutDetail() {
		return "jump 100 times";
	}

	@Override
	public String getFortuneDetail() {
		return "Today is :" + fortuneService.getFortune();
	}

}
