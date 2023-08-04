package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Ex1 {

	public static void main(String[] args) {
//		File file = new File("temp999.txt"); // 예외 발생함.
		File file = new File("temp.txt"); 
		
		FileInputStream fis = null;
		// 저 = null을 안써주면, 28번줄 fis.close() 이거 오류남.
		try {
			//파일로부터 읽기위한 작업 진행
			//1. 사용할  객체 생성
//			FileInputStream fis = new FileInputStream(file);
			fis = new FileInputStream(file);
			
			//2. 객체 사용 작업 처리
			int readValue = fis.read();
			System.out.println((char)readValue);
			
			System.out.println("--- 전체 데이터 읽어서 화면출력 ---");
			while (true) {
				// EOF(End Of File) 를 만나면(더이상 읽을 것이 없으면) -1 리턴
				readValue = fis.read();
				if (readValue == -1) break; //파일의 끝(EOF)면 읽기종료
				System.out.println("read() int값 : " + readValue);
				System.out.println("(char)read() : " + (char)readValue);
			}
			
		} catch (FileNotFoundException e) { //파일이 없으면 파일낫 예외 발생
//			e.printStackTrace();
			System.out.println("예외 발생" + e.getMessage());
		} catch (IOException e) { //읽거나 쓸때는 ioe 예외 발생
			e.printStackTrace();
		} finally {
			//3. 객체 사용 후 닫기(close)
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
