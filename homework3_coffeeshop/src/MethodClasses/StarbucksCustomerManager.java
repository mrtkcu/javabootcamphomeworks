package MethodClasses;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService  customerCheckService; 
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	public void save(Customer customer) {
		
		if(this.customerCheckService.ifCustomerReal(customer))
		{
			super.save(customer);
		}	
		else
		{
			System.out.println("Not a valid person");
		}
		
		
		
		
	}



	
}
