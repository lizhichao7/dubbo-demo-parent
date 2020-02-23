package com.lizhichao;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动服务者
 * @author 李志超
 *
 */
public class BootStart {
	public static void main(String[] args) throws IOException {
		//加载上下文文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//加载服务器容器
		context.start();
		
		//加一个阻塞
		System.in.read();
	}
}
