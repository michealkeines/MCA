-    select p.pno, p.dno, e.lname, e.address from project p, department d, employee e where p.plocation = 'prolo2' and p.dno = d.dno and d.mgrssn = e.ssn;
    
    12:07:40
    
-    select p.pno, p.dno, e.lname, e.address from project p, department d, employee e where p.plocation = 'testlocat1' and p.dno = d.dno and d.mgrssn = e.ssn;
    
    12:05:23
    
-    select p.pno, p.dno, e.lname, e.address from project p, department d, employee e where p.plocation = 'testloct1' and p.dno = d.dno and d.mgrssn = e.ssn;
    
    12:05:03
    
-    select p.pno, p.dno, e.lname, e.address from project p, department d, employee e where p.plocation = 'testloct1' and p.dno = d.dno and d.mrgssn = e.ssn;
    
    12:04:46
    
-    select p.pno, p.dno from project p, employee e where p.pname = 'proj1' and e.superssn = (select dno from project where plocation = 'testlocation1');
    
    11:59:43
    
-    select p.pno, p.dno from project p, employee e where p.pname = 'proj1' and e.superssn = (select dno from project where plocation = 'testlocation1';
    
    11:59:38
    
-    select p.pno, p.dno from project p, employee e where p.pname = 'proj1' and e.superssn = p.plocation;
    
    11:58:28
    
-    select p.pno, p.dno from project p, employee e where p.pname = 'proj1' and e.superssn = (select dno from department where dlocation = 'testlocation1');
    
    11:57:19
    
-    select p.pno, p.dno from project p, employee e where pname = 'proj1';
    
    11:55:01
    
-    select p.pno, p.dno, from project p, employee e where pname = 'proj1';
    
    11:54:56
    
-    select p.pno, p.dno, from project p employee e where pname = 'proj1';
    
    11:54:44
    
-    select * from employee;
    
    11:53:51
    
-    select * from department;
    
    11:53:33
    
-    select * from employee;
    
    11:53:03
    
-    select * from project;
    
    09:37:06
    
-    select fname, address from employee where dno = (select dno from department where dname = 'testdep1');
    
    09:31:37
    
-    select * from employee;
    
    09:30:34
    
-    select * from department;
    
    09:27:09
    
-    select * from works_on;
    
    09:18:59
    
-    insert into works_on values (1001, 2001, 12); insert into works_on values (1002, 2002, 14); insert into works_on values (1003, 2003, 13);
    
    09:18:27
    
-    select * from project;
    
    09:17:04
    
-    insert into project values (2001,'proj1','prolo1',1); insert into project values (2002,'proj2','prolo2',2); insert into project values (2003,'proj3','prolo3',3);
    
    09:16:29
    
-    insert into project values (2001,'proj1','prolo1',1001); insert into project values (2002,'proj2','prolo2',1002); insert into project values (2003,'proj3','prolo3',1003);
    
    09:15:57
    
-    select * from dlocation;
    
    09:13:44
    
-    insert into dlocation values (1,'testlocat1'); insert into dlocation values (2,'testlocat2'); insert into dlocation values (3,'testlocat3');
    
    09:13:09
    
-    insert into dlocation values (1,'testlocation1'); insert into dlocation values (2,'testlocation2'); insert into dlocation values (3,'testlocation3');
    
    09:12:55
    
-    select * from department;
    
    09:10:33
    
-    select * from deppartment;
    
    09:10:30
    
-    select * from employee;
    
    09:10:11
    
-    update employee set dno = 1 where ssn = 1001; update employee set dno = 3 where ssn = 1003; update employee set dno = 2 where ssn = 1002;
    
    09:09:41
    
-    insert into employee (dno) values (1) where ssn = 1001; insert into employee (dno) values (3) where ssn = 1003; insert into employee (dno) values (2) where ssn = 1002;
    
    09:06:03
    
-    insert into department (dno, dname, mgrssn, mgrstartdate) values (1,'testdep1',1001,'12/23/2021'); insert into department (dno, dname, mgrssn, mgrstartdate) values (2,'testdep2',1002,'5/8/2021'); insert into department (dno, dname, mgrssn, mgrstartdate) values (3,'testdep3',1003,'1/2/2021');
    
    09:04:44
    
-    insert into employee (ssn,fname,lname,address,sex,salary,superssn) values (1002,'testname2','testlast2','testaddress2','female',1005, 1002); insert into employee (ssn,fname,lname,address,sex,salary,superssn) values (1003,'testname3','testlast3','testaddress3','female',1007, 1003);
    
    09:00:32
    
-    insert into employee (ssn,fname,lname,address,sex,salary,superssn) values (1001,'testname1','testlast1','testaddress1','male',1000, 1001);
    
    08:59:15
    
-    insert into table employee (ssn,fname,lname,address,sex,salary,superssn) values (1001,'testname1','testlast1','testaddress1','male',1000, 1001);
    
    08:59:07
    
-    create table works_on ( ssn integer references employee(ssn), pno integer references project(pno), hours integer );
    
    08:52:26
    
-    create table project ( pno integer primary key, pname varchar(10), plocation varchar(10), dno integer references department(dno) );
    
    08:50:41
    
-    create table project ( pno integer primary key, pname varchar(10), plocation varchar(10), dno integer references department(dno) );
    
    08:50:34
    
-    drop table project; create table dlocation ( dno integer, dloc varchar(10), primary key (dno, dloc) );
    
    08:48:04
    
-    create table project ( dno integer, dloc varchar(10), primary key (dno, dloc) );
    
    08:46:41
    
-    alter table department add column mgrssn integer references employee(ssn);
    
    08:41:51
    
-    create TYPE gender AS ENUM ('male', 'female', 'others'); create table employee ( ssn integer primary key, fname varchar(20), lname varchar(20), address varchar(100), sex gender, salary numeric(6,2), superssn integer references employee(ssn), dno integer references department(dno) );
    
    08:39:35
    
-    create TYPE gender AS ENUM ('male', 'female', 'others'); create table employee ( ssn integer primary key, fname varchar(20), lname varchar(20), address varchar(100), sex gender, salary numeric(6,2), superssn interger references employee(ssn), dno integer references department(dno) );
    
    08:39:14
    
-    create TYPE gender AS ENUM ('male', 'female', 'others'); create table employee ( ssn integer primary key, fname varchar(20), lname varchar(20), address varchar(100), sex gender, salary numeric(0,12), superssn interger references employee(ssn), dno integer references department(dno) );
    
    08:38:59
    
-    create TYPE gender AS ENUM ('male', 'female', 'others'); create table employee ( ssn integer primary key, fname varchar(20), lname varchar(20), address varchar(100), sex gender, salary numeric(6,12), superssn interger references employee(ssn), dno integer references department(dno) );
    
    08:38:47
    
-    create TYPE gender AS ENUM ('male', 'female', 'others'); create table employee ( ssn integer primary key, fname varchar(20), lname varchar(20), address varchar(100), sex gender, salary numeric(3,12), superssn interger references employee(ssn), dno integer references department(dno) );
    
    08:38:35
    
-    create TYPE gender AS ENUM ('male', 'female', 'others'); create table employee ( ssn integer primary key, fname varchar(20), lname varchar(20), address varchar(100), sex gender, salary numeric(3,12), superssn interger references employee(ssn), dno integer department(dno) );
    
    08:38:22
    
-    drop table department; create table department ( dno integer primary key, dname varchar(30), mgrstartdate date );
    
    08:33:15
    
-    create table department ( dno integer not null, dname varchar(30), mgrstartdate date );