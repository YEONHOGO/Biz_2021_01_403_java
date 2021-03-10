package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.values.ValueList;

public class ScoreEx {

	public static void main(String[] args) {
		
		MenuService menuService = new MenuServiceImplV1();
		ScoreService scoreService = new ScoreServiceImplV1();
		
		while(true) {
			Integer menu = menuService.selectMenu();
			
			// 종료
			if(menu == ValueList.Menu_QUIT) {
				break;
			}
			
			// 메뉴에서 반환된 값에 따라 메소드 실행
			if(menu == ValueList.Menu_INPUT) {
				scoreService.scoreInput();
			} else if (menu == ValueList.Menu_PRINT) {
				scoreService.scorePrint();
			} else if(menu == ValueList.Menu_SAVE_TO_FILE) {
				scoreService.saveFile();
			} else if(menu == ValueList.Menu_LOAD_FROM_FILE_AND_PRINT) {
				scoreService.load_From_File_Print();
			}
			
			
		}// while end
		
		
		
	}// main end
}// class end
