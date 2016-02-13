package com.luckyakhi.company.mgmt.svc.model;

import java.util.Date;

public abstract class Person {
	private String firstName;
	private String lastName;
	private Date dob;
	protected Person(String firstName, String lastName, Date dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	
}
