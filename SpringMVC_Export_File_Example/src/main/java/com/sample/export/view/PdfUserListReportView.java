package com.sample.export.view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sample.model.User;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class PdfUserListReportView extends AbstractPdfView {

 @Override
 protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer, HttpServletRequest request,
   HttpServletResponse response) throws Exception {
  
	// TODO Auto-generated method stub
			DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
	        String currentDateTime = dateFormatter.format(new Date());
	         
	        String headerKey = "Content-Disposition";
	        String headerValue = "attachment; filename=users_" + currentDateTime + ".pdf";
	        response.setHeader(headerKey, headerValue);
			  
  
  @SuppressWarnings("unchecked")
  List<User> list = (List<User>) model.get("userList");
  
  Table table = new Table(4);
  table.addCell("ID");
  table.addCell("USERNAME");
  table.addCell("FIRST NAME");
  table.addCell("LAST NAME");
  
  for(User user : list){
   table.addCell(String.valueOf(user.getId()));
   table.addCell(user.getUsername());
   table.addCell(user.getFirstname());
   table.addCell(user.getLastname());
  }
  
  document.add(table);
 }

} 


