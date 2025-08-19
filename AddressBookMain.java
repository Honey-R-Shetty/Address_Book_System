package address_book_system;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
	private static Map<String, AddressBook> addressBooks = new HashMap<>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");

		boolean exit = false;
		while (!exit) {
			System.out.println("\nMenu:");
			System.out.println("1. Add New Address Book");
			System.out.println("2. Access Existing Address Book");
			System.out.println("3. Display All Address Books");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addNewAddressBook();
				break;
			case 2:
				accessAddressBook();
				break;
			case 3:
				displayAllAddressBooks();
				break;
			case 4:
				System.out.println("Exiting program...");
				return;
			default:
				System.out.println("Invalid choice! Try again.");
			}
		}
	}

	private static void addNewAddressBook() {
		System.out.print("Enter unique Address Book name: ");
		String name = sc.next();

		if (addressBooks.containsKey(name)) {
			System.out.println("Address Book with this name already exists!");
			return;
		}

		AddressBook newBook = new AddressBook();
		addressBooks.put(name, newBook);
		System.out.println("Address Book '" + name + "' created successfully.");
	}

	private static void accessAddressBook() {
		System.out.print("Enter Address Book name to access: ");
		String name = sc.next();

		AddressBook book = addressBooks.get(name);
		if (book == null) {
			System.out.println("No Address Book found with this name.");
			return;
		}

		boolean back = false;
		while (!back) {
			System.out.println("\nManaging Address Book: " + name);
			System.out.println("1. Add Contact");
			System.out.println("2. Edit Contact");
			System.out.println("3. Delete Contact");
			System.out.println("4. Display Contacts");
			System.out.println("5. Back to Main Menu");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter First Name: ");
				String firstName = sc.nextLine();

				System.out.println("Enter Last Name: ");
				String lastName = sc.nextLine();

				System.out.println("Enter Address: ");
				String address = sc.nextLine();

				System.out.println("Enter City: ");
				String city = sc.nextLine();

				System.out.println("Enter State: ");
				String state = sc.nextLine();

				System.out.println("Enter Zip: ");
				String zip = sc.nextLine();

				System.out.println("Enter Phone Number: ");
				String phoneNumber = sc.nextLine();
				
				System.out.println("Enter Email: ");
				String email = sc.nextLine();
				
				Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
				book.addContact(contact);
				break;
			case 2:
				System.out.print("Enter name to edit: ");
				String editName = sc.next();
				book.editContact(editName, sc);
				break;
			case 3:
				System.out.print("Enter name to delete: ");
				String deleteName = sc.next();
				book.deleteContact(deleteName);
				break;
			case 4:
				book.displayContacts();
				break;
			case 5:
				back = true;
				break;
			default:
				System.out.println("Invalid choice! Try again.");
			}
		}
	}

	private static void displayAllAddressBooks() {
		if (addressBooks.isEmpty()) {
			System.out.println("No Address Books available.");
		} else {
			System.out.println("Available Address Books: " + addressBooks.keySet());
		}
	}
}
