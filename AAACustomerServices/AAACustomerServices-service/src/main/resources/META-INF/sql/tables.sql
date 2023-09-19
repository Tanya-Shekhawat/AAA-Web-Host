create table AAA_AAA_Customer (
	uuid_ VARCHAR(75) null,
	customer_id LONG not null primary key,
	name VARCHAR(75) null,
	email VARCHAR(75) null,
	nrc VARCHAR(75) null,
	contact_no VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ServiceId LONG
);

create table AAA_AAA_Services (
	uuid_ VARCHAR(75) null,
	ServiceId LONG not null primary key,
	ServiceName VARCHAR(75) null,
	ServicePrice VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table AAA_Customer (
	uuid_ VARCHAR(75) null,
	customerId LONG not null primary key,
	name VARCHAR(75) null,
	email VARCHAR(75) null,
	address VARCHAR(75) null,
	national_Id VARCHAR(75) null,
	contact VARCHAR(75) null,
	start_date DATE null,
	serviceId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table AAA_Services (
	uuid_ VARCHAR(75) null,
	serviceId LONG not null primary key,
	serviceName VARCHAR(75) null,
	serviceDescription VARCHAR(75) null,
	servicePrice VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);