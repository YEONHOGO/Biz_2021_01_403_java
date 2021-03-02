package com.callor.cart.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.cart.model.CartVO;
import com.callor.cart.service.CartService;

public class CartServiceV1 implements CartService{

	// 클래스 멤버 변수 선언
	private Scanner scan;
	private List<CartVO> cartList;
	
	// 생성자
	public CartServiceV1() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	}// CartServiceV1 생성자 end
	
	// 리스트 입력
	public void inputCart() {
		System.out.println("====================================");
		System.out.println("장바구니에 넣기");
		System.out.println("------------------------------------");
		
		// 구매자
		System.out.print("구매자>> ");
		String strUserName = scan.nextLine();
		
		// 상품명
		System.out.print("상품명>> ");
		String strProName = scan.nextLine();
		
		// 수량
		int intQty = 0;
		while(true) {
		System.out.print("수량>> ");
		String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if(intQty < 1) {
					System.out.println("수량은 1 이상");
				} else {
					break;
				} 
			} catch (Exception e) {
				System.out.println("수량은 숫자로만!!");
			}
		}// while 수량 end
		
		// 단가
		int intPrice = 0;
		while(true) {
		System.out.print("수량>> ");
		String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if(intPrice < 1) {
					System.out.println("수량은 1 이상");
				} else {
					break;
				} 
			} catch (Exception e) {
				System.out.println("수량은 숫자로만!!");
			}
		}// while 수량 end

		// 카트리스트 생성
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProName(strProName);
		cartVO.setQty(intQty);
		cartVO.setPrice(intPrice);
		cartVO.setTotal(intPrice * intQty);
		
		// 카트리스트에 정보 입력
		cartList.add(cartVO);
	}// inputCart end

	// 리스트 출력
	public void printCart() {
		int nsize =cartList.size();
		for(int i = 0; i < nsize; i++) {
			System.out.println(cartList.get(i).toString());
		}
		
	}// printCart end

	
}// class end
