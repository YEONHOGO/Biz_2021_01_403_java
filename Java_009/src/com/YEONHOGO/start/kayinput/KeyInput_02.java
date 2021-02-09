package com.YEONHOGO.start.kayinput;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {
		
		// Scanner 클래스를 객체로 생성하면서
		// 운영체제의 키보드 시스템과 연결한다
		Scanner scan = new Scanner(System.in);
		int intNum = 0;
		
		System.out.print("\n\t숫자입력 >> ");
		intNum = scan.nextInt();
		boolean bYes = intNum % 2 == 0;
		
		if(bYes) {
			System.out.println("\t" + intNum + "은(는) 짝수입니다.");
		} else {
			System.out.println("\t" + intNum + "는(은) 홀수입니다.");
		}
		
	}// main end
}// class end
