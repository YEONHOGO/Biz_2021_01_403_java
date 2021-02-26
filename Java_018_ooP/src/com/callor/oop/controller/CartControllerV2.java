package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2 {

	public static void main(String[] args) {
		
		CartVO[] cartVO = new CartVO[3];
		
		for(int i = 0; i < cartVO.length; i++) {
			cartVO[i] = new CartVO();
		}// for end
		
		// 제목
		System.out.println("");
		
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartDate("2021-02-26");
		cartVO[0].setCartTime("11:01:00");
		cartVO[0].setCartPName("삼양라면");
		cartVO[0].setCartQty(10);
		cartVO[0].setCartStd("오리지널");
		cartVO[0].setCartPrice(500);
		cartVO[0].setCartTotal(cartVO[0].getCartPrice() * cartVO[0].getCartQty());
		
		cartVO[1].setCartUserName("성춘향");
		cartVO[1].setCartDate("2021-02-26");
		cartVO[1].setCartTime("11:01:00");
		cartVO[1].setCartPName("불닭볶음면");
		cartVO[1].setCartQty(5);
		cartVO[1].setCartStd("치즈");
		cartVO[1].setCartPrice(800);
		cartVO[1].setCartTotal(cartVO[1].getCartPrice() * cartVO[1].getCartQty());

		cartVO[2].setCartUserName("이몽룡");
		cartVO[2].setCartDate("2021-02-26");
		cartVO[2].setCartTime("11:01:00");
		cartVO[2].setCartPName("신라면");
		cartVO[2].setCartQty(20);
		cartVO[2].setCartStd("블랙");
		cartVO[2].setCartPrice(450);
		cartVO[2].setCartTotal(cartVO[2].getCartPrice() * cartVO[2].getCartQty());

		// 간단하게 초기화가 가능 - > 삭제기능
		cartVO[0] = new CartVO();
		
			System.out.println(cartVO[1].toString());
		
		// === cartVO의 개수가 3인 상태
		// 상품 한가지를 더 카트에 넣고 싶다
		cartVO = new CartVO[4];
		
		cartVO[3] = new CartVO();
		cartVO[3].setCartPName("홍길동");
		cartVO[3].setCartPName("바나나우유");
		
		System.out.println("================");
		System.out.println("카트 내용");
		System.out.println("----------------");
		for(int i = 0; i < cartVO.length; i++) {
			System.out.println((i+1) +"번째 " + cartVO[i].toString());
		}// for end
		

		
	}// main end
}// class end
