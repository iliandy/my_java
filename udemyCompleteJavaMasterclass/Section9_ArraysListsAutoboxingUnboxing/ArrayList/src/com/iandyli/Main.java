package com.iandyli;

import java.util.Scanner;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("469-123-4567");

    public static void main(String[] args) {
	    boolean quit = false;
	    startPhone();
	    printActions();

	    while(!quit) {
            System.out.println("Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                default:
                    System.out.println("Please enter a valid action...");
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\n");
        System.out.println( "0 - shutdown phone.\n" +
                            "1 - print contacts.\n" +
                            "2 - add a new contact.\n" +
                            "3 - update existing contact.\n" +
                            "4 - remove existing contact.\n" +
                            "5 - query if contact exists.\n" +
                            "6 - print available actions list.\n");
        System.out.println("Choose an action: ");
    }

    private static void addContact() {
        System.out.println("Please enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter phone number: ");
        String phoneNum = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNum);

        if(mobilePhone.addContact(newContact)) {
            System.out.println(String.format("Successfully added contact: %s, %s", name, phoneNum));
        }
        else {
            System.out.println(String.format("Can't add %s. Contact already exists.", name));
        }
    }

    private static void updateContact() {
        System.out.println("Please enter search contact name: ");
        String name = scanner.nextLine();
        Contact searchContact = mobilePhone.queryContact(name);

        if(searchContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Please enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Please enter phone number: ");
        String newPhoneNum = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNum);
        if(mobilePhone.updateContact(searchContact, newContact)) {
            System.out.println("Successfully updated contact.");
        }
        else {
            System.out.println("Error updating contact.");
        }
    }

    private static void removeContact() {
        System.out.println("Please enter search contact name: ");
        String name = scanner.nextLine();
        Contact searchContact = mobilePhone.queryContact(name);

        if(searchContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(searchContact)) {
            System.out.println("Successfully removed contact.");
        }
        else {
            System.out.println("Error removing contact.");
        }
    }

    private static void queryContact() {
        System.out.println("Please enter search contact name: ");
        String name = scanner.nextLine();
        Contact searchContact = mobilePhone.queryContact(name);

        if(searchContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println(String.format("Contact: %s, %s", searchContact.getName(), searchContact.getPhoneNum()));
    }
}
