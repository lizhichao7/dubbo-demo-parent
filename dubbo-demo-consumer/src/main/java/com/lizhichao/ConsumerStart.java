package com.lizhichao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lizhichao.bean.Student;
import com.lizhichao.service.StudentService;

public class ConsumerStart {
	private static ClassPathXmlApplicationContext context;
	private static StudentService studentService;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("classpath:ApplicantionContext.xml");
		
		studentService = context.getBean(StudentService.class);
		
		Student student = studentService.getById(20);
		
		System.out.println("student is "+ student);
		
		Student addAge = studentService.addAge(student, 3);
		
		System.out.println("加岁数以后的数据"+addAge);
		
		int i = studentService.add(2, 3);
		
		System.out.println("加法的数据" +i);
		
		int multiply = studentService.multiply(2, 3);
		
		System.out.println("乘法的数据"+multiply);
	}
}
