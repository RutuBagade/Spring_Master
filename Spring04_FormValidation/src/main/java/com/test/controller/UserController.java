package com.test.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.model.User;

@Controller
public class UserController {
	@GetMapping("/init")
    public String initView(Model model) {
        model.addAttribute("userform", new User());
        return "login";
    }
 
    @RequestMapping(value= "/login", method= RequestMethod.POST)
    public String doLogin(@Valid @ModelAttribute("userform") User user, BindingResult result,Model map) {
        if (result.hasErrors()) {
            return "login";
        }
 System.out.println(user.getName());
 System.out.println(user.getEmail());
 map.addAttribute("userform", user);
        return "success";
    }
}
