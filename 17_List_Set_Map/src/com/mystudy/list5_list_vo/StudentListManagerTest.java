package com.mystudy.list5_list_vo;

import java.util.List;

import com.mystudy.map2_exam_vo.StudentVO;

public class StudentListManagerTest {

	public static void main(String[] args) {
		
		StudentVO gildong = new StudentVO("홍길동", 100, 90, 81);
		
		
		StudentListManager guanli = new StudentListManager();
		guanli.insert(gildong);
		
		
		System.out.println(guanli);

		//		List<StudentVO> list = manager.selectAll();

		
	}

}
