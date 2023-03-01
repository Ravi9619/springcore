package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

import com.springcore.lifecycle.Samosa;


public class Student {
	
	private Cutlet cutlet;


	public Student(Cutlet cutlet) {
		super();
		this.cutlet = cutlet;
	}

	public Cutlet getCutlet() {
		return cutlet;
	}


	public void setCutlet(Cutlet cutlet) {
		this.cutlet = cutlet;
	}


	public void study()
	{
		this.cutlet.display();
		System.out.println("student is reading book");
	}
	
}
