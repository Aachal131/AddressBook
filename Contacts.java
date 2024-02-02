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

}
