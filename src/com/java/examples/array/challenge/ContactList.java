package com.java.examples.array.challenge;

import java.util.ArrayList;
import java.util.List;

public class ContactList {

	private List<Contact> contacts = new ArrayList<Contact>();

	public void addContact(Contact contact) {
		this.contacts.add(contact);
	}

	/**
	 * Return the index of name
	 * @param name 
	 * @return index of element -1 IOC
	 */
	public int getIndexByName(String name) {
		for (int i = 0; i < contacts.size(); i++) {
			if (this.contacts.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Update contact by name
	 * @param name
	 * @param phone
	 */
	public void updateContact(int index, Contact contact){
		if(index>=0){
			this.contacts.set(index, contact);
		}else {
			System.out.println("Contacto no encontrado");
		}
	}
	
	/**
	 * Remove a contact by name
	 * @param name
	 */
	public void removeContact(Contact contact){
		int index =getIndexByName(contact.getName()); 
		if(index>=0){
			this.contacts.remove(index);
		}
	}
	
	public void searchContact(Contact contact){
		int index =getIndexByName(contact.getName()); 
		if(index != -1){
			System.out.println("Contact found at index "+(index+1));
			System.out.println(contacts.get(index).toString());
		}
		
	}
	
	public void viewContacts(){
		for (int i = 0; i < contacts.size(); i++) {
			System.out.println("Index:"+(i+1)+"  "+contacts.get(i).toString());
		}
	}

}
