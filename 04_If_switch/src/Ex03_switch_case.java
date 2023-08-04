
public class Ex03_switch_case {

	public static void main(String[] args) {
		// switch case 문:  동등비교구문
		/*
		 switch (조건값) {
		 case 비교값1 :
		 		실행할 문장들;
		 		break;
		 case 비교값2 :
		 		실행할 문장들;
		 		break;
		 ...
		 default : 
		 		실행할 문장들;
		 		break; (여기서 브레이크는 필요없는 코드지만 넣어주는 것이 좋음!)
		 		(왜냐하면 여기 브레이크가 있어야, 실수로 디폴트 이후에 케이스가 나오더라도
		 		멈출 수 있기 때문임. 브레이크 없으면 다음 케이스로 넘어가서 계산해버림.)
		 }
		 
		 */
		
		int 등 = 12;
		
		switch (등) {
		case 1 :
			System.out.println("하버드");
			break;
		case 2 :
			System.out.println("서울대");
			break;
		case 3 :
			System.out.println("연고대");
			break;
		case 4 :
			System.out.println("서성한");
			break;
		case 5 :
			System.out.println("중경");
			break;
		case 6 :
			System.out.println("외시");
			break;
		case 7 :
			System.out.println("건동홍");
			break;
		case 8 :
			System.out.println("광명");
			break;
		case 9 :
			System.out.println("상가");
			break;
		case 10 :
			System.out.println("경기권");
			break;
		case 11 :
			System.out.println("경기권");
			break;
		case 12 :
			System.out.println("경기권");
			break;
		case 13 :
			System.out.println("경기권");
			break;
		case 14 :
			System.out.println("충청권");
			break;
		case 15 :
			System.out.println("충청권");
			break;
		case 16 :
			System.out.println("충청권");
			break;
		case 17 :
			System.out.println("전라경상");
			break;
		case 18 :
			System.out.println("전라경상");
			break;
		default :
			System.out.println("제주도");
			break;
		}
		// 브레이크 없으면 모든 명령문 실행됨.
		// 브레이크 꼭 쓰삼.
		
		System.out.println("--------------------------");

		switch (등) {
		case 1 : 
			System.out.println("해외 명문대");
			break;
		case 2 : case 3 : 
			System.out.println("국내 명문대");
			break;
		case 4 : case 5 :
		case 6 : case 7 : case 8 :
		case 9 : 
			System.out.println("인서울");
			break;
		case 10 : case 11 : case 12 :
		case 13 : case 14 : case 15 :
		case 16 : case 17 : 
		case 18 : 
		case 19 : case 20 :
			System.out.println("지방대");
			break;
		}
		System.out.println("--------------------------");

		/* 추첨결과에 따라 상품 지급
		 1등 냉장고 2등 김냉 3등 세탁기 4등 청소기 5등 휴지
		 추첨결과 당첨상품 출력 ㄱㄱ
		*/
		
		String result = "1"; //추첨결과
		String resultMsg = "꽝";
		
		switch (result) {
		case "1" : 
			resultMsg = "당첨상품 : 냉쟁고";
			break;
		case "2" : 
			resultMsg = "당첨상품 : d김냉";
			break;
		case "3" : 
			resultMsg = "당첨상품 : 세탁기";
			break;
		case "4" :
			resultMsg = "당첨상품 : 청소기";
			break;
		default :
			resultMsg = resultMsg + " 휴지나 가져가라";	
			break;
		}
		System.out.println(result + "등 "+ resultMsg);
		
		
		

		System.out.println("--------------------------");
		String result1 = "3"; //추첨결과
		String resultMsg1 = "상품없다";
		
		switch (result1) {
		case "1" : 
			System.out.println("당첨상품 : 냉쟁고");
			break;
		case "2" : 
			System.out.println("당첨상품 : d김냉");
			break;
		case "3" : 
			System.out.println("당첨상품 : 세탁기");
			break;
		case "4" :
			System.out.println("당첨상품 : 청소기");
			break;
		default :
			System.out.println(resultMsg1 + " 휴지나 가져가라");
			break;	
		}
	}

}
