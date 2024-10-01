package com.demo.student.Controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;

import com.demo.student.DTO.StudentDTO;
import com.demo.student.Model.Service.RegistrationService;
	
	@Controller
	public class RegistrationController {
		@Autowired
		private RegistrationService ser;
		
		
		public RegistrationController() {
			System.out.println("cntrlr object creted");
		}


		@RequestMapping(value = "/register.do", method = RequestMethod.GET)
		public ModelAndView add(StudentDTO dto)
		{
			System.out.println("dto="+dto);
			System.out.println("hi in cntrlr");
			ser.addService(dto);
			return new ModelAndView("add.jsp");
		}

	}


