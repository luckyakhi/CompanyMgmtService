package com.luckyakhi.company.mgmt.svc.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companySvc")
public class CompanyResource {
	@RequestMapping(value="create",method=RequestMethod.PUT,consumes="application/xml",produces="application/xml")
	public @ResponseBody ResponseEntity<CompanyResponse> create(@RequestBody CompanyRequest companyRequest){
		return null;
		
	}
}
