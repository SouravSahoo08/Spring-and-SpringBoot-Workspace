package com.souravsahoo.java_annotations_demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortuneList = {
			"Good day, have fun",
			"Stay alert, danger may arise",
			"sad day, all the best"
	};
	
	Random rand = new Random();
	
	@Override
	public String getFortune() {
		int index = rand.nextInt(fortuneList.length);
		return fortuneList[index];
	}

}
