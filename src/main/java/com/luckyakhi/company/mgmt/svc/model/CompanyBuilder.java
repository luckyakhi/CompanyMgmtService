package com.luckyakhi.company.mgmt.svc.model;

import java.util.ArrayList;

public class CompanyBuilder {
	private Company company;

	public CompanyBuilder(String name, String address, String city,
			String companyId, String country) {
		super();
		company = new Company(companyId, name, address, city, country);
		company.setBeneficaryList(new ArrayList<Beneficiary>());
	}
	public CompanyBuilder email(String email){
		company.setEmail(email);
		return this;
	}
	public CompanyBuilder phone(String phoneNumber){
		company.setPhoneNumber(phoneNumber);
		return this;
	}
	public CompanyBuilder beneficiary(Beneficiary beneficiary){
		company.getBeneficiaryList().add(beneficiary);
		return this;
	}
	public Company build(){
		return company;
	}

}
