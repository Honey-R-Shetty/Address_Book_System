package address_book_system;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<Contact> contacts = new ArrayList<>();

	public void addContact(Contact contact) {
		contacts.add(contact);
		System.out.println("Contact added successfully!");
	}

	public void displayContacts() {
		if (contacts.isEmpty()) {
			System.out.println("No contacts available.");
		}else {
			for (Contact c : contacts) {
				System.out.println(c);
			}
		}
	}
}
