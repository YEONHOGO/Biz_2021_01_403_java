package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService{

	// 필드영역
	private List<ScoreVO> scoreList;
	private Scanner scan;
	private String fileName;
	
	// 생성자
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		fileName = "src/com/callor/score/data/score.txt";
	}// method end
	
	// 입력
	public void scoreInput() {
		
		System.out.println(Values.dLINE(50));
		System.out.println("학번 5자리 ([ex]00001)");
		System.out.print("학번>> ");
		String stNum = scan.nextLine();
		stNum = this.Validation(stNum);

		// 국어
		int intKor = this.Validation_Subject("국어");

		// 영어 입력
		int intEng = this.Validation_Subject("영어");

		// 수학 입력
		int intMath = this.Validation_Subject("수학");
		
		// 음악 입력
		int intMusic = this.Validation_Subject("음악");
		
		ScoreVO scoreVO = new ScoreVO(stNum,intKor,intEng,intMath,intMusic);
		
		scoreList.add(scoreVO);
		
	}// method end

	// 출력
	public void scorePrint() {
		
		int intSum = 0;			// 전체 총점
		float floatAvg = 0.0f;	// 전체 평균
		
		// 제목
		System.out.println(Values.dLINE(60));
		System.out.println("성적알람표");
		System.out.println(Values.dLINE(60));
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(Values.sLINE(60));
		
		// 내용
		// scoreTotal와 scoreAvg는 gerter에서 계산하도록 설계
		for(ScoreVO vo : scoreList) {
			System.out.print(vo.getScoreNum() + "\t");
			System.out.print(vo.getScoreKor() + "\t");
			System.out.print(vo.getScoreEng() + "\t");
			System.out.print(vo.getScoreMath() + "\t");
			System.out.print(vo.getScoreMusic() + "\t");
			System.out.print(vo.getScoreTotal() + "\t");
			System.out.printf("%3.2f\n",vo.getScoreAvg());
			
			// 학생 전체의 총점 계산
			intSum += vo.getScoreTotal();
			floatAvg += vo.getScoreAvg();
			
		}// for end
		
		// 학생 전체의 평균 계산
		int nSize = scoreList.size();
		floatAvg = (float)floatAvg / (float)nSize;
		// 마무리
		
		System.out.println(Values.sLINE(60));
		System.out.printf("총점:\t\t\t\t\t%d\n",intSum);
		System.out.printf("평균:\t\t\t\t\t\t%3.2f\n",floatAvg);
		System.out.println(Values.dLINE(60));
		
		
	}// method end
	
	public void saveFile() {

		
		
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			printWriter = new PrintWriter(fileWriter);
			
			
			for(ScoreVO vo : scoreList) {
			
				printWriter.printf("%s:%d:%d:%d:%d\n",
						vo.getScoreNum(),
						vo.getScoreKor(),
						vo.getScoreEng(),
						vo.getScoreMath(),
						vo.getScoreMusic());
			}
			
			
			printWriter.close();
			fileWriter.close();
			System.out.println("파일 저장 성공!");
		} catch (IOException e) {
			System.out.println("파일 생성중에 문제발생");
		}
		
		
		
	}// method end
	
	public void load_From_File_Print() {
		
		scoreList.removeAll(scoreList);
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			
			while(true) {
				
				String str = buffer.readLine();
				
				// 더이상 읽을게 없으면 종료
				if(str == null) {
					break;
				}
				
				String[] strTemp = str.split(":");
				
				ScoreVO scoreVO = new ScoreVO(
						strTemp[0],
						Integer.valueOf(strTemp[1]),
						Integer.valueOf(strTemp[2]),
						Integer.valueOf(strTemp[3]),
						Integer.valueOf(strTemp[4]));
				
				scoreList.add(scoreVO);

			}// while end
			
			
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수가 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽는 도중 에러 발생");
		}
		
		this.scorePrint();
		System.out.println("기존의 정보는 전부 삭제되었습니다.");
		System.out.println("현재 여기서 추가로 입력하시면 txt파일에 추가됩니다.");
		
	}// method end
	
	
	// 유효성 검사
	public Integer Validation_Subject(String subject) {
		
		
		Integer intScore = null;
		
		while(true) {
			
			System.out.print(subject +">> ");
			String score = scan.nextLine();
			
			
			try {
				intScore = Integer.valueOf(score);
			} catch (Exception e) {
				System.out.println("문자를 제외한 1부터 100까지의 정수를 입력하세요");
				continue;
			}
			
			if(intScore >= 1 && intScore <= 100) {
				break;
			} else {
				System.out.println("1부터 100까지의 정수를 입력하세요");
			}
			
		}// while end
		
		return intScore;
	}// method end

	// 유혀성 검사
	public String Validation(String strNum) {

		while(true) {
			
			boolean bYesNum = false;
			
			for(ScoreVO vo : scoreList) {
				if(strNum.equals(vo.getScoreNum())) {
					bYesNum = true;
					break;
				}
			}// for end
			
			if(!bYesNum) {
				break;
			} else if(bYesNum) {
				System.out.println("학번이 중복됩니다 다시 입력하세요");
				System.out.print("학번>> ");
				strNum = scan.nextLine();
			}
			
		}// while end
		
		return strNum;
	}// method end

}// class end
