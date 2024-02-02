package com.addressmanagement;
import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Address addressBook = new Address();
        System.out.println("Enter details for a new contact:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("ZIP Code: ");
        String zip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        Contacts newContact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.addContact(newContact);
        System.out.println("\nAll Contacts in Address Book:");
        addressBook.displayAllContacts();
    }
}
