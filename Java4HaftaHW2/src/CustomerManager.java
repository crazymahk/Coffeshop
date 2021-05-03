import java.rmi.RemoteException;

public interface CustomerManager {
	void add(Customer customer) throws RemoteException;

	void remove(Customer customer);

	void update(Customer customer );
}
