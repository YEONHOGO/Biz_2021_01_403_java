package com.callor.iolist.values;

public class Values {

	public static final String dLine;
	public static final String sLine;
	
	
	static {
		dLine = String.format("%0150d", 0).replace("0", "=");
		sLine = String.format("%0150d", 0).replace("0", "-");
	}
	
}// class end
