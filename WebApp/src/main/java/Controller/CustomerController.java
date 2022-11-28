package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DAO.CustomerDAO;
import Entity.Customer;
import Service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	public CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		//get customers from the dao
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		//add customers to the model
		theModel.addAttribute("customers", theCustomers);
		
     return "list-customers";
		
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
		
		
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theID,
			                                      Model theModel){
													
		//getting the customer from the database
		Customer theCustomer = customerService.getCustomer(theID);
		
		theModel.addAttribute("customer", theCustomer);
		
		
		
		return "customer-form";
		
	}
	
	public String deleteCustomer(@RequestParam("customerId") int theID) {
		
		customerService.deleteCustomer(theID);
		
		return null;
		
		
		
	}
	

}
