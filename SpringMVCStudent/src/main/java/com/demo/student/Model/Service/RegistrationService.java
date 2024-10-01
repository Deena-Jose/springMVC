package com.demo.student.Model.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.student.DTO.StudentDTO;
import com.demo.student.Model.DAO.StudentDAO;

@Service
public class RegistrationService {
	@Autowired
	private StudentDAO dao;
	public RegistrationService() {
		System.out.println("service object creted");
	}
   
	
	public void addService(StudentDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("hi in service");
		dao.addStudent(dto);
	}

}
