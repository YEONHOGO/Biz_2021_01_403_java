package com.YEONHOGO.varriable;

public class Varriable_01 {

	public static void main(String args[]) {
		
		// 연산하고자 하는 원래 값이 저장되는 변수
		int num1 = 0;
		int num2 = 0;
		
		//변수에 연산할 값 저장하기
		num1 = 70;
		num2 = 90;
		
		// 연산결과를 저장할 변수 선업 초기화
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		int result5 = 0;
		
		//연산 결과를 변수에 저장하기
		result1 = num1 + num2;
		result2 = num2 - num1;
		result3 = num1 * num2;
		result4 = num2 / num1;
		result5 = num2 % num1;
		
		// 변수에 저장된 결과를 Console에 출력
		// 30 + 40 = 70
		System.out.println("30 + 40 = "+ (30+40));
		
	
		System.out.println();
		
		System.out.println(num1 	//더하기 add
				+ " + " 		
				+ num2
				+ " = "
				+ result1);
		System.out.println(num2		//빼기 sub
				+ " - " 
				+ num1
				+ " = "
				+ result2);
		System.out.println(num1 	//곱하기 mul
				+ " * " 
				+ num2
				+ " = "
				+ result3);
		System.out.println(num2 	//나누기 div
				+ " / " 
				+ num1
				+ " = "
				+ result4);
		System.out.println(num2		//나머지 mod
				+ " % " 
				+ num1
				+ " = "
				+result5);
		
		System.out.println();
		
		System.out.println(num1 + " + " + num2 + " = " + result1);
		System.out.println(num2 + " - " + num1 + " = " + result2);
		System.out.println(num1 + " * " + num2 + " = " + result3);
		System.out.println(num2 + " / " + num1 + " = " + result4);
		System.out.println(num2 + " % " + num1 + " = " + result5);
	}
	
}
