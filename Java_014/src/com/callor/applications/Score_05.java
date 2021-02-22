package com.callor.applications;

import java.util.Random;

public class Score_05 {

	public static void main(String[] args) {
		
		
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향"};
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		int[] intSum = new int[strName.length];
		float[] dAvg = new float[strName.length];
		
		// 학생별로 점수를 입력(생성)하는 코드
		Random rnd = new Random();
		for(int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}// for end
		
		// 학생별로 총점을 계산하는 코드
		for(int i = 0; i < strName.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}// for end
		
		// 학생별로 평균을 계산하는 코드
		for(int i = 0; i < strName.length; i++) {
			dAvg[i] = (float)intSum[i] / 3.0f;
		}
		
		// 성적리스트 제목 출력
		System.out.println("==============================================");
		System.out.println("\t       학습 성적일람표");
		System.out.println("==============================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		
		// 성적리스트 출력
		for(int i = 0; i < strName.length; i++) {
			System.out.print(strName[i] + "\t");
			System.out.print(intKor[i] + "\t");
			System.out.print(intEng[i] + "\t");
			System.out.print(intMath[i] + "\t");
			System.out.print(intSum[i] + "\t");
			System.out.printf("%3.2f\n",dAvg[i]);
		}
		System.out.println("==============================================");
		
	}// main end
}// class end
