package com.sddevops.CW1test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		double num1, num2;
	
		System.out.println("First number to add : ");
		num1 = a.nextDouble();
		System.out.println("Second number to add : ");
		num2 = a.nextDouble();
		
		double answer = num1 + num2;
		System.out.println(answer);

	}

}
