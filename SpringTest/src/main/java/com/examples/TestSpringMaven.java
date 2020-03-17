package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringMaven 
{
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloBean bean=(HelloBean)context.getBean("helloWorldService");
		bean.sayHello();
	}

}
