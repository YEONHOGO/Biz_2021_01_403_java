package com.yeonhogo.hello;

public class Hello {

	/*
	 * main() method 라고 부른다
	 * Run(elipse)를 했을 때
	 * 
	 * elipse에서 Run을 했을 때 발생하는 상황
	 * Hello.java 파일을 컴파일 : javac Hello.java
	 * java Hello 명령을 실행하여 코드를 컴퓨터에 주입하고 결과를 Console에 출력
	 */
	
	public static void main(String args[]) {
		
		System.out.println("Console 화면에 다음과 같이 출력하시오\n");
		System.out.println("30 + 40 = " + (30+40));
		System.out.println("30 * 40 = " + (30*40));
		System.out.println("40 - 30 - " + (40 - 10));
		System.out.println("40 / 20 = " + (40/20));
		System.out.println("\n여러분 반갑습니다");
	}
}
