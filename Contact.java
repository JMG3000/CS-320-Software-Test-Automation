/**
 * Course: CS-320
 * Assignment: Module 3-2 Milestone
 * Programmer: Jacob Garrett
 */
package contact;

public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String Number;
	private String Address;
	
	
	public Contact(String contactID, String firstName, String lastName, String Number, String Address) {
		
		if( contactID == null || contactID.trim().isEmpty() || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid contact ID!");
		}
		
		if(firstName == null || firstName.trim().isEmpty() || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name!");
		}
		
		if(lastName == null || lastName.trim().isEmpty() || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name!");
		}
		
		if(Number == null || Number.trim().isEmpty() || Number.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number!");
		}
		
		if(Address == null || Address.trim().isEmpty() || Address.length() > 30) {
			throw new IllegalArgumentException("Invalid address!");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Number = Number;
		this.Address = Address;
		
	}
	
	public String getContactID() {
		return contactID;
	
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
	
	public String getNumber() {
		return Number;
	
	}
	
	public void setNumber(String Number) {
		this.Number = Number;
	
	}
	
	public String getAddress() {
		return Address;
	
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	
	}
}
