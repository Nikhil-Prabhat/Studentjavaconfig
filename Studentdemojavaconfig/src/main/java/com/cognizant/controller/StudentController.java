package com.cognizant.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.model.Student;
import com.cognizant.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentservice;

	public StudentService getStudentservice() {
		return studentservice;
	}

	public void setStudentservice(StudentService studentservice) {
		this.studentservice = studentservice;
	}
	
	@RequestMapping("/insert")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mv = new ModelAndView();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int result = studentservice.insert(new Student(id,name));
		if(result > 0)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failure");
		}
		
		mv.setViewName("index.jsp");
		return mv;
		
	}
	
}
