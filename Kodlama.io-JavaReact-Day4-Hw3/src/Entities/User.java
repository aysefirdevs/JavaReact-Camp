package Entities;

public class User {
	private int Id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int yearofBirth;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String nationalityId, int yearofBirth) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.yearofBirth = yearofBirth;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getYearofBirth() {
		return yearofBirth;
	}

	public void setYearofBirth(int yearofBirth) {
		this.yearofBirth = yearofBirth;
	}
	
	
}
