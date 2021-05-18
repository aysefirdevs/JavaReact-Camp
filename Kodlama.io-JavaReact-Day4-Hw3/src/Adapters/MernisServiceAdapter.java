package Adapters;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),
					user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), 
					user.getYearofBirth());
		} catch (NumberFormatException e) {
			System.out.println("hatali kullanici");
		} catch (RemoteException e) {
			System.out.println("hatali kullanici");
		}
		return result;
	}

}
