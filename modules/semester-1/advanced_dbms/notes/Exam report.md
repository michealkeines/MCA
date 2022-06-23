
Create two custom types

![[Pasted image 20220521191835.png]]

Created two custome type for empoyee details and client details

Create a table

![[Pasted image 20220521192136.png]]

The company table has project id, name of the project, startdate, emp_details, location, client_details

![[Pasted image 20220521192347.png]]

Insert date into table

![[Pasted image 20220521193246.png]]

![[Pasted image 20220521193301.png]]

![[Pasted image 20220521193218.png]]


Count number of emp in p1 which is 1 in my case

![[Pasted image 20220521193914.png]]

![[Pasted image 20220521193936.png]]

update projectid-3 with another employee

![[Pasted image 20220521194321.png]]

![[Pasted image 20220521194356.png]]

get client name for project id 4

![[Pasted image 20220521194552.png]]

![[Pasted image 20220521194650.png]]

now projects with client id=1

![[Pasted image 20220521194836.png]]

all projects where emp1 works

![[Pasted image 20220521195939.png]]

![[Pasted image 20220521195953.png]]



Dump of all sql statements

```

create type employee as (
	eno int,
	ename varchar(50),
	age int
);

create type client as (
	cno int,
	cname varchar(50)
);

create table company (
	project_id integer primary key,
	name varchar(50),
	startdate date,
	emp_details employee [],
	loc varchar(20),
	cln_details client
);



insert into company values (1, 'project1', '2021-01-02',
							array[row(1,'emp1',23)::employee,
								  row(2,'emp2',24)::employee],
							'delhi',
							row(1,'client1')
						   );
insert into company values (2, 'project2', '2021-01-03',
							array[row(1,'emp1',23)::employee,
								  row(2,'emp2',24)::employee,
								 row(3,'emp3',25)::employee],
							'bangalore',
							row(2,'client2')
						   );
insert into company values (3, 'project3', '2021-01-04',
							array[row(1,'emp1',23)::employee,
								  row(2,'emp2',24)::employee],
							'pune',
							row(3,'client3')
						   );
insert into company values (4, 'project4', '2021-01-05',
							array[row(1,'emp1',23)::employee,
								  row(2,'emp2',24)::employee,
								 row(3,'emp3',22)::employee,
								 row(4,'emp4',21)::employee],
							'pune',
							row(4,'client4')
						   );

select * from company;

select count(*) from 
	(select unnest(emp_details) from company 
	 where project_id=1) as t;
	 
select * from company where project_id=3;

update company set emp_details=emp_details || row(3,'emp3',25)::employee where project_id=3;

select * from company where project_id=4;

select (cln_details).cname from company where project_id=4;

select * from company where (cln_details).cno=1;

select name from company as c, unnest(emp_details) as t where (t).ename = 'emp1'



```