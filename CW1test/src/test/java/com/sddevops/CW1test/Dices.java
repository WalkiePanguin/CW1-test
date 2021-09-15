package com.sddevops.CW1test;
import java.util.Random;

public class Dices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random  num1 = new Random();
		int a = num1.nextInt(6) + 1;
		
		System.out.println("You rolled a:" + a);
	}

}
