package address_book_system;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Scanner sc = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();

		System.out.print("Enter First Name: ");
		String firstName = sc.nextLine();

		System.out.print("Enter Last Name: ");
		String lastName = sc.nextLine();

		System.out.print("Enter Address: ");
		String address = sc.nextLine();

		System.out.print("Enter City: ");
		String city = sc.nextLine();

		System.out.print("Enter State: ");
		String state = sc.nextLine();

		System.out.print("Enter Zip: ");
		String zip = sc.nextLine();

		System.out.print("Enter Phone Number: ");
		String phoneNumber = sc.nextLine();

		System.out.print("Enter Email: ");
		String email = sc.nextLine();

		Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

		addressBook.addContact(contact);

		System.out.println("\n--- Contact List ---");
		addressBook.displayContacts();
	}
}
