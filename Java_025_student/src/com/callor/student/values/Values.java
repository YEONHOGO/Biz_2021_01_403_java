package com.callor.student.values;

public class Values {

	public static String dLine(int count){
		
		String dLineFormat = "%0"+ count + "d" ;
		String dLine = String.format(dLineFormat, 0)
				.replace("0", "=");
		
		return dLine;
	}// method end
	
	public static String sLine(int count){
		
		String sLineFormat = "%0"+ count + "d" ;
		String sLine = String.format(sLineFormat, 0)
				.replace("0", "-");
		
		return sLine;
	}// method end
	
	public static final String QUIT = null;

	
}// class end