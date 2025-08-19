package address_book_system;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");

		Contact contact = new Contact("Honey", "Shetty", "MG Road", "Bangalore", "Karnataka", "560001", "9876543210",
				"honey@example.com");

		System.out.println("Contact Created:");
		System.out.println(contact);
	}
}
