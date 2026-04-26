/**
 * Course: CS-320
 * Assignment: Module 3-2 Milestone
 * Programmer: Jacob Garrett
 */
package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

class ContactServiceTest {

	@Test
	void testContactServiceIsValid() {
		ContactService contactServiceToTest = new ContactService();
		
		contactServiceToTest.addContact("Optimus", "Prime", "1234567890", "102 Sentinel Prime Blvd APT 17");
		
		Contact retrievedContact = contactServiceToTest.getContact("1");
		
		assertEquals(retrievedContact.getContactID(), "1");
		assertEquals(retrievedContact.getFirstName(), "Optimus");
		assertEquals(retrievedContact.getLastName(), "Prime");
		assertEquals(retrievedContact.getNumber(), "1234567890");
		assertEquals(retrievedContact.getAddress(), "102 Sentinel Prime Blvd APT 17");
		
	}
	
	@Test
	void testAddContactWithUniqueId() {
		ContactService contactServiceToTest = new ContactService();
		
		contactServiceToTest.addContact("Optimus", "Prime", "1234567890", "102 Sentinel Prime Blvd APT 17");
		contactServiceToTest.addContact("Megatron", "Tron", "0987654321", "101 Decepticon Way");
		
		Contact firstRetrievedContact = contactServiceToTest.getContact("1");
		Contact secondRetrievedContact = contactServiceToTest.getContact("2");
		
		assertNotNull(firstRetrievedContact);
		assertNotNull(secondRetrievedContact);
		
		assertEquals("Megatron", secondRetrievedContact.getFirstName());
		assertEquals("Tron", secondRetrievedContact.getLastName());
		
		assertNotEquals(firstRetrievedContact.getContactID(), secondRetrievedContact.getContactID());
		
	}
	
	@Test
	void testDeleteContactWithUniqueId() {
		ContactService contactServiceToTest = new ContactService();
		
		contactServiceToTest.addContact("Optimus", "Prime", "1234567890", "102 Sentinel Blvd");
		
		Contact retrievedContact = contactServiceToTest.getContact("1");
		assertNotNull(retrievedContact);
		
		contactServiceToTest.deleteContact("1");
		
		Contact deletedContact = contactServiceToTest.getContact("1");
		assertNull(deletedContact);
	}
	
	@Test
	void testUpdateContactWithUniqueId() {
	    ContactService contactServiceToTest = new ContactService();

	    contactServiceToTest.addContact("Optimus", "Prime", "1234567890", "102 Sentinel Blvd");
	    contactServiceToTest.updateContact("1", "Megatron", "Tron", "0987654321", "101 Decepticon Way");
	    
	    Contact retrievedContact = contactServiceToTest.getContact("1");
	    
	    assertEquals("Megatron", retrievedContact.getFirstName());
	    assertEquals("Tron", retrievedContact.getLastName());
	    assertEquals("0987654321", retrievedContact.getNumber());
	    assertEquals("101 Decepticon Way", retrievedContact.getAddress());
	    
	    contactServiceToTest.updateContact("1", "Megatronion", "   ", "09876543210", "101 Decepticon Wayyyyyyyyyyyyyy");
	    Contact defendedContact = contactServiceToTest.getContact("1");
	    
	    assertEquals("Megatron", defendedContact.getFirstName());
	    assertEquals("Tron", defendedContact.getLastName());
	    assertEquals("0987654321", defendedContact.getNumber());
	    assertEquals("101 Decepticon Way", defendedContact.getAddress());
	}

}
