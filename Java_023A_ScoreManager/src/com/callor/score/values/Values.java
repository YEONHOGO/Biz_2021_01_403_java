package com.callor.score.values;

public class Values {

	public static final String dLine;
	public static final String sLine;
	public final static Integer MENU_START ;
	public final static Integer MENU_LAST;
	
	public final static Integer MENU_QUIT;
	public final static Integer MENU_MAKE_RND;
	public final static Integer MENU_SAVE_FILE;
	public final static Integer MENU_LOAD_TO_FILE;

	
	// static final 변수 생성하기
	static {
		
		dLine = String.format("%050d", 0).replace("0", "=");
		sLine = String.format("%050d", 0).replace("0", "-");
		MENU_START = 1;
		MENU_LAST = 3;
		
		MENU_QUIT = null;
		MENU_MAKE_RND = 1;
		MENU_SAVE_FILE = 2;
		MENU_LOAD_TO_FILE = 3;

	}
	
}// class end
