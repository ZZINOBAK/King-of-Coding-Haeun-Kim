package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_2_haeun {

	public static void main(String[] args) {
		//(실습) Ex3_1 파일을 반복문으로 변경
		
		//0. 사용할 파일객체 생성
		File pail = new File("file/test02.txt");
		
		//1. 파일을 읽어서 작업할 객체 생성(FileInputStream)
		FileInputStream geakchae = null;
		
		try {
			geakchae = new FileInputStream(pail);
			
			//2. 객체 사용 파일데이터 읽어서 화면 출력
			//   (byte[] 사용, 반복문으로 반복처리)
			byte[] bytes = new byte[50];
			System.out.println("bytes : " + Arrays.toString(bytes));
			
			int gaesu = geakchae.read(bytes);
			System.out.println("읽은개수 : " + gaesu);
			System.out.println(Arrays.toString(bytes));
			for (int i = 0; i < gaesu; i++) {
				System.out.print("int: " + bytes[i] 
						+ ", char: " + (char)bytes[i] + " / ");
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 사용객체 닫기(close)
			
		}
		
		
	}

}
