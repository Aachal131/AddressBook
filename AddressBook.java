package com.addressmanagement;

import java.util.ArrayList;
import java.util.Scanner;

class Contacts {
    // Fields
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phoneNumber;
    public String email;
    public Contacts(String firstName, String lastName, String address, String city, String state, String zip,
                    String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void displayContact() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("ZIP Code: " + zip);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public String getEmail() {
        return email;
    }
    public void updateContact(String address, String city, String state, String zip, String phoneNumber, String email) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}

class Address {
    private ArrayList<Contacts> contactsList;

    public Address() {
        contactsList = new ArrayList<>();
    }

    public void addContact(Contacts contact) {
        contactsList.add(contact);
    }
    public void displayAllContacts() {
        for (Contacts contact : contactsList) {
            contact.displayContact();
        }
    }

}

public class AddressBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an address book
        Address addressBook = new Address();

        // Adding a new contact to the address book using console input
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

        // Creating a new contact
        Contacts newContact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);

        // Adding the new contact to the address book
        addressBook.addContact(newContact);

        // Displaying all contacts in the address book
        System.out.println("\nAll Contacts in Address Book:");
        addressBook.displayAllContacts();
    }
}
