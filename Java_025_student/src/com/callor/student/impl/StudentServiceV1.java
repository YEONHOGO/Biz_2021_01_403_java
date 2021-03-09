package com.callor.student.impl;

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
import com.callor.student.values.ValuesList;

public class StudentServiceV1 implements StudentService{


	private List<StudentVO> studentList;
	private String strName;
	
	public StudentServiceV1() {
		studentList = new ArrayList<StudentVO>();
		strName = new String();
	}
	
	public void studentInput() {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(Values.dLine(50));
			System.out.println("찾는 학생이름을 입력하세요(종료하시려면 QUIT를 입력)");
			System.out.println(Values.sLine(50));
			System.out.print("학생 >> ");
			this.strName = scan.nextLine();
			
			
			if(strName.equals("QUIT"))
				break;
			boolean bYes = false;
			for(StudentVO vo : studentList) {
				if(vo.getStName().equals(this.strName)) {
					System.out.println(Values.dLine(50));
					System.out.printf("이름 : %s\n",vo.getStName());
					System.out.printf("학과 : %s\n",vo.getStDept());
					System.out.printf("학년 : %d\n",vo.getStGrade());
					System.out.printf("반 :  %d\n",vo.getStHalf());
					System.out.printf("주소 : %s\n",vo.getStAddress());
					System.out.printf("전화번호 : %s\n",vo.getStPhoneNum());
					System.out.println(Values.dLine(50));
					bYes = true;
					break;
				}
			}// end for
			
			if(!bYes) {
				System.out.println("\n* 데이터가 없습니다.");
				System.out.println(Values.dLine(50));
				System.out.printf("%s 자료는 없습니다.\n",strName);
				System.out.println(Values.dLine(50));
			}
				
		}// end while
		scan.close();
		return;
	}// method end
	
	public void loadFromFile() {
		
		String fileName = "src/com/callor/student/학생정보리스트.txt";
		
		FileReader fileReader;
		BufferedReader buffer;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				
				String reader = buffer.readLine();	
				
				if(reader == null)
					break;
				
				String[] readerTemp = reader.split(":");
				StudentVO studentVO = new StudentVO(
								readerTemp[ValuesList.ST_NUM],
								readerTemp[ValuesList.ST_NAME],
								readerTemp[ValuesList.ST_DEPT],
								Integer.valueOf(readerTemp[ValuesList.ST_GRADE]),
								Integer.valueOf(readerTemp[ValuesList.ST_HALF]),
								readerTemp[ValuesList.ST_ADDRESS],
								readerTemp[ValuesList.ST_PHONENUM]
								);
				
				studentList.add(studentVO);
			}// end while
			
			buffer.close();
			fileReader.close();
			System.out.println("파일로드 성공!");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일 로드중에 문제가 발생했습니다.");
		}
		
		
	}// method end


}// class end
