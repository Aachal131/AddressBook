package com.addressmanagement;

class Contacts {
    // Fields
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    // Constructor
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
}

public class AddressBook {
    public static void main(String[] args){
        Contacts contact1 = new Contacts("Aachal", "Borole", "Chinchapada west", "Mumbai", "MH", "12345", "555-1234", "aachalkborle131@gmail.com");

        // Displaying contact information
        System.out.println("Contact Information:");
        contact1.displayContact();
    }
}
