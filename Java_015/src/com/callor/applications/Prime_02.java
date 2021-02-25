package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeSerivceV1;

public class Prime_02 {

	public static void main(String[] args) {
		
		PrimeSerivceV1 prV1 = new PrimeSerivceV1();
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		System.out.print(">> ");
		String strSubj = scan.nextLine();
		int keyNum = Integer.valueOf(strSubj);
		
		// primeServiceV1 클래스의 Prime 메소드를 호출하면서 keyNum을 전달한다
		prV1.prime(keyNum);
		
	}// end main
}// class end
