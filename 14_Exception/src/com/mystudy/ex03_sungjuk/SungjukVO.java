package com.mystudy.ex03_sungjuk;

public class SungjukVO {
	// 필드변수(속성)------
	String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;	
	
	// 생성자-----------
	public SungjukVO() {
		super();
	}

	public SungjukVO(String name, int kor, int eng, int math, int tot, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}


	// 메소드------------
	public void setName(String name) {
		this.name = name;
	}

	// kor 값 입력시 0 <= kor <= 100 범위일때만 입력처리
	// 범위를 벗어나면 "예외발생 범위 벗어남" 화면출력
	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
		} else {
			System.out.println("예외발생 범위 벗어남");
		} //예외객체를 사용하지 않으면 이렇게 일일히 if else 선언해줘야함.
	}

	// Exception 사용 예외처리
	public void setEng(int eng) throws JumsuOutOfValueException {
		if (eng >= 0 && eng <= 100) {
			this.eng = eng;
		} else {
			//System.out.println("[예외발생] 범위(0~100) 벗어났습니다");
			throw new JumsuOutOfValueException(); //예외 발생시키기
		}
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "SungjukVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	}
	
	
	
	
}
