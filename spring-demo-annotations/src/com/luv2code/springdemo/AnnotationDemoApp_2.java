package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp_2 {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		SwimCoach theSwimCoach = context.getBean("swimCoach", SwimCoach.class);

		// call a method on the bean
		System.out.println(theSwimCoach.getDailyWorkout());
		System.out.println(theSwimCoach.getDailyFortune());
		System.out.println(theSwimCoach.getEmail());
		System.out.println(theSwimCoach.getTeam());

		// close the context
		context.close();

	}

}
