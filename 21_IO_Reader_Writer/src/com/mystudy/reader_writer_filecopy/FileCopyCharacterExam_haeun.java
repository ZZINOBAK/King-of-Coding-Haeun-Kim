package com.mystudy.reader_writer_filecopy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterExam_haeun {

	public static void main(String[] args) {
		// FileReader, FileWriter 사용해서 파일 복사
		// 원본파일 : file/test_char.txt
		// 대상파일 : flle/test_char_copy.txt
		// 처리 : 원본파일에서 읽고, 대상파일에 쓰기/저장(문자단위 처리)
		//-------------------------
		
		//0. 사용할 파일(File) 객체 생성
		File inputFile = new File("file/test_char.txt"); //원본파일
		File outputFile = new File("file/test_char_backup.java"); //복사본
		
		FileReader wonbon = null;
		FileWriter boksabon = null;
		
		try {
			//1. 객체(인스턴스) 생성
			wonbon = new FileReader(inputFile);
			boksabon = new FileWriter(outputFile);
			
			System.out.println(">> 파일복사 시작-----------");
			
			//2. 1byte 읽고, 1byte 쓰기 - read(), write(데이터) 반복처리
			while (true) {
				int readChar = wonbon.read();
				System.out.println("첫번째문자 : " + readChar
						+ ", char : " + (char)readChar);
				
				if (readChar == -1) break; // 이거 안해주면 컴파일 오류
				boksabon.write(readChar); // 이거를 해줘야 파일 안에 내용도 다 복사됨.
				
//				readChar = wonbon.read();
//				System.out.println("첫번째문자 : " + readChar + ", char : " + (char)readChar);
			}
			System.out.println(">> 파일복사 끝============");
			//2. 객체 사용 작업처리(1문자 읽고, 화면에 출력)
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 사용객체 닫기
			if (wonbon != null) {
				try {
					wonbon.close();
				} catch (IOException e) {}
			}
			try {
				if (boksabon != null) boksabon.close();
			} catch (IOException e) {}
		}
	}

}




