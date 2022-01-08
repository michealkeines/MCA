when a user enters a value for a particular column, the DBMS checks whether the value statisfies particular constraint associated with that column

![[Pasted image 20220108041658.png]]

# Integrity Constraints

Integrity constraints are a set of rules. it is used to maintain the quality of information.

integrity constraints ensure that the dat insertion, updating, and other processes have to be performed in such a way that dat integrity is not affected.


Examples:

An employee name cannot be null (not null)

No two employees can have the same employee ID (unique)

Every department name in the course relation must have a matching department name in the department relation (referential integrity)

The salry of an employee must be greater than 0 dollars (check)


# Domain Constraints

Domain constraints can be defined as the definition of a valid set of values for an attribute

The data type of domain includes string, character, integer, time, date, currenty etc.

the value of the attribute must be available in the corresponding domain.

Eg:

![[Pasted image 20220108042340.png]]


# Entity integrity Constraints

The entity integrity constraint states that primary key value can't be null

this is because the primary key value used to identify individual rows in relation and if the primary key has a null value, then we cant identify those rows.

A table can contain a null value other than the primary key field

Eg:

![[Pasted image 20220108042613.png]]


# Referential Integrity Constraints

A referential integrity constraint is specified between two tables.

in the referential integrity constraints, if a foreign key in table 1 refers to the primary key of table 2, then every value of the foreign key in table 1 must be null or be available in table2

![[Pasted image 20220108042959.png]]

D_no should only contain value that is a primary key in the table 2 or null

in this 18 is not a primary key in table 2, thus it is a invalid entry

# Key Constraints

Keys are the entity set that is used to identify an entiry within its entity set uniquely

An entity set can have multiple keys, but out of which one key will be the primary key. A primary key can contain a unique and null value in the relational table.

Eg:

![[Pasted image 20220108043341.png]]


# ALL Constraints

Primary Key
Foreign key
not null
Unique
check
default

constraints can be specifies at column level or table level

column level the primary key is defined right next to the column name i.e is the column definition

table level the primary key is defined at the end of the table definition

## Primary key constraint

Column level 

CREATE TABLE EMPLOYEE (EMP_ID varchar(10) PRIMARY KEY, EMP_NAME varchar(40) NOT NULL, AGE int, SALARY numeric(8,2) NOT NULL);

Table level

CREATE TABLE EMPLOYEE (EMP_ID varchar(9), EMP_NAME varchar(35) NOT NULL, AGE int, SALARY numeric(8,2) NOT NULL, PRIMARY KEY(EMP_ID));

![[Pasted image 20220108052216.png]]

## Composite Primary Key

Multiple columns are used to specify the primary key of a table.

Composite Primary Key can be applied only at table level

these columns may have different data types.

CREATE TABLE table_name (col1 datatype, col2 datatype, col3 datatype, col4 datatype, PRIMARY KEY(col1, col2,....))

CREATE TABLE section (course id varchar(8), sec id varchar(8), semester varchar(6), year numeric (4,0), building varchar(15), room number varchar(7), time slot id varchar(4), PRIMARY KEY(course id, sec id, semester, year));

![[Pasted image 20220108052233.png]]

## Foreign key

Referenced column and referencing column should have the same data type, size can be different

column level:

CREATE TABLE SKILL (SL_No varchar(9) PRIMARY KEY, Emp_id varchar(10) REFERENCES EMPLOYEE(EMP_ID), Skill varchar2(35));

CREATE TABLE SKILL (SL_NO varchar(9) PRIMARY KEY, Emp_id varchar(10), Skill varchar2(35), FOREIGN KEY(emp_id) REFERENCES EMPLOYEE(EMP_ID));

![[Pasted image 20220108052530.png]]


## NOT NULL

restricts to enter null value to the attribute

![[Pasted image 20220108052917.png]]

## Unique 

a column or set of columns must have unique values

![[Pasted image 20220108053049.png]]

## Check

restricts value of an attribute to a permitted range

![[Pasted image 20220108053252.png]]

## Default

Insert default value, if there is not input specified


![[Pasted image 20220108053354.png]]







