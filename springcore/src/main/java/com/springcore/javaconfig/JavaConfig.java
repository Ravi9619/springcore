package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Cutlet getCutlet()
	{
		return new Cutlet();
	}
	
	@Bean
	public Student getStudent() {
		
		Student student = new Student(getCutlet());
		return student;
	}
	
}
