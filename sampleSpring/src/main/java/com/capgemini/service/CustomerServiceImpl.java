package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Customer;
import com.capgemini.repository.CustomerRepository;
import com.capgemini.repository.HibernateCustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepository();
	
	/* (non-Javadoc)
	 * @see com.capgemini.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
		
	}
}
