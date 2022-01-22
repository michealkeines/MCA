# Histroy of  relational Model

![[Pasted image 20220114003343.png]]

# Basic Terms used in relational Model

Relation - Table
A row - A tuple - A record

A column - or an attribute

Cardinality - Number of Rows present in a relation
Degree - Number of columns or attributes of a relation

Domain of an Attribute:

Set of possible atomic values used to model data.

eg: marital status can be: married, unmarried, divorced

![[Pasted image 20220114003745.png]]

![[Pasted image 20220114003933.png]]

# Keys

before understands keys we need know what an attribute is

attribute allows us to distingush differnt feilds

different keys are used to unqiely represent a relation between tables

![[Pasted image 20220114004349.png]]

Super keys:

a set of one or more attributes that, taken collectively, allows us to indentify uniquely a tuple in the relation

if key is a super key, then so is any superset of K

![[Pasted image 20220114004726.png]]

Candidate keys:

super keys for whihc no proper subset is a superkey

minimal super keys

{EID} and {Ename, Dept}

![[Pasted image 20220114004903.png]]

Primary Keys:

Minimal Candidate Key

{EID}

Primary Keys:

Minimal Canditate key

{EID}

Alernate Keys:

all candidate keys except the primary key

eg: {Ename, Dept}

Composite key

combination of two or more attributes to uniquely identify a tuple

Foreign Key

the primary key of one table may be used a non unique attribute of noather table

![[Pasted image 20220114005716.png]]



