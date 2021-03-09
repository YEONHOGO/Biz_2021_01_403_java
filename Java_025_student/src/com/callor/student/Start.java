package com.callor.student;

import com.callor.student.impl.StudentServiceV1;
import com.callor.student.service.StudentService;

public class Start {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentServiceV1();
		
			studentService.loadFromFile();
			studentService.studentInput();

		
		
	}// main end
}// class end
