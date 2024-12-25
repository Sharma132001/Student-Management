package com.example.Studentdb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Studentdb.model.Student;


@Repository
public interface Resp extends JpaRepository<Student,Integer>{
    
}
