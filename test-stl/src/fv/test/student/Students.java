package fv.test.student;

public class Students {
	// Fields
	private String firstName;
	private String lastName;
	private boolean goldStatus;

	// Constructor
	public Students(String firstName, String lastName, boolean goldStatus) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.goldStatus = goldStatus;
	}

	// Getters
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public boolean getGoldStatus() {
		return goldStatus;
	}
	// Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setGoldStatus(boolean goldStatus) {
		this.goldStatus = goldStatus;
	}
}
