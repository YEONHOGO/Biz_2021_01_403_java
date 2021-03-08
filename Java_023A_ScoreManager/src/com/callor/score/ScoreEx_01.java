package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.values.Values;

/*
 * ScoreService 를 테스트하는 코드
 */
public class ScoreEx_01 {

	public static void main(String[] args) {

		/*
		 * 인터페이스를 통하여
		 * *ServiceImpl*와 클래스를 사용하는 코드들 간에
		 * 약속이 만들어진다.
		 * 
		 * 이런 환경이 되면, method가 달라서 발생하는
		 * 여러 구조적 오류를 최초화 할 수 있다.
		 * 
		 * 만약 implV1을 만들던 개발자가 코드를
		 * 		미완성하더라도 implV1 클래스를 사용하는
		 * 		곳에서는 오류가 발생하지 않고
		 * 		다른 부분 코드를 작성 할수 있게된다.
		 */
		ScoreService ssV1 = new ScoreServiceImplV1();
		MenuService msV1 = new MenuServiceImplV1();
		
		while(true) {
			Integer menu = msV1.selectMenu();
			
			if(menu == Values.MENU_QUIT) 
				break;
			
			
			ssV1.inputScore();
			ssV1.makeScore();
			ssV1.saveScoreToFile();
			ssV1.loadScoreFromFile();
			ssV1.printScore();

		}
		
	}// main end
}// class end
