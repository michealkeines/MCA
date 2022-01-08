# Database Schema

The overall desing of the database

doesnt show the data
not changed often

based on the levels of abstraction

Physical schema - Database design at the physical level
Logical schema - Database desing at the logical level, most important, applications built using this, phsyical data independence, changes to the phycials schema does not affect the logical schema
View schema - Different views of the database, also has sub schemas

Schema examples:

Student(number, name, course, age)


![[Pasted image 20220108015359.png]]

the arrows shows the relationships between differnt schemas


# Instances

Information stored in the database at a particular time

eg: set of student information at a particular time t

Insertions, updates, deletions to the is at a later time, t + 1

![[Pasted image 20220108015655.png]]

at a particular time whatever the data present in a particular schema that we called as an instance


