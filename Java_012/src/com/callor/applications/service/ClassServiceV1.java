package com.callor.applications.service;

public class ClassServiceV1 {

	/*
	 * Java 코딩을 할때
	 * {} 내에서 같은 이름의 변수는 2번이상 선언 불가
	 * Class {}내에서 같은 이름의 메서드는 2번이상
	 * 		선언불가
	 * 하지만, java에서는
	 * 		메서드의 매개변수 개수, 타입이 다르면
	 * 		같은 이름의 메서드를 주옵갛여
	 * 		선언할수 있다.
	 */
	public void add(int intNum1, int intNum2) {
		int intSum = intNum1;
		intSum += intNum2;
		System.out.print(intNum1);
		System.out.print(" + ");
		System.out.print(intNum2);
		System.out.print(" = ");
		System.out.println(intSum);
		
	}// add 정수 2개 덧셈
	
	public void add(int intNum1, float fNum1) {
		float intSum = (float)intNum1;
		intSum += fNum1;
		System.out.print(intNum1);
		System.out.print(" + ");
		System.out.print(fNum1);
		System.out.print(" = ");
		System.out.println(intSum);
		
	}// add 정수 1개, float 1개 덧셈

	public void add(double dNum1, float fNum1) {
		
		System.out.println(dNum1 + " + " + fNum1 + " = " + (dNum1 + (double)fNum1));
		System.out.println(fNum1 + " - " + dNum1 + " = " + ((double)fNum1 - dNum1));
		System.out.println(dNum1 + " x " + fNum1 + " = " + (dNum1 * (double)fNum1));
		System.out.println(dNum1 + " ÷ " + fNum1 + " = " + (dNum1 / (double)fNum1));
	
	}// add double 1개, float 1개 사칙연산

}// class end
