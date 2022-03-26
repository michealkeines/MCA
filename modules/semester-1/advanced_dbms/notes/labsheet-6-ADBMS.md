# Labsheet 6

Question 1

Create a complex type for storing the attributes of an author such as id, name and address  where address is again a complex type consisting of Country, city and pin code.

a. Create table authors of the above created type and make id as the primary key.

![[Pasted image 20220326035128.png]]



b. Retrieve all the authors who live in 'India'

![[Pasted image 20220326035707.png]]


c. Update the pin code of the city 'Chennai' to 682345

![[Pasted image 20220326040356.png]]


Question 2

![[Pasted image 20220326045244.png]]


Employee inherits person
Customer inherits person

![[Pasted image 20220326052725.png]]

officer inherits employee
teller inherits employee
secretary inherits employee

![[Pasted image 20220326052741.png]]


a.Delete the person with id = '1099' from the person table who is a secretary.Now try to retrieve the row from secretary table

i will use name = 'Hela' instead of id = '1099'

![[Pasted image 20220326055208.png]]

![[Pasted image 20220326055253.png]]

we just remove that row so it gets removed inthe parent table

i should have used ONLY keyward to delete only from the secretary table and not in its parent tables

b.Retrieve name, city and street of all the people.

![[Pasted image 20220326053742.png]]


c.Get all the details of the people who are neither employees nor customers and      delete those people.


![[Pasted image 20220326055957.png]]

![[Pasted image 20220326060034.png]]


d.Delete a teller and see if you can extract his details from the person table.

![[Pasted image 20220326060510.png]]

![[Pasted image 20220326060704.png]]

here i have used only, thus only the teller table entry will be removed, and entry iside person table remains


Question 3

Create and insert into the following relations
Emp = (ename, children array, skillsarray)
Children = (name, Date of Birth)
skills = (type, exam )

![[Pasted image 20220326063654.png]]

![[Pasted image 20220326063953.png]]

a.Find the names of  children of Employee ‘ Ram’.

![[Pasted image 20220326070039.png]]

![[Pasted image 20220326065943.png]]


b.Find the Data of Birth of 2ndchild of Employee ‘ Ram’.

![[Pasted image 20220326064837.png]]

c.List thechildren of Employee ‘ Ram’ in order.

![[Pasted image 20220326064538.png]]

d.Find the no. of children for the employee ‘Ram’

![[Pasted image 20220326070343.png]]

e.Find all employees having skill type’ Programming’.

![[Pasted image 20220326071119.png]]

![[Pasted image 20220326071149.png]]

