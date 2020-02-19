package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class. (comes from SportConfig.java class, we are not using xml, instead we are using .java file)
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		/* Coach theCoach = context.getBean("thatSillyCoach", Coach.class); */ // this is when we use explicit bean id, this bean 
																		      // id is assigned inside xml file

		Coach theCoach = context.getBean("swimCoach_2", Coach.class); // here we are using the default bean id which is
																		// name of the class "tennisCoach". we could also use bean id, that is defined 
																		// with in xml file. 

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}
