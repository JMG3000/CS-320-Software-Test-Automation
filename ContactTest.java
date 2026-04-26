/**
 * Course: CS-320
 * Assignment: Module 3-2 Milestone
 * Programmer: Jacob Garrett
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	// IsValid object test
	@Test
	void testContactIsValid() {
		Contact contact = new Contact("1","Optimus","Prime","1234567890","102 Sentinel Prime Blvd APT 17");
		
		assertEquals(contact.getContactID(), "1");
		assertEquals(contact.getFirstName(), "Optimus");		
		assertEquals(contact.getLastName(), "Prime");		
		assertEquals(contact.getNumber(), "1234567890");		
		assertEquals(contact.getAddress(), "102 Sentinel Prime Blvd APT 17");
		
	}
	
	
	// TooShort test
	@Test
	void testContactNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Optimus", "Prime", "123456789", "102 Sentinel Prime Blvd APT 17");
			
		});
	}
	
	
	// TooLong tests
	@Test
	void testContactContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000000001", "Optimus", "Prime", "1234567890", "102 Sentinel Prime Blvd APT 17");
			
		});
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Christopher", "Prime", "1234567890", "102 Sentinel Prime Blvd APT 17");
			
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Optimus", "Christopherson", "1234567890", "102 Sentinel Prime Blvd APT 17");
			
		});
	}
	
	@Test
	void testContactNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Optimus", "Prime", "01234567890", "102 Sentinel Prime Blvd APT 17");
			
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Optimus", "Prime", "1234567890", "10000000002 Sentinel Prime Blvd APT 615724156324817");
			
		});
	}
	
	// IsNull tests
	@Test
	void testContactContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Optimus", "Prime", "1234567890", "102 Sentinel Prime Blvd APT 17");
			
		});
	}
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", null, "Prime", "1234567890", "102 Sentinel Prime Blvd APT 17");
			
		});
	}
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Optimus", null, "1234567890", "102 Sentinel Prime Blvd APT 17");
			
		});
	}
	
	@Test
	void testContactNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Optimus", "Prime", null, "102 Sentinel Prime Blvd APT 17");
			
		});
	}
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Optimus", "Prime", "1234567890", null);
			
		});
	}
	
	// HasEmptySpaces tests
	@Test
	void testContactContactIdHasEmptySpaces() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("  ", "Optimus", "Prime", "1234567890", "102 Sentinel Prime Blvd APT 17");
			
		});
	}
	
	@Test
	void testContactFirstNameHasEmptySpace() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", " ", "Prime", "1234567890", "102 Sentinel Prime Blvd APT 17");
			
		});
	}
	
	@Test
	void testContactLastNameHasEmptySpace() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Optimus", " ", "1234567890", "102 Sentinel Prime Blvd APT 17");
			
		});
	}
	
	@Test
	void testContactNumberHasEmptySpace() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Optimus", "Prime", " ", "102 Sentinel Prime Blvd APT 17");
			
		});
	}
	
	@Test
	void testContactAddressHasEmptySpace() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Optimus", "Prime", "1234567890", " ");
			
		});
	}
	
	// Update with set method tests
	@Test
	void testContactUpdateWithSetMethods() {
		Contact contactToTest = new Contact("1","Optimus","Prime","1234567890","102 Sentinel Prime Blvd APT 17");
		
		contactToTest.setFirstName("Megatron");
		contactToTest.setLastName("Tron");
		contactToTest.setNumber("0987654321");
		contactToTest.setAddress("101 Decepticon Way");
		
		assertEquals(contactToTest.getFirstName(), "Megatron");
		assertEquals(contactToTest.getLastName(), "Tron");
		assertEquals(contactToTest.getNumber(), "0987654321");
		assertEquals(contactToTest.getAddress(), "101 Decepticon Way");
		
	}
	

}
