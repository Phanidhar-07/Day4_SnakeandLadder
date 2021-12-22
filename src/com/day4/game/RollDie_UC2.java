package com.day4.game;

public class RollDie_UC2 {

	public static void main(String[] args) {
	
		int dieCheck = ((int) (Math.random() * 10) % 6) + 1;
		System.out.println("The number on die is: " + dieCheck);
	}
}
