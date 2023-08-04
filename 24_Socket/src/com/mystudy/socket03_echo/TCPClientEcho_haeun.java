package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClientEcho_haeun {

	public static void main(String[] args) throws UnknownHostException {
		// (실습) 클라이언트 : 쓰기, 읽기
		// (추가) 보내는 메세지를 Scanner를 사용, 화면에서 직접 입력해서 처리함.
		//-------------------------------
		System.out.println("여기는 클라이언트 PC임.");
		Socket geunyangssoket = null;
		try {
			geunyangssoket = new Socket(InetAddress.getLocalHost(), 1004);
			System.out.println("로컬호스트랑 연결 성공했음. " + geunyangssoket);
				while(true) {
					Scanner a = new Scanner(System.in);
					//-----------------------------------
					// 서버 접속 후 메세지를 한번 보내고, - PrintWriter
					// PrintWriter <- OutputStream
					OutputStream os = geunyangssoket.getOutputStream();
					PrintWriter pw = new PrintWriter(os);
					System.out.print("메세지 입력(더 할말 없으면 스톱 입력) : ");
					String chalmal = a.nextLine();
					pw.println(chalmal);
					pw.flush();
						if (chalmal.equalsIgnoreCase("스톱")) {
							System.out.println("끝~~~");
							break;
						}
					//-------------------------------------
					// 서버에서 보내온 메세지를 받기 - BufferredReader
					// BufferedReader <- InputStreamReader <- InputStream
					InputStream is = geunyangssoket.getInputStream();
					InputStreamReader isr = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(isr);
					String dabjang = br.readLine();
					System.out.print("서버 왈 : ");
					System.out.println(dabjang);
				}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
		        if (geunyangssoket != null) {
		            geunyangssoket.close();
		            System.out.println("소켓 문 닫음");
		        }
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
		
	}

}
