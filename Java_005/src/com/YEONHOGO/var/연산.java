package com.YEONHOGO.var;

public class 연산 {
	
	/*
	 * 한글로 클래스명을 작성하면
	 * 프로젝트가 문제가 생긴다 라고 하지만
	 * 전혀 문제되지는 않는다
	 * 다만,
	 * 이름짓기(특히 여러단어를 조합할때) 약간 불편함이 있기 때문이다.
	 * 그렇기에 영문으로 작성을 한다.
	 */
	public static void main(String args[]) {
		
		
		
	}
	public static double add(double a, double b) {	//더하기
		//더하기
		double totle = a + b;
		
		System.out.println(totle);
		
		return 0;
	}
	
	public static double div(double a, double b) {	//나누기
		//나누기
		double totle = a / b;
		
		System.out.println(totle);
		
		return 0;
	}
	
	public static double sub(double a, double b) {	//빼기
		//빼기
		double totle = a - b;
		
		System.out.println(totle);
		
		return 0;
	}
	
	public static double rem(double a, double b) {	//나머지
		//나머지
		double totle = a % b;
		
		System.out.println(totle);
		
		return 0;
	}

	public static double mul(double a, double b) {	// 곱하기
		// 곱하기
		double totle = a * b;
	
		System.out.println(totle);
	
		return 0;
	}

}
