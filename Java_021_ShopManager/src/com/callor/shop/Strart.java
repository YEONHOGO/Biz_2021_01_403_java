package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.serviceImpl.CartServiceImplV1;
import com.callor.shop.serviceImpl.MenuServiceImplV1;

public class Strart {

	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV1();
		CartService cService = new CartServiceImplV1();
		
		while(true) {
			Integer menu = mService.selectMenu();
			
			// 종료
			if(menu == 0) {
				break;
			} else if (menu == 1) {
				// 장바구니 상품 담기
				cService.inputCart();
			} else if (menu == 2) {
				// 장바구니 전체리스트 보기
				cService.printCart();
			} else if (menu == 3) {
				// 구매자별 장바구니 출력
				cService.cartByBuyer();
			}
			
		}// while end
		
	}// main end
}// class end