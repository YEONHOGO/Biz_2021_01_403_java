package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV4 {

	// 총점과 평균을 전달받는 2개의 매개변수가 있는 score() 메서드
	// 총점과 평균을 매개변수로 전달받아서
	// Console에 총점과 평균 출력
	public void score(int intSum, float floatAvg) {
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + floatAvg);
	}// score end
	
	public void print(int intKor, int intEng, int intMath) {
		
		int intSum = 0;
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		float fAvg = (float)intSum / 3.0F;
		System.out.println("=======================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------");
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
		System.out.print(intSum + "\t");
		System.out.println(fAvg + "\t");
		System.out.println("=======================================");
	}// print end
	
	public void input() {
		System.out.println("여기는 ExtendsV1의 input() ");
		
	}// input end
	/*
	 * 문자열형변수 1개를 매개변수로 갖는 input() method
	 */
	public int input(String subject) {
		Scanner scan = new Scanner(System.in);
		
		int intScore = 0;
		while(true) {
			
			System.out.print("점수 입력 >> ");
			intScore = scan.nextInt();
			
			if(intScore < 0) {
				System.out.println("점수는 0점 이상입력 !!");
				
			} else if(intScore > 100) {
				System.out.println("점수는 100점 이하 입력 !!");
				
			} else {
				break;
			}
			//System.out.println("입력한 점수 : " + intScore);
		}// while end
		System.out.println(subject + " 점수 : " + intScore);
		return intScore;
		/*
		 * input(String)메소드는 총 4개로 구성이된다.
		 * 1. Scanner 객체를 선언
		 * 2. 사용할 변수를 선언
		 * 3. 무한반복 while(true)
		 * 4. Scanner로 입력받은 값의 출력문
		 * -----------------------------------
		 * 1. 숫자를 입력받기 위해 또는 Scanner이라는 명령어를 사용하기 위해 
		 * 		Java라는 프로그램언어에 존재하는 종합선물세트인
		 * 		JDK (통칭 자바 디렉터 킷트로 개발할때 편리한, 창의적인 명령어들을 모아놓은 것)
		 *  	를 사용한다.
		 *  	여기에 그 수많은 개발 킷트들을 다 넣으면 좋겠지만
		 *  	현실적으로는 22만개라는 숫자의 개발 킷트를 프로그램마다 다 넣으면
		 *  	용량이 커지고 더불어 쓰지도 않는 것 때문에 컴퓨터가 느려진다.
		 *  여기서 필요한 것을 가져올때는
		 *  	Scanner scan = new Scanner(System.in);
		 *  	1 		2		 	3 			4	
		 *  	1. 사용할명령어가 들어있는 킷트, 또는 패키지이름
		 *  	2. 그 패키지를 내가 어떠한 이름으로 쓸지 정하는 칸
		 *  	3. 이거는 오브젝트를 만든다는 소리이다.
		 *  		쉽게 말해 여기다가 옆동네걸 쓰는데 2 에다가 새로운 이름으로 쓰는데
		 *  		이게 새롭다라는것을 알려주기 위한 것이다.
		 *  	4. System.in 이것은 시스템 즉 하드웨어(키보드)에서 입력을 받겠다는 것이다.
		 *  이렇게 해야지 해당 명령어를 사용이 가능해진다.
		 * --------------------------------------------------- 
		 * 2. 사용할 변수를 선언
		 * 	여기에는 현재
		 * 		int intScore = 0; 이라고 되어있는데
		 * int - 정수형으로 소수점이 있는 실수를 제외한 정수를 의미한다.
		 * intScore - 내가 intScored로 정수를 담겠다는 것이다.
		 * 0 - 여기에 0을 담겠다는 것이다. 새술은 새 포대에 담듯이 청소하겠다는 뜻이다.
		 * ; - 이것은 해당하는 명령어를 끝내겠다는 마침표이다.
		 * ------------------------------------------------------
		 * 3. 무한반복문 while(true)
		 * 이것은 조건만 맞으면 무한하게 반복되는 루프이다.
		 * true는 참 이라는 뜻으로 무한 반복문이나 조건문에서 사용된다.
		 * - break; 이것은 무한반복되는 while(true) 에서 탈출하기 위한 것이다.
		 * 	 무한하게 반복되면 이것은 역할을 다했는데도 계속 반복하게 되는 것을 피하기 위한것이다.
		 * 쉽게 해석하자면 껌을 씹는데 단물이 다 빠져서 이제 뱉는다. 
		 * 여기서 뱉는 행위를 break;라고 보면 된다.
		 * 
		 * - 무한반복문 안에서는
		 * 	System.out.println("문자"); 가 보이는데 이것은
		 * 	System 즉 컴퓨터에다가 OS, Console를 뜻한다.
		 * 	out는 바깥이다.
		 *  print - 해석하자면 출력이다.
		 *  통합적으로 해석하자면 컴퓨터에다가 출력해달라 라는 뜻으로
		 *  " " 안에 적혀있는 문자들을 출력해달라는 뜻이다. 그외에
		 *  변수  이렇게 되어있는 것들은 변수안에 저장되어있는 값들을 가져다가 출력해달라는 것이다.
		 *  더불어 "문자" 와 intScore 변수를 같이 사용하고 싶으면 그 사이에 '+' 를 넣어주면된다.
		 *  
		 *  intScore = scan.nextINT();
		 *  	1		2	3	4
		 *  1번은 위에 보면 2번에 해당하는 변수로써 현재는 0이 들어있는 상태이다.
		 *  2 이것은 위에 1번에 해당하는 것으로써 내가 어떤 이름으로 쓰겠다고 했던 것인데
		 *  여기서 필자는 scan으로 사용하겠다고 한것이다. 여기에는 다른이름을 사용할수도 있다.
		 *  3 next 이것을 해석하자면 다음이라는 뜻이다.
		 *  4 이것은 2번에서 설명한 정수형으로 소수점이 있는 실수를 제외한 값들을 말한다.
		 *  통틀어서 해석하자면 
		 *  2. 사용자로부터 입력을 받아서
		 *  3. 다음에 있는 형태로 넣어달라
		 *  4. 소수점이 있는 실수를 제외한 정수형태로
		 *  1. 그 입력받은 것들을 이 정수형 변수에다가 넣어달라 이런 뜻이다.
		 *  
		 *  if (조건) { }
		 *  if 이것은 만약에 라는 뜻으로
		 *  만약에 조건에 있는 것이 참 즉 진실이면 { } 안에 있는 것들을 실행하라는 뜻이다.
		 *  그 아래에 else는 조건이 참 즉 진실이 '아니면' 이것을 실행하라는 뜻이다.
		 *  그런데 else if (조건) { } 이것이 보일텐데 이것은
		 *  맨 처음에 있는 조건이 참값이 아닌 상태에서 여기에 있는 조건이 참이면
		 *  이것을 실행하라는 뜻이다. 즉 대비책인 것이다.
		 *  if(조건1) {
		 *  	내용1
		 *  } else if(조건2) {
		 *  	내용2
		 *  } else {
		 *  	내용3
		 *  }
		 *  먄약 조건1이 참이면 내용1을 실행하고
		 *  	조건1이 false 즉 거짓이면 조건2에 값을 봐서 참이면 실행
		 *  	아니면 다음으로 넘어가서 조건1, 조건2 등 있는 조건들을 다 봤는데 전부 아니다.
		 *  그러면 맨 마지막에 있는 아무런 조건이 없는 else 안에 있는 내용3을 실행하게 되는것이다.
		 *  최후의 대책이란 소리이다.
		 *  
		 *  이제 if (조건) { } 을 이해했을 거라고 본다.
		 *  그럼 조건으로 넘어가도록 한다.
		 *  여기서 조건이란게 컴퓨터가 알아 먹을수 있도록 해야한다.
		 *  컴퓨터가 알아먹는 조건은
		 *  	크다, 작다, 같다 이것뿐이다.
		 * 	여기서 더낳아가자면 크거나 같다, 작거나 같다 로 응용이 가능하다.
		 *  intScore < 0
		 *  자 보도록하면 intScore가 0보다 작다라는 뜻인데
		 *  이것은 intScore가 0보다 작으면 참값이라는 뜻이다.
		 *  
		 *  intScore > 100
		 * 	intScore가 100보다 크면 참값이라는 뜻이다.
		 * 
		 * 	위에 2개를 조합해보면 
		 * 	intScore가 0보다 작거나 그리고 100보다 크면 그 안에있는 내용을 실행하라는 소리이다.
		 *  즉 이것은 0부터 100의 사이 100을 포함한 숫자를 입력하면 false 즉 거짓으로
		 *  실행이 되지 않는다는 소리이다. 
		 *  저 조건들이 거짓이면 마지막에 else가 실행이 되는데
		 *  그 안에는 break; 즉 탈출이있다. 지긋지긋한 while이라는 미로를 탈출할수있는 출구이다.
		 *  이것들을 통합하여 해석하자면
		 *  입력받은 숫자가 0부터 100까지의 숫자이면 break;로 무사히 미로를 탈출할수있다는것이다.
		 *  
		 *  -------------------------------------------------------------------------
		 * 	4. 미로를 탈출하고 나면 print 문이 있다.
		 * 		이것은 3번에서 설명한 것처럼 시스템, 컴퓨터, OS에다가 출력하는 것이다.
		 * 		자세히 보면 "입력한 점수 : " + intScore 이렇게 되어있는데 
		 * 
		 * System.out.println("입력한 점수 : " + intScore);
		 * 	1		2	3			4				5
		 * 
		 * 1. 시스템
		 * 2. 바깥
		 * 3. 출력하라
		 * 4. 문자
		 * 5. 변수
		 * 
		 * 해석하자면 시스템에 출력을해라!
		 * 그 내용은 ("입력한 점수 : " + intScore) 이다.
		 * 여기서 그 내용도 한번 해석해 보겠다.
		 * " "은 문자를 뜻한다 안에있는 내용은 한글로 UTF-8이다.
		 * 한글로 '입력한 숫자 : ' 를 출력한다. 그 뒤에 붙어있는 변수도 출력해야한다.
		 * 변수도 집고 넘어가자 변수에는 사실 숫자(값)이 들어있지는 않다.
		 * 그 값이 있는 주소가 들어있는 것이다.
		 * 즉 변수에 있는 주소를 찾아가서 거기에 있는 값을 가져와서 출력하라는 것이다.
		 */
		
		
		// import 메소드가 하는 역할은 여기에다가 추가할 기능, 명령어가 어디에 속해있는지에 대해
		// 알려주는 거으로 쉽게말해 우편주소, 이름이라고 할수 있다.
		
		// 점수입력이라는 프롬프트가 하는 역할은 
		// Scanner로 입력을 받을때는 커서만 깜빡거리는데 이떄 사용자가 '어 왜 정지가 되었지?'
		// 하면서 개발자에게 욕을한다. 그러니까 이에 대한것을 방지하기 위해서
		// 사용자에게 안내를 해주는 것이다. 지금은 입력을 받는 상태로 어떠한것을 입력해 달라는 것이다.
	}// input-String end
}// class end
