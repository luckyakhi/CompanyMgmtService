package com.luckyakhi.company.mgmt.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@ComponentScan(basePackages={"com.luckyakhi.company.mgmt.*"})
public class CompanyMgmtConfig {
	@Bean
	public DataSource dataSource(){
		EmbeddedDatabaseBuilder embeddedDataBaseBuilder = new EmbeddedDatabaseBuilder(); 
		EmbeddedDatabase embeddedDatabase=embeddedDataBaseBuilder.setType(EmbeddedDatabaseType.H2).addScript("dbscripts/create.sql").build();
		return embeddedDatabase;
	}
	@Bean 
	public JdbcTemplate jdbcTemplate(){
		return new JdbcTemplate(dataSource());
	}


}
