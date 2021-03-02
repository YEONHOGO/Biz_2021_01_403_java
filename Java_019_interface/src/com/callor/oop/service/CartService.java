package com.callor.oop.service;

/*
 * project에서 interface를 만드는 이유
 * 1. 앞으로 CartService** 클래스를 만들때는
 * 		반드시 CartService interface를 implements 하라
 * 2. 클래스이름에 오류가 발생한다
 * 3. 해결방법으로 Add Uniml...methods 를 실행한다
 * 4. CartService interface에 정의해둔 method가
 * 		자동으로 만들어진다.
 * 5. CartService interface를 implements 하므로써
 * 		반드시 구현해야할 method가 무엇인지
 * 		명확하게 알수 있게 된다.
 * 6. CartService** 클래스에서 반드시 구현해야할
 * 		method들이 무엇인지 알수 있고
 * 		그 method들은 이름까지 정해지는 상태가 된다.
 */
public interface CartService {

	public void inputCart();
	public void printCart();
	
}
