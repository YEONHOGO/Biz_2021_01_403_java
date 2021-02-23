package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] intNums = new int[100]; // 1 부터 10까지의 정수 100개를 저장할 변수
		int count = 0; // 어떤 것의 개수를 세기위한 변수
		int keyNum = 0;// 입력받은 정수를 저장하기 위한 변수
		
		// intNums[100] -1 번까지 반복
		// rnd로 난수 발생해서 intNums[i]에 저장
		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}// for end
		
		// 프롬프트로 정보 출력
		// 정수를 문자열로 입력받아서
		// 문자열 => 정수로 변환해서 버그 발생 방지
		// 비교할 숫자 입력
		System.out.println("1 ~ 10 내에서 정수 1개를 입력하시오");
		System.out.print("입력 >> ");
		String strSubj = scan.nextLine();
		keyNum = Integer.valueOf(strSubj);
		
		// intNums[100] -1 번까지 반복
		// 입력받은 값과 비교하여 참이면 count를 1 상승시킨다
		// 그후 그 배열의 위치와 그 안에 들어있는 값을 출력
		for(int i = 0; i < intNums.length; i++) {
			if(keyNum == intNums[i]) {
				count++;
				System.out.printf("keyNum값 : '%d'의 위치 - intNums[%d]\n",keyNum,i);
			}// if end
		}// for end
		// 입력받은 비교값 "의 개수 : " 갯수(횟수)[count]
		System.out.println(keyNum + "의 개수 : " + count);
		
	}// end main
}// end class
