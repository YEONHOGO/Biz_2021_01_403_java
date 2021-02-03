package com.YEONHOGO.hello;

public class Hello {

	public static void main(String args[]) {
		
		double num1 = 55;
		double num2 = 28;
		
		System.out.println(num1 + num1);
		System.out.println(num1 * num1);
		System.out.println(num2 - num1);
		System.out.println(num2 / num1);
		System.out.println(num2 % num2+"\n");
		
		add(num1, num2);
		ave(num2, num1);
		mul(num2, num1);
		fo(num2, num2);
		go(num2, num2);
		
		
	}
	
	public static double add(double a, double b) {
		
		double sum = a + b;
		
		System.out.println(sum);
		
		return 0;
	}
	
	public static double ave(double a, double b) {
		
		double ave = a / b;
		
		System.out.println(ave);
		
		return 0;
	}
	
	public static double mul(double a, double b) {
		
		double totle = a - b;
		
		System.out.println(totle);
		
		return 0;
	}
	
public static double fo(double a, double b) {
		
		double totle = a % b;
		
		System.out.println(totle);
		
		return 0;
	}

	public static double go(double a, double b) {
	
	double totle = a * b;
	
	System.out.println(totle);
	
	return 0;
}
}
