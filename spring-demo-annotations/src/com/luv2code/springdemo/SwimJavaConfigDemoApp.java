package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class. (comes from SportConfig.java class, we are not using xml, instead we are using .java file)
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		/* Coach theCoach = context.getBean("thatSillyCoach", Coach.class); */ // this is when we use explicit bean id, this bean 
																		      // id is assigned inside xml file

		//Coach theCoach = context.getBean("swimCoach_2", Coach.class); // here we are using the default bean id which is
																		// name of the class "tennisCoach". we could also use bean id, that is defined 
																		// with in xml file. 
		
		// getting another bean using SwimCoach_2 class so that we can access methods that are not defined inside Coach interface. 
		SwimCoach_2 theCoach = context.getBean("swimCoach_2", SwimCoach_2.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		// calling new methods that are defined inside SwimCoach_2, which are not defined inside Coach interface, 
		// these methods has the properties values injected (@Value email & team)
		
		System.out.println(theCoach.getEmail());
		System.out.println( theCoach.getTeam());

		// close the context
		context.close();

	}

}
