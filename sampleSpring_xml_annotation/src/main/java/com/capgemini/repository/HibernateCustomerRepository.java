package com.capgemini.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Customer;

@Primary
@Repository
public class HibernateCustomerRepository implements CustomerRepository {

	@Override
	public List<Customer> findAll(){
		 
		 List<Customer> customers = new ArrayList<Customer>();
		 
		 Customer customer = new Customer();
		 customer.setFirstName("Ankita");
		 customer.setLastName("Ambewadikar");
		 customers.add(customer);
		return customers;
	 }
}
