package com.callor.applications.service;


public class ClassServiceV7 {

	
	public void guGuDan(int dan) {
		System.out.println("===========================");
		System.out.printf("%d단 구구단\n",dan);
		System.out.println("---------------------------");
		for(int i = 1; i < 10 ; i++) {
			System.out.printf("%d x %d = %d\n",dan,i,dan * i);
		}
		System.out.println("===========================");
		
	}// guGuDan end
	
}// class end
