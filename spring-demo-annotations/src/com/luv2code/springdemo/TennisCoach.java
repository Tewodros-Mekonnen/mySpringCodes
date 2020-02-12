package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*@Component("thatSillyCoach")*/ // this is called Explicit bean id

@Component // when we don't explicitly give a bean id, as shown above, spring will assign
			// default bean id
			// by making the first letter of the class small letter, e.x. tennisCoach
public class TennisCoach implements Coach {
	
	// we can also inject fields, we just need to add @Autowired above the field declaration. 
	//below I have commented the setFortuneServices method to enable field injection
	@Autowired
	private FortuneService fortuneService;

	// @Autowired
	/*
	 * public TennisCoach(FortuneService theFortuneService) { fortuneService =
	 * theFortuneService; }
	 */

	// commented constructor injection above, below, I will define a default
	// constructor and print out a message
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}

	// define a setter method
	// @Autowired
	/*
	 * public void setFortuneService(FortuneService theFortuneService) {
	 * System.out.println("TennisCoach: inside setter method"); fortuneService =
	 * theFortuneService; }
	 */

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
