package com.mystudy.ex02_buffered_filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBufferedTest {

	public static void main(String[] args) {
		// BufferedInputStream, BufferedOutputStream 적용
		// 파일복사(binary) : img102.jpg -> img102_copy.jpg
		// File --> FileInputStream --> BufferedInputStream
		//---------------------------
		
		File inputFile = new File("file/img102.jpg");
		File outputFile = new File("file/img102_copy.jpg");
		
		// 파일로 부터 읽고, 쓰기 위한 객체(인스턴스)를 저장하기 위한 변수
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//버퍼(buffer) 사용을 위한 변수 선언
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			// 파일 읽고, 쓰기 위한 객체 생성
			fis = new FileInputStream(inputFile);
			fos = new FileOutputStream(outputFile);
			
			System.out.println(">> 파일 복사 시작(버퍼없이) ---------");
			long startTime = System.currentTimeMillis();
			
			// 파일복사(버퍼없이) : 바이트(byte) 단위 읽고, 쓰기
			int readValue = fis.read();
			while (readValue != -1) {
				fos.write(readValue);
				readValue = fis.read();
			}
			long endTime = System.currentTimeMillis();
			System.out.println(">> 파일 복사 끝(버퍼없이) ---------");
			System.out.println("startTime : " + startTime);
			System.out.println("endTime   : " + endTime);
			System.out.println("byte 복사시간 : " + (endTime - startTime) + " (ms)");
			
			fis.close();
			fos.close();
			
			System.out.println("==================");
			// 버퍼 기능이 있는 클래스로 구현
			// File --> FileInputStream --> BufferedInputStream
			bis = new BufferedInputStream(new FileInputStream(inputFile), 1000);
			
			// String --> FileOutputStream --> BufferedOutputStream
			bos = new BufferedOutputStream(
					new FileOutputStream("file/img102_buf_copy.jpg"), 1000);
			
			System.out.println(">> 파일 복사 시작(버퍼사용) ---------");
			startTime = System.currentTimeMillis();
			//버퍼기능 사용 파일복사
			readValue = bis.read();
			while (readValue != -1) {
				bos.write(readValue);
				readValue = bis.read();
			}
			endTime = System.currentTimeMillis();
			System.out.println(">> 파일 복사 끝(버퍼사용) ---------");
			System.out.println("buffer 복사시간 : " + (endTime - startTime) + " (ms)");
		
			bos.close();
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
