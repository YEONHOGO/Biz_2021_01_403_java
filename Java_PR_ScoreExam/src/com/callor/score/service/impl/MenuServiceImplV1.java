package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.ValueList;
import com.callor.score.values.Values;

public class MenuServiceImplV1 implements MenuService{
	
	
	public Integer selectMenu() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			// 성적 프로픔트, 성적입력
			System.out.println(Values.dLINE(50));
			System.out.println("학생 성적 처리 V1");
			System.out.println(Values.sLINE(50));
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 파일에 저장");
			System.out.println("4. 성적 파일 로드(기존데이터 초기화)");
			System.out.println("QUIT. 종료");
			System.out.println(Values.dLINE(50));
			System.out.print("입력>> ");
			String menu = scan.nextLine();
			
			// 종료
			if(menu.equals("QUIT")) {
				System.out.println("종료");
				return ValueList.Menu_QUIT;
			}
			
			Integer intMenu;
			// 유혀성 검사
			try {
				intMenu = Integer.valueOf(menu);
				
			} catch (Exception e) {
				System.out.println("입력은 QUIT 또는 정수 1 ~ 2를 입력하세요");
				continue;
			}// try catch end
			
			// 1 또는 2일 경우 리턴, 아닐경우 경고문출력후 while문 반복
			if(intMenu >= ValueList.Menu_START && intMenu <= ValueList.Menu_LAST) {
				return intMenu;
			} else {
				System.out.println("1부터 2 사이의 정수를 입력하세요");
			}
			
		}// end while
		
		
	}// method end

}// class end
