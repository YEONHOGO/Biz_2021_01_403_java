package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	// 클래스 영역에 선언된 변수들
	// 클래스 영역 : 멤버 영역
	// ScoreServiceV1 클래스를 객체로 선언하고
	// 초기화( new = SSV1())를 하면
	// 인스턴스 : 초기화 되면
	// 자동으로 사용할 준비가 되는 변수들 
	// new =SSV1() : 객체의 초기화
	Scanner scan = new Scanner(System.in);
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float floatAvg = 0.0F;
	
	// input() method가 호출되면
	// 키보드를 통해서 국어,영어,수학 점수를 입력받고
	// intKor, intEng, intMath에 저장
	public void input() {
		String str[] = {"국어", "영어", "수학"};
		
		// input() method이 지역변수
		int intNum = 0;
		
		System.out.println("성적의 총점, 평균을 구하는 프로그램입니다.");
		for(int i = 0; i < str.length; i++) {
			System.out.printf("%s >> ",str[i]);
			 switch (i) {
			 
			 case 0 : intKor = scan.nextInt();
			 			break;
			 case 1 : intEng = scan.nextInt();
			 			break;
			 case 2 : intMath = scan.nextInt();
			 			break;
			 }// switch end
		}// for end
		
	}// input end - 입력받기
	
	public void sum() {
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		

	}// sum end - 합계, 총점
	
	public void avg() {
		floatAvg = (float)intSum / 3.0F ;
		
	}// avg end - 평균
	
	// intKor, intEng, intMath 인스턴스 변수에
	// 저장된 값을 출력
	public void print() {		
		sum();
		avg();
		System.out.println("===================================");
		System.out.println("\t성적");
		System.out.println("-----------------------------------");
		System.out.printf("국어\t영어\t수학\t총점\t평균\n");
		System.out.printf("%3d\t%3d\t%3d\t%3d\t%3.2f\n",intKor,intEng,intMath,intSum,floatAvg);
		System.out.println("===================================");
	}// print end - 출력
	
}// classs end
