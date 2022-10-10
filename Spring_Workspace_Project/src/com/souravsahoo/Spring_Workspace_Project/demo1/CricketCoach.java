package com.souravsahoo.Spring_Workspace_Project.demo1;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress, team;

	public CricketCoach() {
		System.out.println("CricketCoach : no arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : fortune service - Setter method");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : emailAddress - Setter method");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : team - Setter method");
		this.team = team;
	}

	@Override
	public String getWorkoutDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFortuneDetail() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
