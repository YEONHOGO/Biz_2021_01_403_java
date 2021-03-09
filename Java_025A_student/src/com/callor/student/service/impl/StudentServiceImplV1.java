package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.student.values.Values;

public class StudentServiceImplV1 implements StudentService{

	protected List<StudentVO> stdList;
	
	public StudentServiceImplV1() {
		stdList = new ArrayList<StudentVO>();
	}
	
	public void loadStudentFromFile() {
		
		String fileName = "src/com/callor/student/학생정보리스트.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null)
					break;
				String[] stds = reader.split(":");
				
				StudentVO stdVO = new StudentVO(stds[0],
						stds[1],
						stds[2],
						stds[3],
						stds[4],
						stds[5],
						stds[6]
						);
				stdList.add(stdVO);
				
			}// end while
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		
	}// method end

	public void SerchStudent() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(Values.dLine(50));
			System.out.println("찾는 학생이름을 입력하세요 (종료하려면 QUIT를 입력)");
			System.out.println(Values.sLine(50));
			System.out.print("학생 >> ");
			String strName = scan.nextLine();
			
			if(strName.equals("QUIT")) 
				break;
			
			int index = 0;
			int nSize = stdList.size();
			
			for(index = 0; index < nSize ; index++) {
				
				StudentVO stdVO = stdList.get(index);
				if(strName.equals(stdVO.getStName()))
					break;
				
			}// end for
			// for문이 중단되었을때
			// index와 nSize값의 관계를 비교해보면
			// index < nSize ==> 중단됨(break)
			// index >= nSize ==> for() 모두 반복, 자료가 없다.
			
			if(index < nSize) {
				
				this.printStVO(stdList.get(index));
				
			} else {
				System.out.println(strName + "학생은 자료가 없음");
			}
			
		}// end while

		scan.close();
	}// method end
	
	protected void printStVO(StudentVO sVO) {
		
		System.out.println(Values.dLine(50));

		System.out.printf("학번 : %s\n",sVO.getStNum());
		System.out.printf("이름 : %s\n",sVO.getStName());
		System.out.printf("학년 : %s\n",sVO.getStGrade());
		System.out.printf("반 : %s\n",sVO.getStClass());
		System.out.printf("주소 : %s\n",sVO.getStAddr());
		System.out.printf("전화번호 : %s\n",sVO.getStTel());
		
		System.out.println(Values.dLine(50));

	}
	

}// class end
