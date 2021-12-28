A database consist of information related to organiztion 

if it is a hospital, it will contain infomation about staff, medicine and patients 

it doesnt contain any unrelated data

so database is a collection of interrelated data.

data can be in any formart related to a context 

when we process the data to get result related to a particulater staff, the result is the information 

a set of program is used to manage those data, it is called the managenet system

management involves:
defining structures for storage of data,
providing mechanisms for the manipulation of data,
ensure the safety of the data stored like system crashes or unauthorized access

![[Pasted image 20211227043723.png]]

Enterpise examples

hr : employee infor, salaries, payroll
sales: customer info, product info, purchase info

DBMS - mysql, oracle, postgress, MSSQL

File Processing system

before DBMS the data is directly stored in files in secondary storage devices

seperate programs are needed to access or manipulate differenet data
eg: word, excel

limitations:

difficulty in accessing data,
data redundancy, inconsistency
atomicity
concurrent accesss anomalies,
security

DBMS uses structured query language(SQL) to read,delete,update data that is stored, thus makes  is efficient over file processing system

Atomicity of updates,

failures may leave database in an inconsitent state with partial updates carried our

eg: transfer fo funds from one account to another should either complete or not happend at all.

DBMS has recovery algorithsm to fail safe 
logs are also used to get back to previous state.

in order to maintain consistency in a database, before and after the transaction, certain properties are followed. these are called ACID properties.

![[Pasted image 20211227050157.png]]

concurrency methods like locking and timestamp based techinques are used

different access and views privileges for different users



