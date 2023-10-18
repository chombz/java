-- --Create the college database
Create database Edwin_CollegeDB;

-- --Switch to the college database
use Edwin_CollegeDB;

-- --Create the courses table
Create table Course
(
	CourseCode nvarchar(20) not null primary key,
	CouseName nvarchar(100) not null,
	Fee float not null default(40000),
	Duration int not null
);

-- --Create the Modules table 
Create table Module
(
	ModuleID nvarchar(20) not null Primary Key,
	ModuleName nvarchar(100) not null,
	CourseCode nvarchar(20) not null
);

-- --Insert the data into the Course table
Insert into Course
values
('ACCP','Aptech Certified Computer Professional',250000,24),
('ARENA','Aptech Multimedia',210000,18),
('BBA','Business Accounting',750000,36),
('BBET','Business Enterpreneurship',780000,48),
('BBM','Business Marketing',650000,48),
('ICDL','International Computer Driving Licence',42000,2);

-- --Insert the data into the Module table
Insert into Module
values
('OV-MOD-C','C Programming','ACCP'),
('OV-MOD-DWCS5','Designing  and Publishing Websites in DW CS5','ACCP'),
('OV-MOD-GOOGADVTG','Google Advertising Fundamentals','ACCP'),
('OV-MOD-GOOGANYTCS','Google Analytics','ACCP'),
('OV-MOD-HTML5','Creating Next Generation Websites','ACCP'),
('OV-MOD-INTSE','Internet Security','ACCP'),
('OV-MOD-SQLSVR2016','Database Management in MS-SQL 2016','ACCP'),
('OV-MOD-SWPRJMGMT','Software Project Management','ACCP'),
('OV-MOD-XML','Introduction to XML','ACCP');

-- --display the inserted records
Select * from Course;
Select * from Module;