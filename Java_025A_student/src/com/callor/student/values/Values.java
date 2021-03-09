package com.callor.student.values;

public class Values {

	public static String dLine(int count) {
		
		return String.format("%0" + count + "d", 0).replace("0", "=");
	}
	
	public static String sLine(int count) {
		
		return String.format("%0" + count + "d", 0).replace("0", "-");
	}

}// class end
