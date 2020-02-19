package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// This app will demonstrate the difference between singleton and prototype
		// @Scope definition

		// Load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		// Check if the two objects are the same, here the scope is default which means
		// scope = singleton
		// when scope is singleton, the two objects should have the same reference. lets
		// test this fact below...

		boolean test = (theCoach == alphaCoach);

		// printing the result
		System.out.println("\nPointing to the same object: " + test); // test should equal to True, since scope =
																		// singleton;
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory loaction for alphaCoach: " + alphaCoach);

		// if we go to class TennisCoach and add @Scope ("prototype"), right above the
		// class definition (below @Component) and reun
		// this app, the result will be different. That is because when we set scope to
		// prototype, theCoach and alphaCoach will have different
		// reference and will point to different object.

		// close context
		context.close();

	}

}
