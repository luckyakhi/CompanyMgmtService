package com.luckyakhi.company.mgmt.dao;

import java.util.List;

import com.luckyakhi.company.mgmt.dto.CompanyDTO;

public interface CompanyDAO {
	public void create(CompanyDTO companyDTO);
	public List<CompanyDTO> companyList();
	public CompanyDTO get(String companyId);
	public void update(CompanyDTO company);
	
}
