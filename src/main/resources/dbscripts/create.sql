create table company (
	company_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	name varchar2(32) NOT NULL,
	address varchar2(64),
	city varchar2(32),
	country varchar2(32),
	email varchar2(32),
	phone_number varchar2(16)
);
