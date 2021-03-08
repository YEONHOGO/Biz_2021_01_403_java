package com.callor.iolist;

import com.callor.iolist.service.IoListService;
import com.callor.iolist.service.impl.IolistServiceImplV1;

public class Start {

	public static void main(String[] args) {
		
		IoListService ioListService = new IolistServiceImplV1();
		
		ioListService.loadFromFile();
		ioListService.printList();
		
	}// main end
}// class end
