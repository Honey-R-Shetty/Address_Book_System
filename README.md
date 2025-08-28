# Address Book System

A simple *Address Book Application* built in Java using Object-Oriented Concepts.  
The program allows you to manage contacts with details like first name, last name, address, city, state, zip, phone number, and email.  

The project demonstrates:
- Object-Oriented Programming (OOP) principles  
- Console-based interaction with users  
- Use of Collections to store multiple contacts  
- Git branching strategy for each Use Case (UC)  
- Code hygiene (naming conventions, indentation, version control best practices)

---
## Project Branches  

This repository follows a *Use Case (UC)* based branching strategy.  
Each branch represents a specific functionality added to the Address Book System.  

- *master* → Main branch containing the stable version of the project.  
- *uc1-create-contacts* → Implementation of creating a new contact.  
- *uc2-add-contacts* → Added support for adding multiple contacts to the system.  
- *uc3-edit-contacts* → Implementation of editing an existing contact.  
- *uc4-delete-contact* → Implementation of deleting a contact.  
- *uc5-add-multiple-contacts* → Added feature to manage multiple contacts in one address book.  
- *uc6-add-multiple-address-book* → Refactored code to support multiple address books.
## 📌 Features (Use Cases)

### *UC 1: Add New Contact*
- Ability to add a new contact to the Address Book.  
- Input taken from console (first name, last name, address, city, state, zip, phone number, email).  
- Object-Oriented design used to manage relationship between AddressBook and ContactPerson.  

---

### *UC 2: Edit Existing Contact*
- Ability to edit an existing contact using their name.  
- Console input prompts user to update details.  

---

### *UC 3: Delete a Contact*
- Ability to delete a person from Address Book using their name.  
- Console input to select and remove person.  

---

### *UC 4: Add Multiple Persons*
- Ability to add multiple contacts to Address Book one at a time.  
- Use of Java *Collections (ArrayList/HashMap)* to manage multiple contact entries.  

---

### *UC 5: Multiple Address Books*
- Ability to manage multiple Address Books.  
- Each Address Book has a unique name.  
- A *Dictionary (HashMap)* is maintained with Address Book name as key and AddressBook object as value.  
- Console menu allows user to create/select different Address Books.  

---

### *UC 6: Exit*
- Display *Thank You* message and exit the program.  

---

## ⚙ Technologies Used
- *Language*: Java (JDK 8+)
- *IDE*: IntelliJ IDEA (or Eclipse / VS Code)
- *Concepts*:  
  - Object-Oriented Programming  
  - Collections Framework (ArrayList, HashMap)  
  - Console I/O  
- *Version Control*: Git  

---

## 🚀 Git Workflow
- Each *Use Case (UC)* is implemented in a *separate branch*.  
- Branch is tested and then merged with main.  
- Git commit messages follow proper convention (e.g., "UC1 - Added ability to create contact").  
- Version history is maintained for review.  

---

## 📂 Project Structure
AddressBookSystem/  
│── src/  
│   ├── AddressBookMain.java      # Main program entry  
│   ├── AddressBook.java          # Class to manage contacts  
│   ├── ContactPerson.java        # Class to represent a contact  
│  
│── .gitignore  
│── README.md  


---

## 📝 How to Run
1. Clone the repository:
   ```bash
   git clone <repo-url>
   cd AddressBookSystem
2. Compile the Java files:
   ```bash
   javac src/*.java
3. Run the program:
   ```bash
   java src/AddressBookMain
