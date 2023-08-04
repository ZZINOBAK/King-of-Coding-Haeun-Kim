
public class Ex09_for_gugudan2 {

	public static void main(String[] args) {
		System.out.print("2*1=" + (2*1) + "\t|");
		System.out.print("3*1=" + (3*1) + "\t|");
		System.out.print("4*1=" + (4*1) + "\t|");
		System.out.print("5*1=" + (5*1) + "\t|");
		System.out.print("6*1=" + (6*1) + "\t|");
		System.out.print("7*1=" + (7*1) + "\t|");
		System.out.print("8*1=" + (8*1) + "\t|");
		System.out.print("9*1=" + (9*1) + "\t|");
		System.out.println();
		System.out.print("2*2=" + (2*2) + "\t|");
		System.out.print("3*2=" + (3*2) + "\t|");
		System.out.print("4*2=" + (4*2) + "\t|");
		System.out.print("5*2=" + (5*2) + "\t|");
		System.out.print("6*2=" + (6*2) + "\t|");
		System.out.print("7*2=" + (7*2) + "\t|");
		System.out.print("8*2=" + (8*2) + "\t|");
		System.out.print("9*2=" + (9*2) + "\t|");
		System.out.println();
		System.out.print("2*3=" + (2*3) + "\t|");
		System.out.print("3*3=" + (3*3) + "\t|");
		System.out.print("4*3=" + (4*3) + "\t|");
		System.out.print("5*3=" + (5*3) + "\t|");
		System.out.print("6*3=" + (6*3) + "\t|");
		System.out.print("7*3=" + (7*3) + "\t|");
		System.out.print("8*3=" + (8*3) + "\t|");
		System.out.print("9*3=" + (9*3) + "\t|");
		System.out.println();
		// \t를 써야 줄 간격을 맞출 수 있음!!

		System.out.println("-----------반복문---(나)-------");
		System.out.println();
		int b1 = 1;
		for (int g = 1; g < 10; g++) {
			System.out.print("2*" + b1 + "=" + (2*b1) + "\t|");
			System.out.print("3*" + b1 + "=" + (3*b1) + "\t|");
			System.out.print("4*" + b1 + "=" + (4*b1) + "\t|");
			System.out.print("5*" + b1 + "=" + (5*b1) + "\t|");
			System.out.print("6*" + b1 + "=" + (6*b1) + "\t|");
			System.out.print("7*" + b1 + "=" + (7*b1) + "\t|");
			System.out.print("8*" + b1 + "=" + (8*b1) + "\t|");
			System.out.print("9*" + b1 + "=" + (9*b1) + "\t|");
			System.out.println();
			b1++;
		}

		System.out.println("-----------반복문---(나)-------");
		int b2 = 1;
		for (int g1 = 1; g1 < 10; g1++) {
			for (int g = 2; g < 10; g++) {
				System.out.print(g + "*" + b2 + "=" + (g*b2) + "\t|");	
			}
			b2++;
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("-----------반복문---(선생님)-------");
		System.out.println("*" + " " + "*" + " " + "*");
		System.out.println("*" + "\t" + "*" + "\t" + "*");
		System.out.println("2*1=2" + "\t" + "3*1=3" + "\t" + "*");
		System.out.println();

		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.print(dan + "*" + i + "=" + (dan*i) + "\t");
			}
			System.out.println();
		}
		// 내가 한거는 변수 선언도 한개 더 했는데, 쌤이 한거는 for 안에 변수만 사용함
		// 쌤 방법으로 하면 더 간결한 코드 가능.
		
		
	}

}
