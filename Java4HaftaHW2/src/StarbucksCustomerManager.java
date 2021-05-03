import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class StarbucksCustomerManager implements CustomerManager {

	Boolean service = true;
	KPSPublicSoapProxy kpspublic = new KPSPublicSoapProxy() ;

	public boolean isRealperson(Customer customer) throws RemoteException {
	return kpspublic.TCKimlikNoDogrula(customer.getuserNationalID(), customer.getUserFirstName().toUpperCase(),
				customer.getUserLastName().toUpperCase(), customer.getBirthDate());
	}
	
	//customer.getuserNationalID()
	@Override
	public void add(Customer customer) throws RemoteException {

//		if (service) {
//			System.out.println("Baþarýlý Ýþlem");
//		} else {
//			System.out.println(customer.getUserFirstName() + " Sisteme eklenemedi");
//		}

		if (isRealperson(customer)) {
			System.out.println("Baþarýlý Ýþlem");
		} else {
			System.out.println(customer.getUserFirstName() + " Sisteme eklenemedi");
		}

	}

	@Override
	public void remove(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub

	}

}
