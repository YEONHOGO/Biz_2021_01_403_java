package com.callor.applications.service;

import java.util.Scanner;

public class ClassServiceV3 {

	// java에서는 인스턴스 변수를
	//		private으로 제한한다
	Scanner scan = new Scanner(System.in);
	private int intNum1 = 0;
	private int intNum2 = 0;
	
	public void scope() {
		
		// method 선언명령문에 void 키워드가 있으면
		// 이 위치에 return 명령문이 있는것과 같다
		/*
		 * 	scope()에서는 1개의 숫자를 키보드에서 입력받아
		 *  변수 intNum1에 저장한다
		 *  하지만 여기에서 선언된 intNum1은
		 *  클래스 영역에 선언된 인스턴스변수와는 이름만 같지
		 *  	완전히 다른 변수다
		 *  따라서 scope() method가 종료된 이후에는
		 *  	변수값에 접근할 수 없다.
		 */
		System.out.print("숫자를 입력하세요");
		int intNum1 = scan.nextInt();
	}// scope end
	
	public void input(){
		System.out.print("두개의 숫자를 입력하시오 \n>> ");
		intNum1 = scan.nextInt();
		System.out.print(">> ");
		intNum2 = scan.nextInt();
	}// input end
	
	public void algebra() {
		System.out.println(intNum1 + " + " + intNum2 + " = " + (intNum1 + intNum2));
		System.out.println(intNum1 + " - " + intNum2 + " = " + (intNum1 - intNum2));
		System.out.println(intNum1 + " * " + intNum2 + " = " + (intNum1 * intNum2));
		System.out.println(intNum1 + " / " + intNum2 + " = " + (intNum1 / intNum2));
		
		/*
		 * print formatting 명령문
		 * "" 안에 문자열을 작성하여 출력문을 만드는 명령문
		 * %d(Decimal) 위치에 정수값을 대신 부착하여 출력문 생성
		 */
		System.out.printf(" %d x %d = %d \n",intNum1, intNum2, intNum1 * intNum2);
		System.out.printf(" %d / %d = %d \n",intNum1, intNum2, intNum1 / intNum2);
		System.out.printf(" %d + %d = %d \n",intNum1, intNum2, intNum1 + intNum2);
		System.out.printf(" %d - %d = %d \n",intNum1, intNum2, intNum1 - intNum2);
	}// algebra end
	
}// class end
