package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		
		boolean result=false;
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), 
					customer.getDateofBirth().getYear());
		} catch (NumberFormatException e) {
			System.out.println("gerçek bir kisi degil");
		} catch (RemoteException e) {
			System.out.println("gerçek bir kisi degil");
		}
		return result;
		
	}
	
}
