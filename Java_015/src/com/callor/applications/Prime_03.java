package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {

	public static void main(String[] args) {
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("소수를 입력하세요.");
		System.out.print(">> ");
		String strSubj = scan.nextLine();
		int keyNum = Integer.valueOf(strSubj);
		
		int result = psV2.prime(keyNum);
		
		// 0보다 작으면 -1부터인데 리턴값이 -1이면
		if(result < 0) {
			System.out.printf("%d는 소수가 아닙니다.\n",keyNum);
		}else {
			System.out.printf("%d는 소수입니다.\n",keyNum);
		}
		
		
		
	}// main end
}// class end
