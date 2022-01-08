main purpose of a DBMS

provide users with abstract view of data
- Hiding details of how data are stored and maintained
- Hiding the complexity from the naive users

like a printf function in c program, that provides a abstraction over the internal complicated implementation

# ANSI/SPARC Architecture

The three levels
- View level
- Logical level
- Physical level

![[Pasted image 20220108010448.png]]

Physical Level:

- Complex level of abstraction
- How the data are stored in a database
- Describes complex low-level data structures
- Only access to the Database Administrator (DBA)

Parameters:
- Database size, isolatin levels
- Disk space
- memory utilization
- index structures
- usage of secondary storage

Example: an insturctor record, a block of consecutive storage locations, details hidden by the compiler


Logical level:

Decribes what data are stored in the database
what relationship exist among those data
design of a database for an application and the schema definitions 
accessed by DBA and Applications developers

Physical data independence, changes made at the physical level does not affect the logical level

View level:

several views of the database are defined 
a database user sees some or all of these views
hides the logical level details
reduces the complexity of the logical level
security by preventing complete access

eg: A staff at the accounts departiment need to see the fee payments information of the students but not the salary of isntructors as visible to the HR department.

## Mapping

the process to convert a request and the result from one level to another level is known as mapping.

the mappiing defines the correspondence between three levels

the DBMS is responsible for mapping between these three types of schemas in the database 

Two types:
Conceptual/Internal mapping
External/ Conceptual mapping

![[Pasted image 20220108011654.png]]


Conceptual/Internal mapping

- Correspondence between logical view and the stored database
- it describes how conceptual records are stored and retrieved from the storage device
tell the DBMS how to conceptual record are physically represented
- if any changes oocur in the structure of the database, conceptual/internal mapping must also be changed
- if the structure of the stored database is changed, then the mapping must be changed
- it is the responsibility of DBA to manage such changes and control it accordingly

External/Conceptual mapping

- Correspondence between as specific external view and the conceptual view
- tells the DBMS which object on the conceptual level correspond to the object requested on a particular user's external view.
- only a part of the database will be available to a specific user
- if changes are made to either an external view or conceptual view, then mapping must be changed accordingly in the data file


# Data independence

The properties of the data base to change the schema at one level without affecting the higher level schemas

Application programs are independent of any specific physical representation or access techniques

two types of data independence:
Physical data independence
Logical data independence


Physical data independence:
- Changing the structure of the database without changing the conceptual view or external views
- only the conceptual/internal level mapping need to be changed
- conceptual schema helps the users to get isolated for changes in the physical storage of data.

Logical data independence:
- is the capacity to change the conceptual schema without having to change external schemas or application programs
- we may change the conceptual schema to expend the database (by adding a record type ot data item), to change constraints, or to reduce the database(by remvoing a record type or data item)






