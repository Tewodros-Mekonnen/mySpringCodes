package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// get the bean from spring container
		/* Coach theCoach = context.getBean("thatSillyCoach", Coach.class); */ // this is when we use explicit bean id
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class); // here we are using the default bean id which is name of the class "tennisCoach"
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
