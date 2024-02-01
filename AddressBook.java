package com.addressmanagement;

import java.util.ArrayList;
import java.util.Scanner;

class Contacts {
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
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return lastName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city =city;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state =state;
    }
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip =zip;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber =phoneNumber;
    }
    public void setEmail(String email) {
        this.email=email;
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
            System.out.println("------------------------------");
        }
    }
    public void editContact(String firstName, String lastName) {
        for (Contacts contact : contactsList) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                // Allow the user to edit the contact details
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter new details for " + firstName + " " + lastName);
                System.out.print("New Address: ");
                contact.setAddress(scanner.nextLine());
                System.out.print("New City: ");
                contact.setCity(scanner.nextLine());
                System.out.print("New State: ");
                contact.setState(scanner.nextLine());
                System.out.print("New ZIP Code: ");
                contact.setZip(scanner.nextLine());
                System.out.print("New Phone Number: ");
                contact.setPhoneNumber(scanner.nextLine());
                System.out.print("New Email: ");
                contact.setEmail(scanner.nextLine());

                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }
    public void deleteContact(String firstName, String lastName) {
        for (Contacts contact : contactsList) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                contactsList.remove(contact);
                System.out.println(firstName + " " + lastName + " has been deleted from the address book.");
                return;
            }
        }
        System.out.println("Contact not found!");
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
        System.out.println("\nEnter the name of the contact you want to edit:");
        System.out.print("First Name: ");
        String editFirstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String editLastName = scanner.nextLine();
        addressBook.editContact(editFirstName, editLastName);
        System.out.println("\nAll Contacts in Address Book after editing:");
        addressBook.displayAllContacts();
        System.out.println("\nEnter the name of the contact you want to delete:");
        System.out.print("First Name: ");
        String deleteFirstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String deleteLastName = scanner.nextLine();
        addressBook.deleteContact(deleteFirstName, deleteLastName);
        System.out.println("\nAll Contacts in Address Book after deleting:");
        addressBook.displayAllContacts();
    }
}
