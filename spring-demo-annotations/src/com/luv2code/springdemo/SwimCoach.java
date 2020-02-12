package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	// This class demonstrates injecting properties file using Java annotations
	// We have to create the file inside src folder. In the xml config file
	// (applicationContext.xml),
	// we will add the following lines; <context:property-placeholder
	// location="classpath:sport.properties"/>,
	// add this below <context:component-scan.../> line. Then add the
	// @Value("${variable name inside the property file, e.x email or team}")

	@Value("${email}")
	private String email;

	@Value("${team}")
	private String team;

	@Override
	public String getDailyWorkout() {

		return "SwimCoach: inside getDailyworkout method!";
	}

	@Override
	public String getDailyFortune() {

		return "SwimCoach: inside getDailyFortune method!";
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
