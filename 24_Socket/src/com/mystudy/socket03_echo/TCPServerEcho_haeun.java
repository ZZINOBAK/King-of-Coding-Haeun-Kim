package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerEcho_haeun {

	public static void main(String[] args) {
		// (실습) 서버 : 읽고, 쓰기
		//--------------------------------------------
		System.out.println("서버를 시작하겠다.");
		ServerSocket sseobeossoket = null;
		try {
			sseobeossoket = new ServerSocket(1004);
			Socket geunyangssoket = sseobeossoket.accept();
			System.out.println("클라이언트가 서버에 접속함. " + geunyangssoket);
				while(true) {
					Scanner a = new Scanner(System.in);
					//------------------------------------------------------
					// 클라이언트가 보내온 메시지를 한번 받고(읽기) - BufferedReader
					// BufferedReader <- InputStreamReader <- InputStream
					InputStream is = geunyangssoket.getInputStream();
					InputStreamReader isr = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(isr);
					String chalmal = br.readLine();
						if (chalmal.equalsIgnoreCase("스톱")) {
							System.out.println("끝~~~");
							break;
						}
					System.out.print("클라이언트 왈 : ");
					System.out.println(chalmal);
					//------------------------------------------------------
					// 받은 메시지를 클라이언트에게 다시 보내기 - PrintWriter
					// PrintWriter <- OutputStream
					OutputStream os = geunyangssoket.getOutputStream();
					PrintWriter pw = new PrintWriter(os);
					System.out.print("메세지 입력 : ");
					String shalmal = a.nextLine();
					pw.println(shalmal);
					pw.flush();
				}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
		        if (sseobeossoket != null) {
		        	sseobeossoket.close();
		            System.out.println("소켓 문 닫음");
		        }
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
			
		 }
	
	}

}
