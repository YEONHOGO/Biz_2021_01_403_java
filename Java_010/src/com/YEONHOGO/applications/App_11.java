package com.YEONHOGO.applications;

import java.util.Scanner;

import com.YEONHOGO.applications.myclass.MyGuGuDan;

public class App_11 {

	public static void main(String[] args) {
		
		MyGuGuDan myDan = new MyGuGuDan();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자(2 ~ 9, -1:Quit) >> ");
			int num = scan.nextInt();
			
			if(num < 0) {
				System.out.println("Game Over!!!");
				break;
			}
			
			if(num < 2 || num > 10) {
				System.out.println("어허 그게 아니야");
				System.out.println("2 ~ 9 까지만 구구단 " + "출력할수있어");
				System.out.println("다시 입력해 줄래!");
			} else
				myDan.print(num);
			
		}
		
	}
}
