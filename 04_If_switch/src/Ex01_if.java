

public class Ex01_if {

	public static void main(String[] args) {
		/* [제어문] 
		   1. 분기문(비교문) 
		      - if 문
		        if () {
		        실행할 문장들 여기에 작성(조건이 참일 때); 
		        } else () {
		          실행할 문장실 여기에 작성(조건이 거짓일 때);
		          }
		 */
		
		int num1 = 10;
		int num2 = 100;
		// if 다음 소괄호 무조건 넣으333
		if (num1 < num2) {
			System.out.println("n1이 n2보다 작다.");
		}
		System.out.println(">> 비교작업 finish");
		
		System.out.println("----------------------------------");

		int num3 = 10000;
		int num4 = 100;
		if (num3 < num4) {
			System.out.println("n3이 n4보다 작다.");
		} 
		System.out.println(">> 비교작업 finish");
		// 트루일때만 if 안에 실행문 출력됨!!! 
		// 그래서 이거 실행 안되네
		System.out.println("----------------------------------");

		int num5 = 10000;
		int num6 = 100;
		if (num5 < num6) {
			System.out.println("n3이 n4보다 작다.");
		} else 
			System.out.println("땡");
		System.out.println(">> 비교작업 finish");
		// 그래서 엘스 실행~~
		System.out.println("----------------------------------");
		
		boolean result = num1 < num2;
		if(result) {
			System.out.println("n1이 n2보다 작다");
		}
		System.out.println("비교작업 끝");
		//////이렇게도 되는군. 저 리절트가 트루니까 실행됐는데 폴스면 뭐지?
		System.out.println("----------------------------------");
		
		boolean result1 = num1 > num2;
		if(result1) {
			System.out.println("n1이 n2보다 작다");
		}
		System.out.println("비교작업 끝");
		//////아 폴스니까 실행 안되네.
		System.out.println("----------------------------------");
		
		boolean result2 = num1 > num2;
		if(result2) {
			System.out.println("n1이 n2보다 작다");
		}else {
			System.out.println("폴스폴스");
		}
		System.out.println("비교작업 끝");
		//////엘스를 넣으니 되는군
		System.out.println("----------------------------------");
		
		
		/*
		 수 90-100
		 우 80-89
		 미 70-79
		 양 60-69
		 가 0-59
		 */
		
		System.out.println("성적처뤼~~~~");
		String name = "김하은";
		int jeomssu = 100;
		
		System.out.println(name);
		System.out.println(jeomssu);
		String result3;// 여기서 선언할 때는 데이터 공간만 확보 데이터 값은 설정 안함.
		
		if(jeomssu > 89) {
			System.out.println(name + "의 성적은 " + "수");
			}
		
		if(jeomssu > 79) {
			System.out.println(name + "의 성적은 " + "우");
			}
		////이렇게 하면 수 우 다 출력돼버림.
		
		System.out.println("----------------------------------");

		if(jeomssu > 89 && jeomssu < 101) {
			//System.out.println(name + "의 성적은 " + "수");
			System.out.println(result3 = "수"); // 위에서 리절트 선언만해서 공간 확보 해 둔 것을 
			// 여기서 리절트 값을 설정함.
		}
		
		if(jeomssu > 79 && jeomssu < 90) {
			//System.out.println(name + "의 성적은 " + "우");
			result3= "우";
			}// 이런게 하면 수만 출력됨.	
		
		if(jeomssu > 69 && jeomssu < 80) {
			//System.out.println(name + "의 성적은 " + "미");
			result3= "미";
		}
		
		if(jeomssu > 59 && jeomssu < 70) {
			//System.out.println(name + "의 성적은 " + "양");
			result3= "양";
		}
		
		if(jeomssu >= 0 && jeomssu < 60) {
			//System.out.println(name + "의 성적은 " + "가");
			result3= "가";
		}

		System.out.println("-----------------------------");

	
		if(jeomssu > 89) {
			System.out.println(name + "의 성적은 " + "수");
			} else if(jeomssu >= 80) {
				System.out.println(name + "의 성적은 " + "우");
				} else if(jeomssu > 69) {
					System.out.println(name + "의 성적은 " + "미");
					} else if(jeomssu >= 60) {
						System.out.println(name + "의 성적은 " + "양");
						} else if(jeomssu < 60) {
							System.out.println(name + "의 성적은 " + "가");
							}
		
		
		
		
		
		
		
		
	}

}
