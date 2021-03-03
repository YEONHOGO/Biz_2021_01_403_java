package com.callor.shop.serviceImpl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

public class MenuServiceImplV1 implements MenuService{

	// 멤버 선언
	private Scanner scan;
	
	// 생성자
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}
	
	// 메뉴 선택
	public Integer selectMenu() {
		
		while(true) {
			
			// 메뉴 출력
			System.out.println("===================================");
			System.out.println("빛나라 쇼핑몰 System V2021");
			System.out.println("-----------------------------------");
			System.out.println("1. 장바구니 상품 담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");
			System.out.println("===================================");
			
			// 선택 출력 및 입력
			System.out.print("선택 >> ");
			String menu = scan.nextLine();
			
			// QUIT 입력시 종료
			if(menu.equals("QUIT")) {
				break;
			}
			
			// 1 ~ 3 입력시 그 값을 반환
			try {
				Integer intMenu = Integer.valueOf(menu);
				if(intMenu >= 1 && intMenu <= 3) {
					return intMenu;
				} else {
					System.out.println("(QUIT : 끝내기)1 ~ 3까지 입력하세요");
				}
			} catch (Exception e) {
				System.out.println("메뉴 선택은 QUIT, 1 ~ 3까지의 정수만 입력이 가능합니다.");
			}
		}// while end
		return 0;
	}// selectMenu end

}// class end
