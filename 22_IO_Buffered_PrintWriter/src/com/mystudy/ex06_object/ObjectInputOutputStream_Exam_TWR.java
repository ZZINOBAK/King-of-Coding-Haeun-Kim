package com.mystudy.ex06_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStream_Exam_TWR {

	public static void main(String[] args) {
		// ObjectInputStream, ObjectOutputStream
		// Object 타입의 데이터를 사용해서 입출력(I/O)
		//-------------------------
		// Object 타입의 데이터를 파일에 저장하고 읽어오기(StudentVO)
		
		// 파일에 저장할 데이터 준비
		System.out.println("--- 저장할 데이터 준비 -----");
		StudentVO stu1 = new StudentVO("김유신", 95, 85, 75);
		stu1.setPhoneNo("010-1111-1111");
		StudentVO stu2 = new StudentVO("홍길동", 100, 90, 81);
		stu2.setPhoneNo("010-2222-2222");
		
		System.out.println("stu1 : " + stu1);
		System.out.println("stu2 : " + stu2);
		System.out.println("==================");
		
		File file = new File("file/object_io.data");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		// Java7부터 제공된 문법임. try~with~resource 구문으로 작성함.
		// try (변수선언 및 생성구문) {} catch(){}
		// AutoCloseable 인터페이스 구현된 클래스만 사용가능
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			System.out.println(">>> 파일에 쓰기 - ObjectOutputStream 사용");
			// NotSerializableException : Seirializable 아님 예외
			oos.writeObject(stu1); // StudentVO 데이터 하나 출력(쓰기)
			oos.writeObject(stu2);
			
			System.out.println(">>> 파일에 쓰기 완료 ------");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) oos.close();
			} catch (IOException e) {}
		}

		System.out.println("====== 파일에서 읽어서 화면 출력 ========");
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			
			System.out.println(">>> 파일로 부터 StudentVO 데이터 읽기");
			StudentVO stuIn1 = (StudentVO) ois.readObject();
			StudentVO stuIn2 = (StudentVO) ois.readObject();
			
			System.out.println("stuIn1 : " + stuIn1);
			System.out.println("stuIn2 : " + stuIn2);
			System.out.println("-----------");
			System.out.println(stuIn1.getName() + ", " + stuIn1.getTot()
					+ ", " + stuIn1.getAvg());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) ois.close();
			} catch (IOException e) {}
		}
		
		
	}

}





