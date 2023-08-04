package com.mystudy.ex06_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectInputOutputStream2_List_haeun {

	public static void main(String[] args) {
		//(실습) StudentVO 객체들을 ArrayList에 담아서 파일에 저장하고
		StudentVO stu1 = new StudentVO("김유신", 95, 85, 75);
		StudentVO stu2 = new StudentVO("홍길동", 100, 90, 81);
		
		ArrayList<StudentVO> list = new ArrayList<>();
		list.add(stu1);
		list.add(stu2);

		File file = new File("file/object_io_haeun.data");
		
		// 파일에서 읽어들인 ArrayList 객체에 담긴 VO 데이터를 화면 출력
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(list); 
			// 오브젝트아웃풀스트림이 객체단위를 출력하는 클래스라서 객체인 list를 넣은듯.
			// 여기서 파일에 list 내용을 적어 넣은거임.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) oos.close();
			} catch (IOException e) {}
		}
		//------------------------------------------
		// VO 데이터 생성 --> List에 저장 --> List를 파일에 출력
		// 파일에서 List 읽기 --> List에 있는 VO 가져다 화면 출력
		ObjectInputStream ois = null;
		// 아까 쓴 내용을 오브젝트인풋스트림으로 읽어내는거임.
		
			try {
				ois = new ObjectInputStream(new FileInputStream(file));
				// 저 new 스트림(new 스트림) 이런 형태는
				// Java에서 스트림을 연결해서 사용할때 사용하는 방법임.
				// 저 파일인풋스트림이 오브젝트인풋 클래스의 생성자로 선언된거임.
				// 먼저 파일인풋이 파일을 바이트 단위로 읽음.
				// 그 다음 오브젝트인풋이 바이트스트림을 객체 단위로 변환해서 읽어냄.
				// 그럼 오브젝트로는 바로 못읽나보네?????
				
				ArrayList<StudentVO> list1 = (ArrayList<StudentVO>) ois.readObject();
				// 여기서 new를 안써주는 이유가 저 리드오브젝트 메소드가 이미 생성된 객체를 읽어오는게 아니라
				// 새로운 객체를 생성하기 때문이라고 함. 저 메소드 지가 새 객체를 생성하니까 new 안써줘도 된다고 함.
				// (ArrayList<StudentVO>) 이부분은 읽어온 데이터가 ArrayList<StudentVO> 타입이라는 것을
				// 명시적으로 알려주는 역할이라고 함. 아 리드오브젝트 메소드가 리턴하는 값은 오브젝트타입인데, 
				// 그거를 어레이리스트 타입으로 바꿔주라고 선언하는거네.
				
				System.out.println("오늘은 집에갈거야");
				System.out.println(list1.get(0));
				System.out.println(list1.get(1));
				System.out.println("왜냐하면 졸리니까");
				
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
