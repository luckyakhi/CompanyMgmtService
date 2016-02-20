create table company {
	company_id number NOT NULL,
	name varchar2(32) NOT NULL,
	address varchar2(64),
	city varchar2(32),
	country varchar2(32),
	email,
	phone_number (16), PRIMARY KEY(company_id)
};
create sequence company_id_seq start with 1;