package com.capgemini.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Customer;


@Repository
public class JDBCCustomerRepository implements CustomerRepository {

	 /* (non-Javadoc)
	 * @see com.capgemini.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		 
		 List<Customer> customers = new ArrayList<Customer>();
		 
		 Customer customer = new Customer();
		 customer.setFirstName("Shubham");
		 customer.setLastName("Ambewadikar");
		 customers.add(customer);
		return customers;
	 }
}
