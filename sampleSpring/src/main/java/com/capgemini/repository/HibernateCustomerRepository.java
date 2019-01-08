package com.capgemini.repository;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Customer;

public class HibernateCustomerRepository implements CustomerRepository {

	 /* (non-Javadoc)
	 * @see com.capgemini.repository.CustomerRepository#findAll()
	 */
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
