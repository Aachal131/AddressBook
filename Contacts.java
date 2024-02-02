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

}
