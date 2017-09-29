package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Customer;

public class CustomerService {
	
	private Map<String, Customer> customerMap;
	
	public CustomerService() {
		customerMap = new HashMap<String, Customer>();
		
		addCustomer(new Customer("id001", "1234", "이윤재"));
		addCustomer(new Customer("id002", "1234", "이예지"));
		addCustomer(new Customer("id003", "1234", "김하늘"));
		addCustomer(new Customer("id004", "1234", "홍성문"));
		addCustomer(new Customer("id005", "1234", "최원균"));
	}
	
	private void addCustomer(Customer customer) {
		customerMap.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id) {
		if(id != null)
			return (customerMap.get(id.toLowerCase()));
		else
			return null;
	}
	public List<Customer> getAllCustomers() {
		List<Customer> customerList = new ArrayList<Customer>(customerMap.values());
		return customerList;
	}

}
