package homework3_coffeeshop;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Entities.Customer;
import MethodClasses.NeroCustomerManager;
import MethodClasses.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Hasan","Okçu",1965,"01002499516"));
		
		
		
	}
}
