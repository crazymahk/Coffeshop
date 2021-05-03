

public class Customer {
	private int Id;
	private String userFirstName;
	private String userLastName;
	private int birthDate;
	private long userNationalID;

	public Customer() {

	}

	public Customer(int id, String userFirstName, String userLastName, int birthDate, long userID) {

		Id = id;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.birthDate = birthDate;
		this.userNationalID = userID;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public Long getuserNationalID() {
		return userNationalID;
	}

	public void setuserNationalID(long userID) {
		this.userNationalID = userID;
	}

}
