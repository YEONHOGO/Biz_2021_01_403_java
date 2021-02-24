package com.callor.score.service;

import java.util.Random;

public class ScoreServiceV1 {
	
	// 자작코드 변서 순언
	String[] strName = {"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
	int[] intKor = new int[strName.length];			// 국어
	int[] intEng = new int[strName.length];			// 영어
	int[] intMath = new int[strName.length];		// 수학
	int[] intSum = new int[strName.length];			// 총합
	float[] floatAvg = new float[strName.length];	// 평균

	/*
	 * 3과목의 점수를 전달받아서
	 * 합산을 하고 결과를 return 하는 method
	 */
	public int scoreSum(int intKor,int intEng, int intMath) {
		int result = intKor;
		result += intEng;
		result += intMath;
		return result;
	}// end scoreSum
	
	/*
	 * 총점 점수를 전달받고
	 * 과목수(과목수 3개라고 가정)로 나누어 return
	 */
	public float scoreAvg(int intSum) {
		float result = (float)intSum / 3;
		return result;
	}// end scoreAvg
	
	/*
	 * 한 학생의 성적 데이터를 한줄에 출력
	 */
	public void scorePrint(String strName,
							int intKor,
							int intEng,
							int intMath,
							int intSum,
							float floatAvg) {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n",
				strName,
				intKor,	intEng,	intMath,intSum,
				floatAvg);
		
		
		// 이름,국어,영어,수학,총점,평균,배열을
		// 통째로 매개변수로 전달하고
		// ssv1.print() method에서 리스트를 출력하도록
		
	}// end scorePrint
	
	/*
	 * 배열을 매개변수로 전달받는 매소드
	 */
	public void print(
				String[] strName,
				int[] intKor,
				int[] intEng,
				int[] intMath,
				int[] intSum,
				float[] floatAvg) {
		System.out.println("=============================================");
		System.out.println("이름\t국어\t영어\t수학\t총합\t평균");
		System.out.println("---------------------------------------------");
		for(int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n",
					strName[i],
					intKor[i],
					intEng[i],
					intMath[i],
					intSum[i],
					floatAvg[i]);
		}
		System.out.println("=============================================");
	}// end print
	
	// 자작코드-------------------------------------------------------------------------

	public void scoreRandom() {
		Random rnd = new Random();
		for(int i = 0; i < this.strName.length; i++) {
			this.intKor[i] = rnd.nextInt(100) + 1;
			this.intEng[i] = rnd.nextInt(100) + 1;
			this.intMath[i] = rnd.nextInt(100) + 1;
		}// end for
	}// end scoreRandom
	
	public void scoreSum_1() {
		for(int i = 0; i < this.strName.length; i++) {
			this.intSum[i] = this.intKor[i];
			this.intSum[i] += this.intEng[i];
			this.intSum[i] += this.intMath[i];
		}// end for
	}// end scoreSum_1
	
	public void scoreAvg_1() {
		for(int i = 0; i < this.strName.length; i++) {
			this.floatAvg[i] = (float)this.intSum[i] / 3;
		}// end for
	}// end scoreAvg_1
	
	public void scorePrint_1() {
		// 제목 출력
		System.out.println("=============================================");
		System.out.println("이름\t국어\t영어\t수학\t총합\t평균");
		System.out.println("---------------------------------------------");
		
		// 성적 출력
		for(int i = 0; i < this.strName.length; i++) {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n",
				this.strName[i],
				this.intKor[i],
				this.intEng[i],
				this.intMath[i],
				this.intSum[i],
				this.floatAvg[i]);
		}// end for
		// 마무리
		System.out.println("=============================================");
	}// end scorePrint_1
	
	public void simple() {
		scoreRandom();
		scoreSum_1();
		scoreAvg_1();
		scorePrint_1();
	}// end simple
	
}// end class
