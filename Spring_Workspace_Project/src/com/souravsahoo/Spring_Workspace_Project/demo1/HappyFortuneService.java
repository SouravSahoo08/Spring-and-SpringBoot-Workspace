package com.souravsahoo.Spring_Workspace_Project.demo1;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return fortuneArray[generateRandomIndex()];
	}

	private static int generateRandomIndex() {
		return (int) ((Math.random() * (fortuneArray.length - 0)) + 0);
	}
	
}
