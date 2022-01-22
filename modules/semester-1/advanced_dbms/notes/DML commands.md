Used for storing, retrieving, modifying and deleting data

commands: insert, select, update, delete

Select statement:

![[Pasted image 20220114015535.png]]

to retrieve data stored in a database

the column name & table name must be specified

the basic structure of the query consist of 3 clauses: SELECT, FROM & WHERE

eg: select column_name from table_name

![[Pasted image 20220114015839.png]]

![[Pasted image 20220114015948.png]]

Insert Statement:

to insert or add a new row to a table or relation

insert into tablename (column1, column2, ..) values (value1, value2, ..);

if we are inserting for all columns then we dont have to specifiy the column names

insert into tablename values (value1, value2, ..)

only single row is inserted at a time;

Update statement:

to modify the values of existing rows

![[Pasted image 20220114020505.png]]

all rows will be modified if we dont specify where clause

Delete statment:

to eliminate/remove existing rows from the table

![[Pasted image 20220114020644.png]]

delete without where clause to remove all rows from table.

