package com.fileupload.controller;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringJoiner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.fileupload.dao.IFileUploadDao;
import com.fileupload.entity.UploadFile;

@Controller
public class FileUploadDownloadController {
	// save uploaded file to this folder
    private static String UPLOADED_FOLDER = "E://temp//";
	@Autowired
	IFileUploadDao dao;
	
@GetMapping("/fileuploadPage")
 public String getFileUploadPage()
 {
	 return "FileUpload";
 }
	@PostMapping("/doUpload")
	public String handleFileUpload(@RequestParam("file")MultipartFile[] cmf, Model model)
	{
		StringJoiner sj = new StringJoiner(" , ");
	
		//System.out.println(cmf);
		for(MultipartFile file:cmf)
		{
			   if (file.isEmpty()) {
		             continue; //next pls
		         }
		
		         try {

		             byte[] bytes = file.getBytes();
		            
		            
			UploadFile uploadFile =new UploadFile();
			uploadFile.setFileName(file.getOriginalFilename());
			uploadFile.setFileData(bytes);
			dao.saveFile(uploadFile);}
		         catch (IOException e) {
		             e.printStackTrace();}
		}
		model.addAttribute("message","File(s) uploaded Successfully");
		return "FileUpload";
		
	


}
	@GetMapping("/downloadPage")
	public String getDownloadPage(Model model)
	{
		List<Object[]> filesList=dao.getFileIdsAndNames();
		model.addAttribute("files",filesList);
		return "FileDownload";
	}
	@GetMapping("/doDownload")
	public void downloadFile(HttpServletResponse response,@RequestParam("fileid")Integer fileId)
	{
		UploadFile uploadFile=dao.loadFile(fileId);
		 response.setHeader("Content-Disposition", "attachment; filename="+ uploadFile.getFileName());
		 try
         {
             FileCopyUtils.copy(uploadFile.getFileData(), response.getOutputStream());
             
         } 
         catch (IOException ex) {
            System.out.println(ex);
         }
	}
	
}
