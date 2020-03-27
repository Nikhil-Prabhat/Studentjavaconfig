package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.StudentDao;
import com.cognizant.model.Student;

@Component
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentdao;
	
	public int insert(Student student) {
		
		int insert = studentdao.insert(student);
		return insert;
		
	}

}
