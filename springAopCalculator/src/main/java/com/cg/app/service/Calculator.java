package com.cg.app.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

	public Integer add(int numOne,int numTwo) {
		System.out.println("Inside add method");
		return numOne+numTwo;
	}
	
	public Integer addition(int numOne, int numTwo) {
		throw new RuntimeException();
	}
	
	public Integer division(int numOne, int numTwo) {
		return numOne / numTwo;
	}
}