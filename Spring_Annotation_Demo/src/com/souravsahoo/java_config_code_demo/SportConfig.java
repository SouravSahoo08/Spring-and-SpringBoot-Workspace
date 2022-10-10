package com.souravsahoo.java_config_code_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

	// Bean for SadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// bean for SwimCoach
	@Bean
	public Coach swimCoach() {
		return new SwimCoach();
		//return new SwimCoach(sadFortuneService());
	}

}
