package com.example.Studentdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Studentdb.model.Student;
import com.example.Studentdb.service.Studentservice;

@Controller
public class Homecontroller {
	@Autowired
	Studentservice obj;
   
	@GetMapping("/home")
	public String open() {
		return "index";
	}
	
	@PostMapping("abc")
	public String open1(Student s){
		obj.get(s);
		return "success";
	}
	@GetMapping("/select")
	public String open3(Model m) {
			m.addAttribute("abc",obj.get1());
			return "select";
		
	
	}
}
