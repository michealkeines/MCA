# Database Architectures

Centralized
CLient-Server
Distributed
Parallel

# Centralized

Database & DBMS are stored at a central computer

it can be accessed by several other systems

![[Pasted image 20220108003201.png]]

# Client Server 

The environment consist of clients and servers connected via a network

Client:
- User machine that provides user interface capabilities & local processing power to run local applications
- Requests the additional functionality provided by the server as it doesn't exist in the client machine
- eg: PCs, mobile devices

![[Pasted image 20220108003438.png]]

Server:
- System that provides the service requested by the client
- Process the request from clients to perform specific functionalities. like: File access, database access, printing
- File server-maintains the files of the client machine & provides the requested files on demand
- Printer server-receiver prints requests from clients

Clinet-server are created on basis of two framework
- Two-tire architecture
- Three-tire architecture

two-tire architecture:

- the system components are distributed over client and server machines
- client containes user interface & application programs
- server-performs sql query & transaction processing
- query server or transaction server

![[Pasted image 20220108004147.png]]

to establish access to DBMS (on the server side), i.e between client & server.

Once the connection is established, the client can send the query & transaction requests through Open Database Connectivity (ODBC) API to the server.

Process the request & sent back the results to the client

Advantages:

- Simplicity
- compatibility with exsisting systems


Three tire architecture:

- User interface (client), Application Rules (middle tire) & Data access (Database server)

![[Pasted image 20220108005213.png]]

Client: Stores user interfaces and web browsers
Middle tire: 
 - Intermediate layer present between client and server
 - application server or web server
 - accepts requests from client, forward it to server and sent the result back to the client
 - Improves security
Server:
- Responsible for processing the database queries & commands
- the result is send back to the middle tire


# Distributed Database System

the database & DBMS are distributed among various sites and are connected via computer networks

any data that resides in a particular node could be accessed by other nodes in the network

it uses design techniques like fragmentation and replication for its functioning

![[Pasted image 20220108005338.png]]

# Paralled Database System

The system consists of multiple processors and multiple disks connected via intercommuncation network

data is partitioned amond different disks

Advantages:

executing the queries paralled by dividing the task among multiple processors.

![[Pasted image 20220108005741.png]]



