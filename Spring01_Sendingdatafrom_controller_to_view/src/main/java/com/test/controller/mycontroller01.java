package com.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mycontroller01 {
	@GetMapping("/modelandview")
	public ModelAndView modelandviewObject()
	{
		ModelAndView model=new ModelAndView("viewpage");
		 model.addObject("msg", "This is example just for fun--(Model And View  Object)");
		//primitive type data
		model.addObject("uname", "Rutuja");
		//Array type data
		String subject[]= {"maths","science","English","Sanskrit"};
		model.addObject("subj",subject);

		//Collection type data
		List<String> friends=new ArrayList<String>();
		friends.add("Pooja");
		friends.add("komal");
		friends.add("syali");
		friends.add("anushka");
		model.addObject("list",(friends));
		
	
	//map tyepe data
	Map<String,Float> map=new HashMap<String,Float>();
	map.put("SSC",(float) 94.18);
	map.put("Diploma",(float) 84.12);
	map.put("B.E",(float) 73.12);
	 model.addObject("marks",map);
	
	return model;
	}
}
