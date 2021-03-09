package com.callor.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.iolist.model.IoListVO;
import com.callor.iolist.service.IoListService;
import com.callor.iolist.values.Values;

public class IolistServiceImplV1 implements IoListService{

	// 멤버 변수 선언
	private List<IoListVO> ioList;
	
	// 생성자
	public IolistServiceImplV1() {
		ioList = new ArrayList<IoListVO>();
	}
	
	// 파일을 읽어들이기
	public void loadFromFile() {
		ioList.removeAll(ioList);
		String fileName = "src/com/callor/iolist/애입매출데이터.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				
				if(reader == null) 
					break;
				String result[] = reader.split(",");
				IoListVO ioListVO = new IoListVO(result[0],	// 거래일자
										result[4],			// 상품명
										result[5],			// 거래처명
										result[6],			// 대표자명
						Integer.valueOf(result[7]),			// 구분
						Integer.valueOf(result[8]),			// 매입단가
						Integer.valueOf(result[9]),			// 판매단가
						Integer.valueOf(result[10]));		// 수량
				ioList.add(ioListVO);
			}
			
			buffer.close();
			fileReader.close();
			System.out.println("파일로드 성공");
		} catch (FileNotFoundException e) {
			System.out.println(fileName + "파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽는도중에 문제가 발생했습니다.");
		}
		
		
		
	}// method end

	// 구분에 따른 결과 실행
	// 구분이 1 일때 매입단가 * 수량을 계산하여 매입금액에 표시, 판매금액은 0으로 표시
	// 구분이 2 일때 판매단가 * 수량을 계산하여 판매금액에 표시, 매입금액에 0을 표시
	public void divitionExe() {
		
		for(IoListVO vo : ioList) {
			if(vo.getDivision() == 1) {
				int buyTotalPrice = vo.getBuyPrice() * vo.getQty();
				
				vo.setBuyTotalPrice(buyTotalPrice);
				vo.setSaleTotalPrice(0);
			} else if(vo.getDivision() == 2) {
				int saleTotalPrice = vo.getSalePrice() * vo.getQty();
				
				vo.setSaleTotalPrice(saleTotalPrice);
				vo.setBuyTotalPrice(0);
			} else {
				System.out.println("구분에 오류가 있습니다.");
			}
		}// end for
			
			
		
		
		
	}// method end
	
	// 리스트의 값 출력
	public void printList() {
		
		this.divitionExe();
		
		System.out.println(Values.dLine);
		System.out.println("거래일자\t거래처\t\t\t\t\t상품이름\t\t\t\t\t\t매입금액\t판매금액");
		System.out.println(Values.sLine);
		
		int nSize = ioList.size();
		for(IoListVO vo : ioList) {
			System.out.printf("%s\t%-20s\t\t%-20s\t\t\t%,15d\t%,15d\n",
							vo.getDate(),
							vo.getAcCount(),
							vo.getProduntName(),
							vo.getBuyTotalPrice(),
							vo.getSaleTotalPrice());
		}
		
		
		System.out.println(Values.dLine);
		
		
	}// method end

}// class end