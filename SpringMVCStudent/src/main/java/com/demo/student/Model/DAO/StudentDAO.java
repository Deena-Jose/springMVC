package com.demo.student.Model.DAO;

import org.hibernate.Session;
//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.student.DTO.StudentDTO;


@Repository
public class StudentDAO {
	
	 
	@Autowired
    private SessionFactory fact1;
    
	public StudentDAO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	public void addStudent(StudentDTO dto)
	{
		System.out.println("dao strted");
		Session s=fact1.openSession();
		Transaction tx=s.beginTransaction();
		s.save(dto);
		tx.commit();
		s.close();
	}
	}
	

