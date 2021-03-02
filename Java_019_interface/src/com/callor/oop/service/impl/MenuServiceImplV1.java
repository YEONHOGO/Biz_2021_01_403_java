package com.callor.oop.service.impl;

import java.util.Scanner;

import com.callor.oop.service.MenuService;

public class MenuServiceImplV1 implements MenuService{

	private Scanner scan;
	
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}
	
	public void selectMenu() {
		
		while(true) {
			System.out.println("================================");
			System.out.println("Java Menu System v1");
			System.out.println("--------------------------------");
			System.out.println("1. 카트추가");
			System.out.println("2. 카트삭제");
			System.out.println("3. 카트리스트");
			System.out.println("QUIT. 끝내기");
			System.out.println("--------------------------------");
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			
			// 1. Q 입력하면 끝내기
			
			if(strMenu.equals("QUIT")) {
				System.out.println("끝내기");
				break;
			}
	
			// 2. Q가 아니면 숫자로 변경하여 메뉴 선택 처리
			try {
				int intResult = Integer.valueOf(strMenu);
				if(intResult == 1) {
					System.out.println("카트추가");
				}
				if(intResult == 2) {
					System.out.println("카트삭제");
				}
				if(intResult == 3) {
					System.out.println("카트리스트");
				} else {
					System.out.println("메뉴는 1 ~ 3 까지만 입력");
				}
			} catch (Exception e) {
					System.out.println("메뉴는1 ~ 3까지만 입력");
				}

		}//while end
	}// selectMenu end
}// class end
