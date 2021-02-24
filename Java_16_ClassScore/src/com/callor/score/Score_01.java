package com.callor.score;

import java.util.Random;

public class Score_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		String[] strName = new String[] {"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
		String[] strAddress = new String[] {"서울시","익산시","남원시","한양시","함흥시"};
		String[] strSubject = new String[] {"국어","영어","수학"};
		int[] intKor = new int[strName.length]; 			// 국어 점수
		int[] intEng = new int[strName.length]; 			// 영어 점수
		int[] intMath = new int[strName.length];			// 수학 점수
		int[] intScoreSum = new int[strName.length]; 		// 점수의 합계
		float[] floatScoreAvg = new float[strName.length];	// 점수의 평균
		
		
		// 과목 점수 난수 생성
		for(int i = 0; i < strName.length; i++) { // [1]
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}// end for [1]
		
		// 점수의 합계 계산
		for(int i = 0; i < strName.length; i++) { // [2]
			intScoreSum[i] = intKor[i];
			intScoreSum[i] += intEng[i];
			intScoreSum[i] += intMath[i];
		}// end for [2]
		
		// 점수의 평균 계산
		for(int i = 0; i < strName.length; i++) { // [3]
			floatScoreAvg[i] = (float)intScoreSum[i] / 3;
		}// end for [3]
		
		// 제목 및 목록출력
		System.out.println("=====================================================");
		System.out.println("이름\t주소\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		
		// 이름, 주소, 점수, 총합, 평균 출력
		for(int i = 0; i < strName.length; i++) { // [4]
			System.out.printf("%s\t%s\t%3d\t%3d\t%3d\t%4d\t%3.2f\n",
					strName[i],			// 이름
					strAddress[i],		// 주소
					intKor[i],			// 국어
					intEng[i],			// 영어
					intMath[i],			// 수학
					intScoreSum[i],		// 합계
					floatScoreAvg[i]);	// 평균
		}// end for [4]
		
		// 마무리
		System.out.println("=====================================================");
		
	}// end main	
}// end class
