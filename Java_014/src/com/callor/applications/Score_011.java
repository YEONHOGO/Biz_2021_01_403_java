package com.callor.applications;

import java.util.Scanner;

public class Score_011 {

	public static void main(String[] args) {
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생별 성적을 입력하세요");
		// 학생별로 과목전체 점수 입력받기
		for(int index = 0; index < intKor.length; index++) {
			int num = index + 1;
			System.out.println(num + "번 학생 성적 입력~~");
			System.out.print("국어 >> ");
			intKor[index] = scan.nextInt();
			
			System.out.print("영어 >> ");
			intEng[index] = scan.nextInt();
			
			System.out.print("수학 >> ");
			intMath[index] = scan.nextInt();
			System.out.println("==========================");
		}// for end
		
		System.out.println("=====================================");
		System.out.println("국어\t영어\t수학");
		System.out.println("-------------------------------------");
		for(int i = 0; i < intKor.length; i++) {
			System.out.printf("%d\t%d\t%d\n",intKor[i],intEng[i],intMath[i]);
		}// for end
		System.out.println("=====================================");
		
	}// main end
}// class end
