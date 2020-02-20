package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;


public class SwimCoach_2 implements Coach {

	private FortuneService fortuneService;
	
	// defining variables to inject values from properties file (sport.property). we added @PropertySource("classpath:sport.properties")
	// inside SportConfig.java file and here we add @Value annotation.
	@Value("${email}")
	private String email;
	
	@Value("${team}")
	private String team;

	public SwimCoach_2(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Swim 1000 meters as a warm up!";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
