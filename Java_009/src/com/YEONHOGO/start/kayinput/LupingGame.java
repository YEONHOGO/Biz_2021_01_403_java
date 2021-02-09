package com.YEONHOGO.start.kayinput;

import java.util.Random;
import java.util.Scanner;

/*
 * 배경설명 : 
 * 
 * 1. Random 클래스를 사용하여 1 ~ 100까지 임의 수를
 * 	생성하여 rndNum 변수에 담아 놓는다
 * 
 * 2. Console에 "숫자입력 >> " 프롬프트를 보여주고
 * 3. 1 ~ 100가지 정수를 입력받는다
 * 4. 입력받은 정수와 rndNum 변수에 저장된 값을 비교하여
 * 5. 큰가, 작은가를 알려주고
 * 6. rndNum 저장된 값을 맞추는 게임
 * 
 * 7. 2 부터 5까지를 계속 반복하면서 값을 맞춘다
 * 8. 만약 정수값에 -1을 입력하면 게임을 중단한다
 */
public class LupingGame {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		// 난수 1개 생성
		int rndNum = rnd.nextInt(100) + 1;
		int rndNum2 = rnd.nextInt(100) + 1;
		int count = 0;

		while(true) {
			
			System.out.print("\n\t숫자 입력 (-1:Quit) (-2:Hint) >> ");
			int keyNum = scan.nextInt();
			if(keyNum == -1) {
				System.out.println("\n\t\t\tYou lose!!!");
				System.out.println("\t\t    "+ count + "번을 시도하였습니다.\n");
				break;
			} else if (keyNum == -2) {
				if(rndNum > rndNum2) {
					System.out.println("\t" + rndNum2 + "보다 크다!!");
					continue;
				} else if(rndNum < rndNum2) {
					System.out.println("\t" + rndNum2 + "보다 크다!!");
					continue;
				}
			}	
			
			if(keyNum == rndNum) {
				System.out.println("\n\t\t\tYou Win!!!\n");
				System.out.println("\t\t    "+ count + "번만에 성공하였습니다.\n");
				break;
			} else if(keyNum > rndNum) {
				System.out.println("\t입력값이 크다!!");
			} else if(keyNum < rndNum) {
				System.out.println("\t입력값이 작다!!"); 
			}
			
			count++;
			
		} // while end
		System.out.println("\t\t|========================|");
		System.out.println("\t\t|\t\t\t |");
		System.out.println("\t\t|\tGAME ORVER\t |");
		System.out.println("\t\t|\t\t\t |");
		System.out.println("\t\t|========================|");
		
		
		/* 자작 연습
		while() {
		
			int sw = 3;
			switch (sw) {
			case -1 :
				break;
			case -2 :
				break;
			case  3 :
		
		
		
			} 
		
		
		}	
		*/
		
		
	}// main end
}// class end
