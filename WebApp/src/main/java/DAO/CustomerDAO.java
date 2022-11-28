package DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Entity.Customer;

public interface CustomerDAO{
	
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);

	public static Customer getCustomer(int theID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void deleteCustomer(int theID);
	
}
