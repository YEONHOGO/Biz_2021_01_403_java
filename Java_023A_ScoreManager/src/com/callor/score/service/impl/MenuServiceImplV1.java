package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.Values;

public class MenuServiceImplV1 implements MenuService{

	public Integer selectMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			// 메뉴 출력
			System.out.println(Values.dLine);
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println(Values.sLine);
			System.out.printf("%d. 학생성적 점수 생성\n",Values.MENU_MAKE_RND);
			System.out.printf("%d. 학생성적 점수 파일에 저장\n",Values.MENU_SAVE_FILE);
			System.out.printf("%d. 성적결과 확인\n",Values.MENU_LOAD_TO_FILE);
			System.out.printf("QUIT. 끝내기\n");
			System.out.println(Values.dLine);
			System.out.print("선택 >> ");
			String menu = scan.nextLine();
			
			// QUIT
			if(menu.equals("QUIT")) {
				break;
			}
			
			Integer intMenu = 0;
			// 예외처리
			try {
				intMenu = Integer.valueOf(menu);
			} catch (Exception e) {
				System.out.println("메뉴는 QUIT, 1 ~ 3까지의 정수를 입력하세요");
			}
			
			if(intMenu >= Values.MENU_START && intMenu <= Values.MENU_LAST) {
				return intMenu;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			
		}// while end
		
		
		
		return Values.MENU_QUIT;
	}// selectMenu end

}// class end
