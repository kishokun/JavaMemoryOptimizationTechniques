package com.kuru.escapingreferences.customers;

import com.kuru.escapingreferences.customers.customerImplementation.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();
		records.addCustomer("kk");
		records.addCustomer("kkkk");
		//records.getCustomers().clear();
		
		
		for (Customer cust :records.getCustomers().values()) {
			System.out.println(cust);
		}

	}

}
