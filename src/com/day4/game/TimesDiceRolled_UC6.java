package com.day4.game;

public class TimesDiceRolled_UC6 {

	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int LOWER_LIMIT = 0;
	public static final int UPPER_LIMIT = 100;

	public static void main(String[] args) {

		int position = 0;
		int dieCheck;
		int optionCheck;
		int roll = 0;
		
		while (position < UPPER_LIMIT) {
		
			roll = roll + 1;
			dieCheck = ((int) ((Math.random()) * 10) % 6) + 1;
			optionCheck = (int) ((Math.random()) * 10) % 3;
			// dieCheck=5;
			// optionCheck=1;
			switch (optionCheck) {
			
			case NO_PLAY:
				position = position;
				break;
			
			case LADDER:
				if ((position + dieCheck) > UPPER_LIMIT) 
				{
					position = position;
				} 
				else 
				{
					position = position + dieCheck;
				}
				break;

			default:

				if ((position - dieCheck) <= LOWER_LIMIT) 
				{
					position = 0;
				} 
				else {
					position = position - dieCheck;
				}
				break;
			}
			System.out.println("No.of Times Die Rolls: " + roll);
			System.out.println("Dice Number: " + dieCheck);
			System.out.println("Option :" + optionCheck);
			System.out.println("The Position is: " + position);
		}
	}
}
