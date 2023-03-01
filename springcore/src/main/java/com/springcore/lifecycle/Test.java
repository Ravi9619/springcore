package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/cycleconfig.xml");
		
		Samosa s = (Samosa)context.getBean("s1");
		System.out.println(s);
		context.registerShutdownHook();
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		Pepsi p1 =(Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		Example e1 = (Example)context.getBean("e1");
		System.out.println(e1);
	}

}
