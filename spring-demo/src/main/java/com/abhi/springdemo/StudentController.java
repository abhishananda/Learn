package com.abhi.springdemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/*")
	public List<Student> getStudentName(){
		return Arrays.asList(new Student(1l,"Abhishek", 27), 
								new Student(2l,"Ashish", 25), 
								new Student(2l,"Anand", 24));
	}
}
