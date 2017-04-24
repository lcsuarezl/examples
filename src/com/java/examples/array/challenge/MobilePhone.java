package com.java.examples.array.challenge;

import java.util.Scanner;

public class MobilePhone {

	private static ContactList contactList = new ContactList();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		do {
			switch (choice) {
			case 0:
				printMenu();
				break;
			case 1:
				contactList.viewContacts();
				break;
			case 2:
				addContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				deleteContact();
				break;
			case 5:
				searchContact();
				break;
			}
			printMenu();
			choice = scanner.nextInt();
		} while (!quit);

	}

	public static void printMenu() {
		System.out.println("0. Show menu");
		System.out.println("1. Print list");
		System.out.println("2. Add Contact");
		System.out.println("3. Update Contact");
		System.out.println("4. Delete Contact");
		System.out.println("5. Search Contact");
	}

	private static void addContact() {
		System.out.println("Ingrese el nombre del contacto:");
		String name = scanner.next();
		System.out.println("Ingrese el teléfono del contacto:");
		String phone = scanner.next();
		Contact contact = new Contact(name, phone);
		contactList.addContact(contact);
		contactList.viewContacts();
	}

	private static void updateContact() {
		System.out.println("Ingrese el nombre del contacto a editar:");
		String name = scanner.next();
		int index = contactList.getIndexByName(name);
		System.out.println("Ingrese el nuevo nombre del contacto a editar:");
		name = scanner.next();
		System.out.println("Ingrese el nuevo teléfono del contacto:");
		String phone = scanner.next();
		Contact contact = new Contact(name, phone);
		contactList.updateContact(index, contact);
		contactList.viewContacts();
	}

	private static void deleteContact() {
		System.out.println("Ingrese el nombre del contacto a eliminar:");
		String name = scanner.next();
		Contact contact = new Contact(name, "");
		contactList.removeContact(contact);
		contactList.viewContacts();
	}
	
	private static void searchContact() {
		System.out.println("Ingrese el nombre del contacto a buscar:");
		String name = scanner.next();
		Contact contact = new Contact(name, "");
		contactList.searchContact(contact);
	}

}
