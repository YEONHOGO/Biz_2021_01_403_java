package com.callor.applications;

import com.callor.applications.service.ClassServiceV7;

public class Class_10 {

	public static void main(String[] args) {
		
		ClassServiceV7 csV7 = new ClassServiceV7();
		
		for(int i = 2; i < 10; i++) {
			csV7.guGuDan(i);
		}
	}// main end
}// class end
