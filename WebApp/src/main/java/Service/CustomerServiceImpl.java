package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.CustomerDAO;
import Entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private CustomerService customerService;
	
	@Override
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		customerService.saveCustomer(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theID) {
		return customerService.getCustomer(theID);
	}

	@Override
	public void deleteCustomer(int theID) {
		customerService.deleteCustomer(theID);
		
	}

}
