package com.example.Studentdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Studentdb.dao.Resp;
import com.example.Studentdb.model.Student;

@Service
public class Studentservice {
	@Autowired
	Resp res;
   
	public void get(Student s) {
		res.save(s);
	}
	public List<Student> get1(){
		return res.findAll();
	}
}