package com.callor.shop.service.Impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;
import com.callor.shop.values.Values;

/*
 * Impl 접미사 
 * 	: 인터페이스를 implement하여 생성한 클래스이다.
 */
public class MenuServiceImplV1 implements MenuService{

	/*
	 * final 키워드는 변수, 객체를 호깃모를 어디선가
	 * 변경하는 행위를 못하도록 방지하는 조치
	 * 상수선언이라고 한다.
	 *		final로 선언된 변수나 객체는 읽기 전용이다.
	 *
	 * 		값을 저장하려고 시도하면 오류가 난다
	 * 		final in num = 0;
	 * 		num = 100; // 오류가 발생한다
	 * 
	 */
	
	// 멤버영역
	private final Scanner scan;
	
	// 생성자, 초기화
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}// MenuServiceImplV1 end
	
	// 메뉴 선택
	public Integer selectMenu() {
		
		while(true) {
			
			System.out.println(Values.dLine);
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println(Values.sLine);
			System.out.printf("%d. 장바구니 추가\n",Values.MENU_INPUT);
			System.out.printf("%d. 장바구니 전체 보기\n",Values.MENU_ALL_LIST);
			System.out.printf("%d. 구매자별 장바구니 보기\n",Values.MENU_USER_LIST);
			System.out.printf("%d. 장바구니 파일 저장\n",Values.MENU_SAVE_CART_LIST);
			System.out.println("QUIT. 업무종료");
			System.out.println(Values.sLine);
			System.out.print("선택>> ");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				return null;
			}
			
			/*
			try {
				Integer intMenu = Integer.valueOf(strMenu);
				if(intMenu >= 1 && intMenu <= 3) {
					return intMenu;
				}
			} catch (Exception e) {
				
			}
			*/
			// int가 아닌 Integer로 선언
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.printf("메뉴는 QUIT, %d ~ %d까지만 가능\n",
							Values.MENU_START,Values.MENU_LAST);
				continue;
			}
			
			if(intMenu >= Values.MENU_START && intMenu <= Values.MENU_LAST) {
				return intMenu;
			} else {
				System.out.printf("업무는 %d ~ %d까지 중에서 선택\n",Values.MENU_START,Values.MENU_LAST);
			}

		}// while end
		
	}// selectMenu end

}// class end
