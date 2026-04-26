/**
 * Course: CS-320
 * Assignment: Module 3-2 Milestone
 * Programmer: Jacob Garrett
 */
package contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	Map<String, Contact> contactStorageMap = new HashMap<>(); 
	private int currentContactIdTracker = 0;
	
	public void addContact(String firstName, String lastName, String Number, String Address){
		currentContactIdTracker = currentContactIdTracker + 1;
		String key = String.valueOf(currentContactIdTracker);
		
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
		
		Contact newContact = new Contact(key, firstName, lastName, Number, Address);
		contactStorageMap.put(key, newContact );
		
	}
	
	public Contact getContact(String key) {
		Contact retrievedContact = contactStorageMap.get(key);
		
		return retrievedContact;
	}
	
	public void deleteContact(String key) {
		contactStorageMap.remove(key);
		
	}
	
	public void updateContact(String key, String firstName, String lastName, String Number, String Address) {
		Contact contactToUpdate = contactStorageMap.get(key);
		
		if (contactToUpdate != null) {
			
			if (firstName != null && firstName.length() <= 10 &&  !firstName.trim().isEmpty() ) {
	            contactToUpdate.setFirstName(firstName);
	            
	        }
	        
	        if (lastName != null && lastName.length() <= 10 &&  !lastName.trim().isEmpty() ) {
	        	contactToUpdate.setLastName(lastName);
	        	
	        }
	        
	        if (Number != null && Number.length() == 10 &&  !Number.trim().isEmpty()) {
	        	contactToUpdate.setNumber(Number);
	        	
	        }
	        
	        if (Address != null && Address.length() <= 30 &&  !Address.trim().isEmpty() ) {
	        	contactToUpdate.setAddress(Address);
	        	
	        }
	        
		}
	}
}
