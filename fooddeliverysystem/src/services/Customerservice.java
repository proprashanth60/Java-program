package services;

import java.util.ArrayList;
import java.util.List;

import fooddeliverysystem.Customer;

public class Customerservice {
	 private List<Customer> customerList = new ArrayList<>();

	    public void addCustomer(Customer customer) {
	        customerList.add(customer);
	    }

	    // retrieve Customer by ID
	    public Customer getCustomer(int userId) {
	        // return customer based on customerID
	        return null;
	    }

	    public List<Customer> getCustomers() {
	        return customerList;
	    }
	}