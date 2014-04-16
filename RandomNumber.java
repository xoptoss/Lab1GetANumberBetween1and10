package mainPackage;

import java.util.Random;

public class RandomNumber {

	Random random = new Random();
	int answer;

	public void GetANumber_Between_1_and_10()
	{
		answer = random.nextInt(9)+1;
	}



}
