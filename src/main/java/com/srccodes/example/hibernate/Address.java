package com.srccodes.example.hibernate;

import javax.persistence.*;

/**
 * The persistent class for the contact database table.
 * 
 */
@Entity
@Table(name = "address")
public class Address {
	@Id
	private Integer id;
	@Column
	private String name;
	@ManyToOne
	private Contact contact;

	public Address() {

	}

	public Address(Integer id, String name, Contact contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
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

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
}