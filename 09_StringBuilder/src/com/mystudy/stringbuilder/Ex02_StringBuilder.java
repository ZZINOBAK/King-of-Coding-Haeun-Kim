package com.mystudy.stringbuilder;

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		// StringBuffer 클래스
		StringBuffer sb = new StringBuffer("안녕하세요 Java~~~");
		System.out.println(sb);
		String str = sb.toString(); //StringBuffer의 저장 문자열 확인 코드
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//스트링 버퍼는 최소로 공간을 16칸? 가지고 있음!!
		System.out.println("--------------------------");
		StringBuffer sb1 = new StringBuffer(100);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		// 숫자 넣으면 공간 용량 의미함. 그래서 100뜸.
		
		System.out.println("----String : 데이터 불변(immutable)----");
		String str1  = sb.toString();
		System.out.println(str1);
		String str2 = str1.concat("룰룰룰룰룰호로르르룰루룰");
		// concat = 괄호 안 문자열을 전부 결합해서 반환해 주는 함수(오픈사전)
		// str1 주소안에 데이터가 바뀐게 아니라
		// 새로운 주소 안에 데이터를 넣는다고?????
		System.out.println(str2);
		System.out.println(str1 == str2);
		// 둘이 다른 주소
		// 스트링 클래스에 데이터가 한번 저장이 되면 바꿀 수 있는 방법이 없다고 함.
		// 왜냐묜 앞에 final이 붙어 있다고 함.
		// 계속 new 써서 새로운거 만들어야 한다고 함.
		
		System.out.println("---StringBuffer : 데이터 변경 가능-----");
		System.out.println(sb.toString());
		sb.append("반갑다"); //append = (글에) 덧붙이다, 첨부하다
		System.out.println(sb.toString());
		System.out.println(sb.length()); // 13 -> 16 길이가 늘었다.
		System.out.println(sb.capacity()); // 저장공간은 29 그대로
		sb.append("반갑다ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ");
		System.out.println(sb.toString());
		System.out.println(sb.length()); //길이도 늘고,
		System.out.println(sb.capacity()); // 저장공간도 늘었네?
		
		sb.append("반갑소").append("잉");
		System.out.println(sb.toString());
		System.out.println(sb.length()); // 길이가 느는건 알겠는데,
		System.out.println(sb.capacity()); // 저장공간이 무슨 기준으로 느는거니?
		
		sb.reverse(); //reverse = (정반대로) 뒤바꾸다, 반전[역전]시키다
		System.out.println(sb.toString());
		System.out.println(sb.length()); // 당연히 이건 변화 없음
		System.out.println(sb.capacity()); // 이것두
		sb.reverse();
		
		System.out.println("---delete(), insert(), replace()-----");
		StringBuffer sb2 = sb.delete(0, 6); //0번째부터 6번전까지 지우기
		System.out.println(sb.toString());
		System.out.println(sb == sb2); //동일 객체
		System.out.println(sb.insert(7, " dddd ")); //7번째에 추가
		System.out.println(sb.replace(0, 1, "R")); //0번째부터 1번째 전까지를 "R"로 바꾸기
		System.out.println(sb.length()); 
		System.out.println(sb.capacity()); 
		System.out.println("---------------");
		
		sb2 = new StringBuffer(100);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		sb2.append("안녕안녕아녕").append("하이하이하이하이");
		System.out.println(sb2.toString());
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		System.out.println("----트림투사이즈 실행하기---");
		sb2.trimToSize(); //트림투사이즈 = 리턴값 XXXXX. 그냥 여유공간 삭제만 함.
		System.out.println(sb2.length());
		System.out.println(sb2.capacity()); //빈공간 다 없어짐. 랭스랑 같은 길이 됨.
		
		sb2.setLength(5); // 데이터 크기 설정(작게 설정하면 delete 효과)
//		sb2.delete(5, sb.length()); // 위의 셋랭스랑 똑같은 의미임.
		System.out.println(sb2.toString()); //5개만 출력되는군. 뒤에 다 짤라서 버렸나봄.
		System.out.println(sb2.length()); // 랭스는 주는데
		System.out.println(sb2.capacity()); // 전체 공간은 안주네??? 뭐여 신기하군
		
		sb2.setLength(0);
		System.out.println(sb2.toString()); // 아무것도 출력되는거 없어져버림ㅋ
		System.out.println(sb2.length()); // 데이터가 아무것도 없을 때 랭스는 0이군요.
		System.out.println(sb2.capacity()); 
		
	}

}
