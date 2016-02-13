package com.luckyakhi.company.mgmt.svc.model;

import java.util.List;

public class Company {
	private final String companyId;
	private final String name;
	private final String address;
	private final String city;
	private final String country;
	private String email;
	private String phoneNumber;
	private List<Beneficiary> beneficiaryList;

	public Company(String companyId, String name, String address, String city,
			String country) {
		super();
		this.companyId = companyId;
		this.name = name;
		this.address = address;
		this.city = city;
		this.country = country;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setBeneficaryList(List<Beneficiary> beneficiaryList) {
		this.beneficiaryList = beneficiaryList;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Beneficiary> getBeneficiaryList() {
		return beneficiaryList;
	}
	

}
