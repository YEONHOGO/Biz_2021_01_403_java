package com.callor.score.values;

public class Values {

	public static String dLINE(int count) {
		
		return String.format("%0" + count + "d", 0).replace("0", "=");
		
	}// method end
	
	public static String sLINE(int count) {
		
		return String.format("%0" + count + "d", 0).replace("0", "-");
		
	}// method end

	
}// class end
