package com.kafka.models;

public class Customer {
	private Integer id;
	private String name;
	private String surname;
	private String telephoneNumber;
	private String address;

	public Customer(Integer id, String name, String surname, String telephoneNumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.telephoneNumber = telephoneNumber;
		this.address = address;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", surname=" + surname + ", telephoneNumber=" + telephoneNumber
				+ ", address=" + address + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
