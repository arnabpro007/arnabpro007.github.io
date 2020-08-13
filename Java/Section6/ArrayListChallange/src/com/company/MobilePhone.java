package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> ContactList = new ArrayList<Contacts>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.ContactList = new ArrayList<Contacts>();
    }




    public boolean StoreContact(Contacts contact){
        if (findContact(contact.getName()) >=0){
            System.out.println("Contact is already on file");
            return false;
        }
        ContactList.add(contact);
        return true;
    }

    public boolean removeContact(Contacts contact){
        int foundPosition = findContact(contact);
        if (foundPosition <0) {
            System.out.println("Contact not found!");
            return false;
        }
        this.ContactList.remove(foundPosition);

        System.out.println("Item removed!");
        return true;
    }

    public ArrayList<Contacts> getContactList() {
        return ContactList;
    }

    public boolean updateContact(Contacts oldContact , Contacts newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition<0){
            System.out.println(oldContact.getName() + " not found");
            return false;
        }
        this.ContactList.set(foundPosition,newContact);
        System.out.println(oldContact.getName() + " got replaced with " + newContact.getName());
        return true;
    }
    private int findContact(Contacts queryContact){
        return this.ContactList.indexOf(queryContact);
    }

    private int findContact(String name){
        for (int i = 0; i < this.ContactList.size(); i++) {
            Contacts contact = this.ContactList.get(i);
            if (contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public String queryContact(Contacts contact){
        if(findContact(contact) >=0) {
            return contact.getName();
        }
        return null;
    }

}
