package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.Employee;

@Controller
public class EmployeeController {
	@RequestMapping("/show")
	public ModelAndView show() {
	ModelAndView mav = new ModelAndView();
	mav.setViewName("Register");
	return mav;
	}
	@RequestMapping("/reg")
	public ModelAndView Register(@ModelAttribute("employee")Employee emp) {
	ModelAndView mav = new ModelAndView();
		mav.setViewName("viewdetails");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpPwd());
		System.out.println(emp.getEmpGen());
		System.out.println(emp.getEmpAddr());
		System.out.println(emp.getEmpCountry());
	
		mav.addObject("emp" , emp);
	     return mav;
}
}