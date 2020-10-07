package com.app.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.app.beans.Student;
import com.app.service.IStudentService;



@Controller
public class StudentController {
	@Autowired
	private IStudentService service;
	
	
	/* #1 Show StudentRegister JSP,
	* when /reg is entered in browser
	*/
	
	@GetMapping("/reg")
	public String showRegPage(ModelMap map)
	{
	map.addAttribute("student", new Student());
	return "StudentRegister";
	}
	
	@PostMapping(value="/insert")
			//***read modelAttribute, next param must be Errors
	public String saveEmp(@Valid @ModelAttribute("student") Student stud, BindingResult result,Model map) {
		if(result.hasErrors())
		{
			//save data to DB
			
			map.addAttribute("message", "failed");
			
			return "StudentRegister";
			}
		else
			{//if errors exist
				int studId=service.save(stud);
				//show success message
				
				map.addAttribute("message", "Inserted Successfullly.");
				//clear form
				map.addAttribute("student", new Student());
			}
			//finally goto UI page
			return "StudentRegister";
			}
}
		
		
		
		

		
	/*//check validation errors
	validator.validate(stud, errors);
	//if no errors
	if(!errors.hasErrors()) {
	//save data to DB
	int studId=service.save(stud);
	//show success message
	String msg=message.getMessage("success", new Object[] {studId}, locale);
	map.addAttribute("message", msg);
	//clear form
	map.addAttribute("student", new Student());
	}else {//if errors exist
	String msg=message.getMessage("fail", null,locale);
	map.addAttribute("message", msg);
	}
	//finally goto UI page
	return"StudentRegister";
	}*/
	