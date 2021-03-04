package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.Impl.CartServiceImplV2;
import com.callor.shop.service.Impl.MenuServiceImplV1;
import com.callor.shop.values.Values;

public class CartEx_02 {

	public static void main(String[] args) {
	
		MenuService mService = new MenuServiceImplV1();
		CartService cService = new CartServiceImplV2();
		
		while(true) {
			Integer menuItem = mService.selectMenu();
			if(menuItem == null) { // 널값 : 아무것도 아닌값
				break;
			} else if(menuItem == Values.MENU_INPUT) {
				cService.inputCart();
			} else if(menuItem == Values.MENU_ALL_LIST) {
				cService.printAllCart();
			} else if(menuItem == Values.MENU_USER_LIST) {
				cService.printUserCart();
			}
			
		}// whiled end
		System.out.println("업무종료");
	}// main end
}// class end
