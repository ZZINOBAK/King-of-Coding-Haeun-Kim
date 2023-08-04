
public class Ex02_if_else {

	public static void main(String[] args) {
		// if문 3종류
		// if (조건) {}
		// if (조건) {} else {}
		// if (조건) {} else if {} else if () {} ... else {} 
		
		int num1 = 10;
		int num2 = 50;
		System.out.println("n1 : " + num1 + ", n2 : " + num2);
		
		//1. if(조건) {}
		if (num1 > num2) {
			System.out.println("n1 > n2 : " + (num1 > num2));
			System.out.println("n1이 n2보다 크다.");
		}
		if (num1 <= num2) {
			System.out.println("n1이 n2보다 작거나 같다.");
		}
		System.out.println(">> if () 끝");
		System.out.println("-------------------------------");
		
		//2. if (조건) {} else {}
		if (num1 > num2) {
			System.out.println("n1이 n2보다 크다.");
		} else {
			System.out.println("n1이 n2보다 작거나 같다.");
		}
		System.out.println(">> if ~ else 끝");
		System.out.println("-------------------------------");
		
		//3. if (조건) {} else if {} else  if {} ... else {}
		num1 = 100;
		num2 = 50;
		System.out.println("n1 : " + num1 + ", n2 : " + num2);

		if (num1 > num2) {
			System.out.println("n1이 n2보다 크다.");
		} else if (num1 == num2) {
			System.out.println("n1이 n2보다 같다.");
			System.out.println("n1이 n2보다 작다.");
		} else {
			System.out.println("n1이 n2보다 어떤지 모른다.");
		}
		
		System.out.println("-------------------------------");

		/*
		 수 90-100
		 우 80-89
		 미 70-79
		 양 60-69
		 가 0-59
		 */
		
		// 여기부터 입력
		System.out.println("성적처뤼~~~~");
		String name = "김하은";
		int jeomssu = -100;
		String result = "평가안됨";
		// 여기까지 입력
		
		// 이 밑에는 실습
		System.out.println(name);
		System.out.println(jeomssu);
		

		if(jeomssu > 89) {
			System.out.println(name + "의 성적은 " + "수");
		} else if(jeomssu >= 80) {
			System.out.println(name + "의 성적은 " + "우");
		} else if(jeomssu > 69) {
			System.out.println(name + "의 성적은 " + "미");
		} else if(jeomssu >= 60) {
			System.out.println(name + "의 성적은 " + "양");
		} else {
			System.out.println(name + "의 성적은 " + "가");
		}
		System.out.println("-------------------------------");

		if(jeomssu < 0 || jeomssu > 100) {
			result = "뤙 스코어";
		} else if(jeomssu > 89) {
			result = "수";
		} else if(jeomssu >= 80) {
			result = "우";
		} else if(jeomssu > 69) {
			result = "미";
		} else if(jeomssu >= 60) {
			result = "양";
		} else {
			result = "가";
		}
		System.out.println("결과 : " + result);

		System.out.println("-------------------------------");

		//처리
		if (jeomssu >= 90 && jeomssu <= 100) {
			result = "수";
		}
			
			
			//출력 -------------
			System.out.println("이름 : " + name);
		System.out.println("점수 : " + jeomssu);
		System.out.println("평가결과 : " + result);
		System.out.println("---------성적처리 끝 --------");
		
		// 데이터 입력 부분과
		// 데이터 처리 부분과
		// 데이터 출력 부분을
		// 구분해서 코딩을 하면 보기 편리
		// 입력, 처리, 출력
		
		
		
		// if 문 내 여러개 if문 사용 가능 다만,
		//될 수 있으면 3번째 중복은 피하삼.
		
		/* if () {
		      if () {
		         if () {
		         } else {
		         }
		      }
		   } else {
		       if () {
		       } else if () {
		       } else if () {
		       } else {
		       }
       */
		
		
	}

}
