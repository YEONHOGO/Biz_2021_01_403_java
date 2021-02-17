package com.callor.applications.service;

import java.util.Scanner;

public class ScoreService {

	/*
	 *  클래스와 메소드(메소드, method)의 명명법
	 *  클래스 : 첫글자, 영문대문자, 이후 영문대소문자 숫자
	 *  메서드 : 첫글자, 영문소문자, 이후 영문대소문자 숫자
	 *  
	 *  클래스 명명법 (Upper) CamelCase 라고 한다
	 *  메소드 명명법 (Lower) CamelCase
	 *  
	 */
	
	public void score() {
		
		/*
		 * java의 class와 method() 호출
		 * ScoreService 클래스에는 main() method가 없어서
		 * 여기에 있는 코드는 직접 Run(^F11)하여 실행할수 없다
		 * 누눈가가 ScoreService를 객체, 인스턴스로 만들고
		 * score() method를 호출해주어야만 코드를 실행할 수 있다.
		 * 
		 *  다른 언어에서는 module 등의 이름으로 사용한다.
		 *  
		 */

		Scanner scan = new Scanner(System.in);

		while (true) { // 자작 코드

			String[] str = { "국어", "영어", "수학" };
			int[] Score = new int[str.length];
			int intSum1 = 0;
			double dAvg = 0.0;
			System.out.println("국어, 영어, 수학 순서대로 점수(1 ~ 100)를 입력하여 평균을 구하는 프로그램입니다.");

			for (int i = 0; i < str.length; i++) {
				System.out.print(str[i] + " : ");
				Score[i] = scan.nextInt();
				if (Score[i] > 100 || Score[i] < 0) {
					System.out.println("\t1 ~ 100 까지의 숫자를 입력해주세요.");
					i--;
					continue;
				}
				intSum1 += Score[i];
			}
			dAvg = intSum1 / 3.0d;
			System.out.println("=============================================");
			System.out.println("국어\t영어\t수학\t총점\t평균");
			System.out.println("---------------------------------------------");
			System.out.print(Score[0] + "\t");
			System.out.print(Score[1] + "\t");
			System.out.print(Score[2] + "\t");
			System.out.print(intSum1 + "\t");
			System.out.println(dAvg + "\t");
			System.out.println("=============================================");
			break;
		}
		
	}// score end
	
	public void score_01(){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어점수 >> ");
		
		int intKor = scan.nextInt();
		
		System.out.print("영어점수를 입력하세요 >> ");
		int intEng = scan.nextInt();
		
		System.out.print("수학점수를 입력하세요 >> ");
		int intMath = scan.nextInt();

		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		float fAvg = (float)intSum/3;
		
		fAvg = intSum / 3.0f; // 3.0d
		
		System.out.println("=============================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
		System.out.print(intSum + "\t");
		System.out.print(fAvg + "\t");
		System.out.println("=============================================");
		
	}
}// class end
