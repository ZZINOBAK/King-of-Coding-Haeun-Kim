package com.mystudy.ex03_isr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_Exam_haeun {

	public static void main(String[] args) {
		//(실습)OutputStreamWriter 객체 생성해서 텍스트 출력 하삼
		// 안녕 Hello 자바 Java ~!@#$%
		try {

		File infile = new File("file/test_isr.txt");
		File outfile = new File("file/test_osw.txt");
		
		FileInputStream inpail = null;
		FileOutputStream outpail = null;

		InputStreamReader in = null;
		OutputStreamWriter aut = null;
		
		BufferedWriter buperw = null;
		BufferedReader buperr = null;
		
			inpail = new FileInputStream(infile);
			outpail = new FileOutputStream(outfile);
			
			in = new InputStreamReader(inpail);
			aut = new OutputStreamWriter(outpail);
			
			buperw = new BufferedWriter(aut);
			buperw.write("안녕\n");
			buperw.write("Hello\n");
			buperw.write("자바\n");
			
			buperw.flush();
			buperr = new BufferedReader(in);
			String chulyuk = buperr.readLine();
			System.out.println(chulyuk);
			
			buperw.write("안녕\n");
			
			chulyuk = buperr.readLine(); //EOF : null 리턴
			while (chulyuk != null) {
				buperw.write(chulyuk); //문자열 출력
				chulyuk = buperr.readLine();
				if (chulyuk != null) {
					buperw.newLine(); //줄바꿈처리
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try {
//				if (buperr != null) buperr.close();
//			} catch (IOException e) {}
//			try {
//				if (buperw != null) buperw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
		System.out.println("메인 출려 끝");
		

		
	}

}
