package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create an array of Strings
	private String[] data = { "Beware of the wolf in sheep's clothing!", "Diligence is the mother of good luck!",
			"The journey is the reward!" };

	// Create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {

		// pick a random number so that we can use it as an index to pick a string from
		// the above array of strings
		int myRandomNumber = myRandom.nextInt(data.length);
		
		System.out.println(myRandomNumber);

		// now, use 'myrandomNumber' and pick an index to get a random string from the
		// above array of strings
		String theFortune = data[myRandomNumber];

		return theFortune;
	}

}
