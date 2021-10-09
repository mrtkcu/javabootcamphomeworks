package MethodClasses;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean ifCustomerReal(Customer customer) {
		
		return true;
	}

	

}
