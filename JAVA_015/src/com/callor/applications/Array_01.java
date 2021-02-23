package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Random 클래스를 사용하여 rnd 객체를 선언하고
		// = new Random() 명령을 사용하여
		// rnd 객체를 인스턴스화 시킨다
		// rnd : Random 클래스의 인스턴스
		Random rnd = new Random();
		
		// 정수 100개를 저장할 배열변수를 선언
		// 생성(초기화 : 사용할 준비를 하라)
		int[] intNums = new int[100];
		// input과 동일한 숫자를 카운트
		int count = 0; 
		// Scanner로 입력된 값을 저장
		int input = 0;
		
		// rnd 인스턴스의 nextInt() method를 호출(실행)하라
		// 매개변수값으로 100을 전달하라
		// Random 클래스의 nextInt() methog에
		//		정수 100을 전달하고 실행하여
		// return 하는 결과를 num 변수에 저장하라
		// intNums 변수에는  1 ~ 10 까지 중 1개의 숫자가
		// 저장될 것이다
		// 0 ~ (intNums.length - 1) 횟수만큼
		//		반복문을 실행하겠다
		/*
		 *  0 부터 intNums.length 까지의 정수를 만들어서
		 *  intNums 의 위치로 사용
		 */
		for(int i = 0; i < intNums.length; i++) {
			
			// Random 클래스의 nextInt method를
			//		호출하면서 정수 10을 전달하고 return 된 결과에 1을 더하라
			// 1 ~ 10까지 중 임의 숫자 1개를 만들어라
			// intNums i번째 위치에 1부터 10까지의 숫자중 하나를 랜덤으로 저장하라 
			intNums[i] = rnd.nextInt(10) + 1;
		}// for end
		System.out.println("1부터 10까지의 숫자를 입력하시오");
		System.out.print("입력 >> ");
		String str = scan.nextLine();
		input = Integer.valueOf(str);
		
		for(int i = 0; i < intNums.length; i ++) {
			if(intNums[i] == input) {
				count++;
				System.out.println("intNums[" + i + "]");
			}// if end
		}// for end
		System.out.println(input + "의 갯수는 " + count);
	}// end main
}// end class
