package edu.mum.asd.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;

	/* Consider this as a a database table of customers */
	public static List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1, "Aaron", "RAMSEY", "aramsey@caller.com", "641-980-8978"));
		customers.add(new Customer(1, "Jack", "WILSHERE", "jwilshere@caller.com", "647-060-8978"));
		customers.add(new Customer(1, "Temsgen", "HAPTE", "thapte@caller.com", "632-887-8978"));
		return customers;
	}

	/* Render one Customer from the considered list above */
	public static Customer find(String phoneNumber) {
		for (Customer cst : getCustomers()) {
			if (cst.getPhoneNumber().equals(phoneNumber)) {
				return cst;
			}
		}
		return null;
	}

	/* Adding a customer in the list of customers */
	public void newCustomer() {
		getCustomers().add(this);
	}

	public Customer() {
	}

	public Customer(int id, String firstName, String lastName, String emailAddress, String phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [" + firstName + " " + lastName + " ->" + phoneNumber + "]";
	}

}
