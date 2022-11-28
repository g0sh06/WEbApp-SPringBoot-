package DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Entity.Customer;
@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		//getting the current session
		Session currentsession = sessionfactory.getCurrentSession();		
		//creating a query
		Query<Customer> theQuery = currentsession.createQuery("from Customer", Customer.class); 
		//get result a list
		List<Customer> customers = theQuery.getResultList();
		
		//returning customers;
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		
		Session currentSession = sessionfactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theCustomer);
				
	}

	public void  getCustomer(int theID) {
		
		Session currentSession = sessionfactory.getCurrentSession();
		
	   Customer theCustomer = currentSession.get(Customer.class, theID);
		
		
	}

	@Override
	public void deleteCustomer(int theID) {
		
		Session currentSession = sessionfactory.getCurrentSession();
		
		Query query = currentSession.createQuery("deelte from Customer where id=:customerId");
		
		query.setParameter("customerId", theID);
		
		query.executeUpdate();	
	}

}

