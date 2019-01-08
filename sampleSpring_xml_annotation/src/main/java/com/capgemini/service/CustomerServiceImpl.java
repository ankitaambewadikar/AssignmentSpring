package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Customer;
import com.capgemini.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	 @Autowired
	private CustomerRepository customerRepository;

	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("using setter injection");
		this.customerRepository = customerRepository;
	}

	public CustomerServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	// @Autowired

	/*
	 * public CustomerServiceImpl(CustomerRepository customerRepository) {
	 * 
	 * System.out.println("using constructor injection "); this.customerRepository =
	 * customerRepository; }
	 */

	@Override
	public List<Customer> findAll() {

		return customerRepository.findAll();

	}
}
