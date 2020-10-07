package com.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller
{
	 @GetMapping("/")
	    public String index() {
	        return "index";
	    }

	 @GetMapping("/model")
	 public String modelObject(Model model)
	 {
		 model.addAttribute("msg", "This is example just for fun--(Model Object)");
		 //simple data
		 String name="Rutuja Bagade";
		 model.addAttribute("uname",name);
		 //collection tyepe data
		 List<String> list=new ArrayList<String>();
		 list.add("kunal");
		 list.add("Nita");
		 list.add("Bapu");
		 list.add("Nandu");
		 model.addAttribute("members",list);
		 //hashset type data
		 Map<Integer,String> hm=new HashMap<Integer,String>();
		 hm.put(100,"Amit");
		 hm.put(101,"Vijay");
		 hm.put(102,"Rahul");
		 model.addAttribute("histogram", (hm));
		 
		 //Array type data
		 int no[]= {10,20,30,40,50};
		 model.addAttribute("num", (no));
		 return "modeltype";
	 }
	 
	  

}
