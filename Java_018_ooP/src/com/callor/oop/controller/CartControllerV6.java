package com.callor.oop.controller;

import com.callor.oop.service.CartServiceV2;

/*
 * 1. CartServiceV1 클래스에
 * 		cartList 객체를 인스턴수로 선언 ㅇ
 * 2. inputCart() method를 선언하고
 * 3. 키보드에서 상품정보를 입력 받은 후
 * 4. 수량은 2이상, 단가는 1000원이상 만 가능
 * 5. printCartList() method를 선언하여
 * 6. cartList를 console에 출력
 * 
 * 상품정보
 * 이름, 상품명, 수량, 단가
 * 
 * Controller 클래스
 * web appliction 프로젝트를 수행할때
 * 처음 시작하는 시작점 클래스
 * 
 * Service 등 모듈클래스를 객체로 선언하고
 * 모듈클래스의 method들을 호출하는 일만 수행
 */
public class CartControllerV6 {

	// 수업용
	public static void main(String[] args) {
		
		CartServiceV2 csV2 = new CartServiceV2();
		
		csV2.inputCart();
		csV2.printCart();
		
	}// main end
}// class end
