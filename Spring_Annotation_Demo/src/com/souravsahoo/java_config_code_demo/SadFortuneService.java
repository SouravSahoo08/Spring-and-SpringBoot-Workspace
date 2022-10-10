package com.souravsahoo.java_config_code_demo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "today is a Lucky day";
	}

}
