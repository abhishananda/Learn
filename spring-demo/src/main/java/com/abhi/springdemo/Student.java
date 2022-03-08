package com.abhi.springdemo;

public class Student {
	long id;
	String studentName;
	long age;
	public Student(long id, String studentName, long age) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public String getStudentName() {
		return studentName;
	}
	public long getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Dhaba [id=" + id + ", studentName=" + studentName + ", age=" + age + "]";
	}
	 

}
