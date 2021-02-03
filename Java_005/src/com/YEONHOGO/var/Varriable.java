package com.YEONHOGO.var;

public class Varriable {

	public static void main(String args[]) {
		
		/*
		 * 숫자의 체계
		 * 프로그래밍에서 숫자는
		 * 정수와 실수가 있다.
		 * 정수는 0과 10진수 양수, 음수가 있다.
		 *  		정수는 부동소수점 수 라고 표현하기도 한다.
		 * 실수는 소수점 이하 값을 표현한다.
		 * 실수는 소수점이하 6자리, 16자리 표현방법이 있다.
		 * 단정도 실수 : 소수점이하 6자리(4자리)
		 * 배정도 실수 : 소수점이하 16자리
		 * 
		 * 4칙연산 수행할때
		 * 정수와 정수의 연산은 결과도 정수로 표현된다
		 * 실수와 실수의 연산은 결과도 실수로 표현된다
		 * 실수와 정수의 연산은 정수가 실수로 바뀌어
		 * 	실수 연산을 수행하고 실수로 표현된다
		 * 
		 * 정수와 실수가 달리 표현되는 것은
		 * 1. 기억장치에 저장되는 방법의 차이때문
		 * 2. 엱산장치의 효과적인 사용 때문
		 */
		
		
		
		int num1 = 40, num2 = 30;
		double num3 = 40.0, num4 = 30.0;
		
		System.out.println(num1 / num2);
		System.out.println(num3 / num4);
		System.out.println(num3 / num2);
		System.out.println(num1 / num4);
		
		
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
