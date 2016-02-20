package com.luckyakhi.company.mgmt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.luckyakhi.company.mgmt.dto.CompanyDTO;

@Component
public class CompanyDAOImpl implements CompanyDAO{
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public void create(CompanyDTO companyDTO) {
		jdbcTemplate.update("insert into company (name,address,city,"
				+ "country,email,phone_number) values (?,?,?,?,?,?);"
				, companyDTO.getName(),companyDTO.getAddress(),companyDTO.getCity(),companyDTO.getCountry(),
				companyDTO.getEmail(),companyDTO.getPhoneNumber());
		
	}

	@Override
	public List<CompanyDTO> companyList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompanyDTO get(String companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(CompanyDTO company) {
		// TODO Auto-generated method stub
		
	}

	@Autowired
	public CompanyDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

}
