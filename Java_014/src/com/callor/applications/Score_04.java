package com.callor.applications;

import java.util.Random;

public class Score_04 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향"};
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		for(int i = 0; i < strName.length; i ++) {
			
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}// for end
		
		System.out.println("================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("--------------------------------");
		for(int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%3d\t%3d\t%3d\n",strName[i],intKor[i],intEng[i],intMath[i]);
		}// for end
		System.out.println("================================");
		
	}// main end
}// class end
