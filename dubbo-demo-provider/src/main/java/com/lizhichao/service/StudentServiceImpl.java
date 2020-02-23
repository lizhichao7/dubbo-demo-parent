package com.lizhichao.service;

import com.lizhichao.bean.Student;

public class StudentServiceImpl implements StudentService{

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setAge(20);
		student.setId(id);
		student.setName(" 王五 "+id);
		
		return student;
	}

	@Override
	public Student addAge(Student stu, int n) {
		// TODO Auto-generated method stub
		
		//增加年龄
		stu.setAge(stu.getAge()+n);
		
		return stu;
	}
	
	//加法
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	//乘法
	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
