package com.luckyakhi.company.mgmt.svc.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="companyResponse")
public class CompanyResponse {
	private String responseCode;
	private String responseDescription;
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDescription() {
		return responseDescription;
	}
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}
	
}
