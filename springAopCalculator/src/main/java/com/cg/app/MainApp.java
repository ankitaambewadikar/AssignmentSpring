package com.cg.app;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.app.service.Calculator;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Calculator calc = context.getBean(Calculator.class);
		/*
		 * calc.add(10,20); try { calc.addition(0,-10); }catch (Exception e) { // TODO:
		 * handle exception }
		 */
		
		System.out.println(calc.division(10, 0));
		//System.out.println(calc.add(10, 0));
	}

}
