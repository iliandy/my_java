package com.iandyli;

import java.util.ArrayList;

public class MobilePhone {
    private String myNum;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNum) {
        this.myNum = myNum;
        this.myContacts = new ArrayList<Contact>();
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int ind = findContact(name);
        if (ind >= 0) {
            return this.myContacts.get(ind);
        }
        return null;
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already stored...");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundInd = findContact(oldContact);

        if (foundInd < 0) {
            System.out.println(String.format("%s was not found.", oldContact.getName()));
            return false;
        }

        this.myContacts.set(foundInd, newContact);
        System.out.println(String.format("%s was updated to %s.", oldContact.getName(), newContact.getName()));
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundInd = findContact(contact);

        if (foundInd < 0) {
            System.out.println(String.format("%s was not found.", contact.getName()));
            return false;
        }

        this.myContacts.remove(foundInd);
        System.out.println(String.format("%s was removed.", contact.getName()));
        return true;
    }

    public MobilePhone printContacts() {
        System.out.println("Contact list:");
        for(int i=0; i < this.myContacts.size(); i++) {
            System.out.println(String.format("%d. %s, %s", (i+1), myContacts.get(i).getName(), myContacts.get(i).getPhoneNum()));
        }
        return this;
    }
}
