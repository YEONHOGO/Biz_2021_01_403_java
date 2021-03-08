package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.Impl.MenuServiceImplV1;
import com.callor.score.service.Impl.ScoreServiceImplV1;
import com.callor.score.service.Impl.ScoreServiceImplV2;
import com.callor.score.valeus.Values;

public class Start {

	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV1();
		ScoreService sService = new ScoreServiceImplV1();
		
		while(true) {
			Integer menu = mService.selectMenu();
			
			if(menu == Values.MENU_QUIT) {
				break;
			} else if (menu == Values.MENU_MAKE_RND) {
				sService.makeScore();
			} else if (menu == Values.MENU_SAVE_FILE) {
				sService.saveScoreToFile();
			} else if (menu == Values.MENU_LOAD_TO_FILE) {
				sService.loadScoreFromFile();
			}
			
		}
		
		
	}// main end
}// class end
