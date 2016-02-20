package com.luckyakhi.company.mgmt.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.luckyakhi.company.mgmt.configuration.CompanyMgmtConfig;
import com.luckyakhi.company.mgmt.dto.CompanyDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={CompanyMgmtConfig.class})
public class CompanyMgmtDaoTest {

	@Autowired
	private CompanyDAO companyDAO;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		CompanyDTO companyDTO = new CompanyDTO();
		companyDTO.setName("Nomura");
		companyDTO.setCity("Mumbai");
		companyDTO.setCountry("India");
		companyDTO.setEmail("akhi.iitkgp@gmail.com");
		companyDTO.setAddress("Vinchester Powai");	
		companyDTO.setPhoneNumber("9769132490");
		
		
		companyDAO.create(companyDTO);
	}

	public void setCompanyDAO(CompanyDAO companyDAO) {
		this.companyDAO = companyDAO;
	}
	
	

}
