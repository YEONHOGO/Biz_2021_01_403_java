package com.YEONHOGO.applications;

import java.util.Scanner;

public class App_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력(2 ~ 9) >> ");
		int num = scan.nextInt();
		
		System.out.println("\n\t|=======================|");
		System.out.println("\t|\t구구단 " + num + "단\t|");
		System.out.println("\t|-----------------------|");
		for(int i = 0 ; i < 8 ; i++ ) {
			
			int num1 = i + 2;
			System.out.println("\t|\t" + num + " x " + num1  + " = " + (num * num1) + "\t|");
			
		}
		System.out.println("\t|=======================|");
		
		
	}
}
