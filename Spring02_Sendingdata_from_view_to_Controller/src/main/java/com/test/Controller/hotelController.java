package com.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class hotelController {
	@GetMapping("/")
	public String Welcomepage()
	{
		return "index";
	}

	@GetMapping("/placeorder")
	public String placeorder()
	{
		return "PlaceOrder";
	}
	
	@PostMapping("/processorder")
	public String TakeOrder(@RequestParam("fooditem") String item,@RequestParam("quantity") String quantity,@RequestParam("check") String check,Model m )
	{
		System.out.println(item);
	
		System.out.println(quantity);
		System.out.println(check);
		
			m.addAttribute("fooditem",item);
			m.addAttribute("foodquatity",quantity);
			
			return "viewpage";
			
		
		
		
	}
	
}
