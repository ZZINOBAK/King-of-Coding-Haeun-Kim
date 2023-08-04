package com.mystudy.string;

import java.util.Arrays;

public class Ex03_StringExam {

	public static void main(String[] args) {
		// //String str = "901012-1234567"; //주민번호
		String he = "940904-2183914";
		
		//1. 전체자리수 14개 여부확인, '-'위치: 7번째 여부 확인
		if (he.length() == 14) {
			System.out.println(he.charAt(6));
			System.out.println(he.indexOf('-'));
		} 
//		--------쌤------------------
//		if (he.length() == 14) {
//			System.out.println("정상");
//		} else {
//			System.out.println("비정상 : " + he.length());
//		}
		
//		System.out.println();
//		if ("-".equals(he.substring(6, 7))) {
//			System.out.println("정상");
//		} else {
//			System.out.println("비정상 : " + he.substring(6, 7));
//		}
		
//		if(!"-".equals(he.substring(6, 7))) {
//			System.out.println("비정상 : " + he.substring(6, 7));
//		} //느낌표 사용해서 아니냐고 묻는 if문도 사용 가능.
		
		System.out.println("------------------");

		//2. 생년월일 출력(1-2:년도, 3-4:월, 5-6:일)
		//   예) 90년 10월 12일 또는 1990년 10월 12일
		System.out.print("19" + he.charAt(0) + he.charAt(1) + "년 ");
		System.out.print("" + he.charAt(2) + he.charAt(3) + "월 ");
		System.out.println("" + he.charAt(4) + he.charAt(5) + "일");

//		------------쌤--------------
		String yymmdd = he.substring(0, 6);
		System.out.println(yymmdd);
		
		String yy = he.substring(0, 2);
		String mm = he.substring(2, 4);
		String dd = he.substring(4, 6);
		System.out.println("19" + yy + "년 " + mm + "월 " + dd + "일");
		System.out.println("------------------");

		char ch = he.charAt(7);
		String yyyy = "";
		if (ch == '1' || ch == '2') {
			yyyy = "19" + yy;
		} else if (ch == '3' || ch == '4') {
//			System.out.println("20" + yy + "년 " + mm + "월 " + dd + "일");
			yyyy = "20" + yy;
		}
		System.out.println(yyyy + "년 " + mm + "월 " + dd + "일");
		System.out.println("------------------");

		String flag = he.substring(7, 8);
		System.out.println(flag);
//		*****제일 중요*******
//		문자열을 비교할때는 무조건 .equals 쓰삼. 
//		== 이거 써도 되긴되는데, 쓰지말고 무조건 .equals 써!!!!
//		무슨 데이터가 저장소가 다르다고 함. 그래서 이퀄을 써야한다고 함???
//		아아 이해했어 == 이거는 주소값이 같냐고 물어보는거라서 안된다고함.
//		순전히 데이터의 값만 비교하는거니까 이퀄스써야 함!!!!
		if ("1".equals(flag) || "2".equals(flag)) {
			yyyy = "19" + yy;
		} else if ("3".equals(flag) || "4".equals(flag)) {
			yyyy = "20" + yy;
		}
		System.out.println(yyyy + "년 " + mm + "월 " + dd + "일");

		System.out.println("------------------");
		
		//3. 성별 확인하고 출력(1,3: 남성, 2,4: 여성)
		if(he.charAt(7) == 1 && he.charAt(7) == 3) {
			System.out.println("남성1");
		} else {
			System.out.println("여성1");
		}
		// 이거 내가 원래 숫자만 썼었는데, 숫자만 쓰면 출력 안됨.
		// '' 작은따옴표 해서 문자로 표시해 줘야 함.
		// 어제 저게 출력되었던 건, 그냥 else라고 적어놔서 여자가 출력 되었던 거임.
		System.out.println("------------------");
		if(he.charAt(7) == 1 || he.charAt(7) == 3) {
			System.out.println("남성2");
		} else if (he.charAt(7) == 2 || he.charAt(7) == 4) {
			System.out.println("여성2");
		}
		// 이렇게 else if로 해서 출력하면 아무것도 출력 안됨.
		// ''이거 안써서 그냥 숫자로 써서 출력 안되는 거임.
		// 그리고 저거 && 그리고가 아니라 || 또는 이라고 해야함!!!! 헷갈리면 안돼!!!
		System.out.println("------------------");
		if(he.charAt(7) == '1' || he.charAt(7) == '3') {
			System.out.println("남성3");
		} else if (he.charAt(7) == '2' || he.charAt(7) == '4') {
			System.out.println("여성3");
		}
		// 출력 완료.
		// 연산자 표시 제대로!!! 문자표시 꼭!!!
		System.out.println("------------------");

		int dd1 = he.charAt(7);	
		switch (dd1) {
		case '1' : case '3' :
			System.out.println("남자");
			break;
		case '2' : case '4' :
			System.out.println("여자");
			break;
		} 
//		------------쌤--------------
		char gender = he.charAt(7);
		if (gender == '1' || gender == '3') {
			System.out.println(gender + " : 남자");
		} else if (gender == '2' || gender == '4') {
			System.out.println(gender + " : 여자");
		}
		
		System.out.println("------------------");
		//4. 데이터 값 검증(월: 1~12, 일: 1~31)
		//참고) int num = Integer.parseInt("10"); //"10" -> 10
		int num = Integer.parseInt(he.substring(2, 4));
		System.out.println(1 <= num && num <= 12);
		System.out.println("------------------");
		
		int num1 = Integer.parseInt(he.substring(4, 6));
		System.out.println(1 <= num1 && num <= 31);
//		------------쌤--------------
		String sMonth = he.substring(2, 4);
		int month = Integer.parseInt(sMonth);
		if (month >= 1 && month <= 12) {
			System.out.println("월 확인");
		} else {
			System.out.println("월 수정해라" + sMonth);
		}
		
		if (month < 1 || month > 12) {
			System.out.println("월 수정해라");
		}
		
		int date = Integer.parseInt(he.substring(4, 6));
		if (date >= 1 && date <= 31) {
			System.out.println("일 확인");
		} else {
			System.out.println("일 수정해라" + date);
		}
	}

}
