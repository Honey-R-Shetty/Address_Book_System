package address_book_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	private List<Contact> contacts = new ArrayList<>();

	public void addContact(Contact contact) {
		contacts.add(contact);
		System.out.println("Contact added successfully!");
	}

	public void displayContacts() {
		if (contacts.isEmpty()) {
			System.out.println("No contacts available.");
		} else {
			for (Contact c : contacts) {
				System.out.println(c);
			}
		}
	}

	public void editContact(String firstName, Scanner sc) {
		for (Contact contact : contacts) {
			if (contact.getFirstName().equalsIgnoreCase(firstName)) {
				System.out.println("Editing contact: " + firstName);

				System.out.print("Enter New Address: ");
				contact.setAddress(sc.nextLine());

				System.out.print("Enter New City: ");
				contact.setCity(sc.nextLine());

				System.out.print("Enter New State: ");
				contact.setState(sc.nextLine());

				System.out.print("Enter New Zip: ");
				contact.setZip(sc.nextLine());

				System.out.print("Enter New Phone Number: ");
				contact.setPhoneNumber(sc.nextLine());

				System.out.print("Enter New Email: ");
				contact.setEmail(sc.nextLine());

				System.out.println("Contact updated successfully!");
				return;
			}
		}
		System.out.println("Contact with name " + firstName + " not found.");
	}
}
