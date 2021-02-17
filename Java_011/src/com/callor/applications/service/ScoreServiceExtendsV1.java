package com.callor.applications.service;

import java.util.Scanner;

/*
 * 클래스 extends(확장, 상속-)
 * 
 * ScoreServiceV4 : parent(부모) 클래스
 * ScoreServiceExtendsV1 : child(자식) 클래스
 * 
 * 단순한 extends
 * 		부모 클래스에 정의돈 모든 method를
 * 		코드한줄 추가, 수정 없이 그대로 사용할 수 있다.
 * 
 * 추가 extends
 * 		부모 클래스에 정의된 method와
 * 		새롭게 추가된 method가 있는
 * 		확장된 클래스의 생성
 * 
 */
public class ScoreServiceExtendsV1 extends ScoreServiceV4{
	
	public void input() {
		System.out.println("여기는 ExtendsV1의 input() ");
		
	}// input end
	
	public int input(String subject) {
		Scanner scan = new Scanner(System.in);
		
		int intScore = 0;
		while(true) {
			
			System.out.print("점수 입력 >> ");
			intScore = scan.nextInt();
			
			if(intScore < 0) {
				System.out.println("점수는 0점 이상입력 !!");
				
			} else if(intScore > 100) {
				System.out.println("점수는 100점 이하 입력 !!");
				
			} else {
				break;
			}
			//System.out.println("입력한 점수 : " + intScore);
			
		}
		System.out.println(subject + " 점수 : " + intScore);
		return intScore;
		
		// 호출한 코드에서
		// return = 30; => int intKor에 30을 담아라
		// return = 100; ==> int intKor에 100을 담아라
	}
}// class end
