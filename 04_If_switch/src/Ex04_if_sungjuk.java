
public class Ex04_if_sungjuk {

	public static void main(String[] args) {
		/*
		 성적처리
		 국어kor 영어eng 수학math
		 총점tot 국영수
		 평균avg 총점/국영수
		 
		 평균점수 구간에 따른 평가
		 90-100 A
		 80-89 B
		 70-29 C
		 60-69 D
		 0-59 F 재수강
		*/
		
		//입력
		String name = "김하은";
		double kor = 95.2;
		double eng = 96.7;
		double math = 94.3;
		
		double tot = kor + eng + math;
		double avg = tot/3;
		String result;
		String a;
		String b;
		String c;
		//처리
		
		if (avg < 101 && avg > 89) {
		    a = "A";
		}
	    else if (avg < 90 && avg > 79) {
			a = "B";
	    }
		else if (avg < 80 && avg > 69) {
			a = "C";
		}
		else if (avg < 70 && avg > 59) {
			a = "D";
		}
		else // 엘스에는 조건 붙이면 안됨(avg < 60 && avg >= 0) 
			{
			a = "F";
		}
		
		// 출력
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println("등급 : " + a);
		
		
		// 소수점 이하 만들어보기
		int kor1 = 95;
		int eng1 = 96;
		int math1 = 94;
		
		int tot1 = kor1 + eng1 + math1;
		double avg1 = tot * 100 / 3 / 100.0; 
		// 소수점 이하 둘째 자리까지 구하기
		System.out.println("총점 : " + tot1);
		System.out.println("평균 : " + avg1);

		// ????소수점 이하 셋째 자리까지 구하기?????
		avg = Math.round(tot1 * 100 / 3.0) / 100.0;
		System.out.println("평균 : " + avg);

	}

}
