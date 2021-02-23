package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int keyNum = 0;
		
		System.out.println("2이상의 정수를 입력하세요");
		System.out.print("입력 >> ");
		String strSubj = scan.nextLine();
		keyNum = Integer.valueOf(strSubj);
		boolean bYes1 = false;
		
		for(int i = 2; i < keyNum; i++) {
			bYes1 = keyNum % i == 0;
			if(bYes1) {
				System.out.printf("%d는 소수가 아닙니다.\n",keyNum);
				break;
			}// if end
		}// for end
		if(!bYes1) {
			System.out.printf("%d는 소수가 입니다.\n",keyNum);
		}// if end
		
		
		int pos = 0;
		for(pos = 2; pos < keyNum ; pos++) {
			if(keyNum % pos == 0) {
				break;
			}
		}
		// pos의 값은?
		System.out.println("pos : " + pos);
		
		// for 반복문이 중간에 break 되면
		// 		항상 pos < keyNum 관계가 된다
		if(pos < keyNum) {
			System.out.println(keyNum + "는 소수가 아닙니다.");
			
			// for 반복문이 break 없이 모두 완료 되었으면
		} else {	
			System.out.println(keyNum + "는 소수");
			
		}
		
	}// end main
}// end class
