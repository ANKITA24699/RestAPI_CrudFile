package com.bootdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootdemo.dto.Student;
import com.example.repository.StudentRepository;

@RestController
public class Controller4 {
      
	@Autowired
	StudentRepository sr;
	
	
	@PostMapping("/savestud")
	public String saveStudent(@RequestBody Student stud ) {
	sr.save(stud);
	return "data is saved!";
	}
	
	@DeleteMapping("/deletestud")
	public String delete(@RequestParam int id) {
	  sr.deleteById(id);
		return "data is deleted";
	}
	
	@GetMapping("/fetchstud")
	public Student fetchdataById(@RequestParam int id) {
		Optional<Student> o = sr.findById(id);
		Student stud = o.get();
		return stud;
	}
	
	@GetMapping("/fetch")
	public List<Student> fetchdataByName(@RequestParam String name){
	List<Student> stud = sr.findByName(name);
	return stud;
	}
	
	@PutMapping("/updatestud")
	public String Updatestudent(@RequestBody Student stud) {
		sr.save(stud);
		return "Value is updated!!";
	}
	
	@PutMapping("/fetchall")
	public List<Student> fetchAlldata(){
		List <Student> student = sr.findAll();
		return student;
	}
	

	
	
}
