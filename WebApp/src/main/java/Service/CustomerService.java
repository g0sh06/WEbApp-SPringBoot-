package Service;

import java.util.List;

import Entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theID);
	
    public void deleteCustomer(int theID);
}
