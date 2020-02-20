package com.luv2code.springdemo;


import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo") // we commented this @ComponentScan so that we can use the beans defined manually below. we can 
											// comment the beans and we can use the ComponentScan, which scans the package 
											// we passed in the parenthesis.


@PropertySource("classpath:sport.properties")// this is used to inject from properties file called sport.properties
public class SportConfig {
	
	// define bean for our sadFortuneService class
	// here we are creating an object using the interface (FortuneService), it is same as FortuneService sadFortuneService = new SadFortuneService;
	// sadFortuneService = an object; SadFortuneService = a class, it starts with capital letter. so, sadFortuneService is our object. we will
	// inject it below in the constructor, since SwimCoach_2 class has a constructor that accepts a parameter of an object of type FortuneService. 
	// see below
	@Bean
	public FortuneService sadFortuneService() { // sadFortuneService method here is used as bean id. 
		return new SadFortuneService();
	}
	
	
	// define bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach_2() {
		return new SwimCoach_2(sadFortuneService()); // here we inject the object we created above. object sadFortuneService is passed through
													 // the constructor that accepts an object of type FortuneServicve. The method name 
												    // swimCoach() will be used as bean id inside SwimJavaConfigDemoApp.java file 
		// the above is same as 
		// public Coach swimCoach_2(){
		//    SwimCoach_2 mySwimCoach_2 = new SwimCoach_2(sadFortuneService);
		//    return mySwimCoach_2;
		// }
	}

}



// N.B 
// here we can comment all bean definitions above and just leave body of SportConfig and we can still be able to run javaConfigDemoApp