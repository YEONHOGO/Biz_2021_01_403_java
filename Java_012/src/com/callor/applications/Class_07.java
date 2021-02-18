package com.callor.applications;

import com.callor.applications.service.ClassServiceV5;

public class Class_07 {

	public static void main(String[] args) {
		
		ClassServiceV5 csV5 = new ClassServiceV5();
		
		float result = 0;
		
		result = csV5.sum(55.2F, 33.7F);
		System.out.println(result);
		
		int num1 = 3;
		long num2 = 3;
		
		float num3 = 3.0F;
		double num4 = 3.0D;
	}// main end
}// class end
