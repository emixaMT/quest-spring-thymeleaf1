package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {
    
    @GetMapping("/doctor")
    @RequestMapping(method = RequestMethod.GET)
    public String getDoctor(@RequestParam String name, @RequestParam String number, Model model) {
        
        model.addAttribute("name",name);
        model.addAttribute("number",number);
        if(name=="") {
        	model.addAttribute("name","John Smith");
        }
        if(number=="") {
        	model.addAttribute("number","0");
        }
    	return "doctor";
    }
}
