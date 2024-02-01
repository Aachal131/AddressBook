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
    public Contacts findContactByName(String fullName) {
        for (Contacts contact : contactsList) {
            if (contact.getFullName().equalsIgnoreCase(fullName)) {
                return contact;
            }
        }
        return null;
    }

}

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
        // Editing an existing contact
        System.out.println("\nEnter the full name of the contact to edit:");
        String fullNameToEdit = scanner.nextLine();
        Contacts contactToEdit = addressBook.findContactByName(fullNameToEdit);

        if (contactToEdit != null) {
            System.out.println("\nEnter the updated details for the contact:");
            System.out.print("New Address: ");
            String newAddress = scanner.nextLine();
            System.out.print("New City: ");
            String newCity = scanner.nextLine();
            System.out.print("New State: ");
            String newState = scanner.nextLine();
            System.out.print("New ZIP Code: ");
            String newZip = scanner.nextLine();
            System.out.print("New Phone Number: ");
            String newPhoneNumber = scanner.nextLine();
            System.out.print("New Email: ");
            String newEmail = scanner.nextLine();
            contactToEdit.updateContact(newAddress, newCity, newState, newZip, newPhoneNumber, newEmail);
            System.out.println("\nAll Contacts in Address Book after Update:");
            addressBook.displayAllContacts();
        } else {
            System.out.println("Contact not found.");
        }
    }
}
