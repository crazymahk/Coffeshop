import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		CustomerManager customerManager = new StarbucksCustomerManager();

		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setUserFirstName("Yýlmaz");
		customer1.setUserLastName("Uçar");
		customer1.setBirthDate(1998);

		long z = Long.parseLong("100000000024");
		customer1.setuserNationalID(z);

//		System.out.println(customer1.getuserNationalID());
//		System.out.println(customer1.getUserFirstName().toUpperCase());
//		System.out.println(customer1.getUserLastName().toUpperCase());
//		System.out.println(customer1.getBirthDate());

		customerManager.add(customer1);
	}

}
