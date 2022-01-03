![[Pasted image 20220103062410.png]]

simple:

- easy to learn, simple syntax
- removed many complicated and rarely used features like explicit pointers, operator overloading
- automatic garbage collector in java removes unreferenced objects

object oriented
- everything in java is considered as object

platform independent
- java code is compiled by the compiler and converted into bytecode. this bytecode is a platform independent code because it can be run on multiple platforms
- Write once and run anywhere (WORA)

Secured
- no explicit pointers
- java programs run inside a virtual machine sandbox
- class loader
- bytecode verifier
- security manager

robust
- its uses strong memory management
- there is a lack of pointers that avoids security problems
- there is automatic garbage collection
- there is exception handling and type check mechanism in java

architecture neutral
- there is no implementation dependent features
- size of primitive types are fixed unlike c where a int is 2 bytes in 32-bit and 4 bytes in 64bit

portable
- at is compiled to bytecode and executed in jvm

high-performance
- java bytecode is close to native code

distributed
- as it allows to create distributed applications
- RMI and EJB allows to access file by calling method from any machine on the internet

mulit-threaded
- java allows multi threading, which doesnt occupy memory for each thread
- threads share a common memory area

dynamic
- it supports dynamic loading of classes, that means classes are loaded on demand
- it also supports functions from its native languages like c and c++



