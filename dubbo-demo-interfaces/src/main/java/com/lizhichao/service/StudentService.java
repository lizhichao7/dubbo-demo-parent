package com.lizhichao.service;

import com.lizhichao.bean.Student;

public interface StudentService {
	
	//根据id获取一个学生
	Student getById(int id);
	
	//增加年龄
	Student addAge(Student stu,int n);
	
	//加法
	int add(int a,int b);
	
	//乘法
	int multiply(int a,int b);
}
