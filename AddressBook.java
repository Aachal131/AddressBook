package com.addressmanagement;
import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args) {
        Contacts contact1 = new Contacts("Aachal", "Borole", "Chinchapada west", "Mumbai", "MH", "12345", "555-1234", "aachalkborle131@gmail.com");
        System.out.println("Contact Information:");
        contact1.displayContact();
    }
}
