package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*@Component("thatSillyCoach")*/ // this is called Explicit bean id

@Component // when we don't explicitly give a bean id, as shown above, spring will assign
			// default bean id
			// by making the first letter of the class small letter, e.x. tennisCoach
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired 
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
