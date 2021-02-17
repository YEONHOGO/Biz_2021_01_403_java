package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// prompt
		// scanner의 nextInt() 를 사용하여
		// 키보드 입력을 받는 코드가 실행되면
		// 화면에 아무것도 없이
		// 멈춘것처럼 보이는 현상이 있는데
		// 미리 어떤 일을 할것인지 알려주는 메시지
		System.out.print("국어점수 >> ");
		
		// Blocking 되었다. Code Blocking
		// scan.nextInt() 메서드를 호출하면
		// 코드 동작이 멈추고, 사용자가 키보드로
		// 무엇인가 입력한 후 Enter를 누를때까지
		// 이후 코드가 실행되지 않는다.
		int intKor = scan.nextInt();
		
		System.out.print("영어점수를 입력하세요 >> ");
		int intEng = scan.nextInt();
		
		System.out.print("수학점수를 입력하세요 >> ");
		int intMath = scan.nextInt();

		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		// fAvg 변수는 실수형이지만
		// intSum은 정수형, 3도 정수형이기 때문에
		// fAvg 변수에 저장되는 값은
		// 소수점 이하가 무조건 0으로 세팅된다.
		float fAvg = (float)intSum/3;
		
		// 결과값을 실수형(float)로 하고자 할때는
		// intSum 변수 값이나
		//		숫자3을 실수형으로 만들어줘야 한다.
		// 		float 형 값으로 강제 형변환하여 나눗셈 준비
		
		// 1. intSum을 실수형으로 변경하고 계산하기
		fAvg = (float)intSum / 3;		// (double)intSum / 3
		
		// 2. 숫자를 실수형으로 만들어서 나눗셈
		// intSum을 실수 3.0f로 나눗셈을 지시하면
		// 	intSum변수에 담긴 값은
		//  자동형변환(자동으로 실수형으로 변환된다)
		fAvg = intSum / 3.0f; // 3.0d
		fAvg = intSum / (float)3; // 작동은 되는데 잘안쓰는 코드
		
		System.out.println("=============================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
		System.out.print(intSum + "\t");
		System.out.print(fAvg + "\t");
		System.out.println("=============================================");
		//------------------------------------------------------------------------------------
		
		while(true) {	// 자작 코드
			
			String[] str = {"국어", "영어", "수학"};
			int[] score = new int[str.length];
			int intSum1 = 0;
			double dAvg = 0.0;
			System.out.println("국어, 영어, 수학 순서대로 점수(1 ~ 100)를 입력하여 평균을 구하는 프로그램입니다.");
		
			for(int i = 0; i < str.length ; i++) {
				System.out.print(str[i] + " : ");
				score[i] = scan.nextInt();
				if(score[i] > 100 || score[i] < 0) {
					System.out.println("\t1 ~ 100 까지의 숫자를 입력해주세요.");
					 i--;
					continue;
				}
				intSum1 += score[i];
			}
			dAvg = intSum1 / 3.0d;
			System.out.println("=============================================");
			System.out.println("국어\t영어\t수학\t총점\t평균");
			System.out.println("---------------------------------------------");
			System.out.print(score[0] + "\t");
			System.out.print(score[1] + "\t");
			System.out.print(score[2] + "\t");
			System.out.print(intSum1 + "\t");
			System.out.println(dAvg + "\t");
			System.out.println("=============================================");
			break;
		}
		
		
		
		while(true) {
			
			
			System.out.println("국어, 영어, 수학 순서대로 점수를 입력하여 평균을 구하는 프로그램입니다.");
			System.out.print("국어 : ");
			int Score1 = scan.nextInt();
			System.out.print("영어 : ");
			int Score2 = scan.nextInt();
			System.out.print("수학 : ");
			int Score3 = scan.nextInt();
			int sum1 = Score1 + Score2 + Score3;
			double ave1 = 0.0;
			ave1 = sum1 / 3.0;
			boolean byes1 = Score1 < 101 && Score1 > 0;
			boolean byes2 = Score2 < 101 && Score2 > 0;
			boolean byes3 = Score3 < 101 && Score3 > 0;			
			boolean byes4 = byes1 && byes2 && byes3;
			
			if(byes4) {
			System.out.println("=============================================");
			System.out.println("국어\t영어\t수학\t총점\t평균");
			System.out.println("---------------------------------------------");
			System.out.print(Score1 + "\t");
			System.out.print(Score2 + "\t");
			System.out.print(Score3 + "\t");
			System.out.print(sum1 + "\t");
			System.out.println(ave1 + "\t");
			System.out.println("=============================================");
			break;
			} else {
				System.out.println("\t1 ~ 100 까지의 숫자를 입력해주세요.");
				continue;
			}
		}
		
		
		
		
	}
}
