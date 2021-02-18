package com.callor.applications;

import com.callor.applications.service.ClassServiceV6;

public class Class_08 {

	public static void main(String[] args) {
		
		ClassServiceV6 csV6 = new ClassServiceV6();
		
		int num1 = 88;
		int num2 = 99;
		
		// 각각 method에 변수 num1, num2를 전달하고
		// 변수 num1과 num2에 담긴 값을 전달
		int add = csV6.add(num1,num2);
		int subst = csV6.substraction(num1, num2);
		
		System.out.printf("%d + %d = %d\n",num1,num2,add);
		System.out.printf("%d - %d = %d\n",num1,num2,subst);
	}// main end
}// class end
