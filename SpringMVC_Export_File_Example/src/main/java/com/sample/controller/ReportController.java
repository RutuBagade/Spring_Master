package com.sample.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.export.view.CSVUserListReportView;
import com.sample.export.view.ExcelUserListReportView;
import com.sample.export.view.PdfUserListReportView;
import com.sample.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class ReportController {
 
 @RequestMapping(value="/report", method=RequestMethod.GET)
 public ModelAndView userListReport(HttpServletRequest req, HttpServletResponse res){
  
  String typeReport = req.getParameter("type");
  
  List<User> list = new ArrayList<User>();
  list.add(new User(1, "Employ123 1", "komal 1", "kumavat "));
  list.add(new User(2, "Teacher123 2", "Sagar 2", "Ranavare"));
  list.add(new User(3, "Employee234", "tushar", "Mundravale"));
  list.add(new User(4, "Employee236", "Rutuja", "Bagade"));
  list.add(new User(5, "Student012", "priyanaka", "Kadam"));
  
  if(typeReport != null && typeReport.equals("xls")){
   return new ModelAndView(new ExcelUserListReportView(), "userList", list);
  } else if(typeReport != null && typeReport.equals("pdf")){
   return new ModelAndView(new PdfUserListReportView(), "userList", list);
  }
  else if(typeReport != null && typeReport.equals("csv")){
	   return new ModelAndView(new CSVUserListReportView(), "userList", list);
	  }
  
  return new ModelAndView("userListReport", "userList", list);
 }
}