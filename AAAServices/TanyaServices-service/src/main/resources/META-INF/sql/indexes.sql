create index IX_186EA1F0 on TANYA_Customer (groupId);
create index IX_D5A8E36E on TANYA_Customer (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_254F6D70 on TANYA_Customer (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_3653C170 on TANYA_Services (groupId);
create index IX_92CF33EE on TANYA_Services (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C0CFDDF0 on TANYA_Services (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C8B34A10 on tanya_Customer (groupId);
create index IX_ED4F5F4E on tanya_Customer (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_22236150 on tanya_Customer (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E6986990 on tanya_Services (groupId);
create index IX_AA75AFCE on tanya_Services (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_BDA3D1D0 on tanya_Services (uuid_[$COLUMN_LENGTH:75$], groupId);