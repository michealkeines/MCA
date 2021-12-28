A transaction is a single logical unit of work which accesses and possibly modifies the contents of a database.

transactions access data using read and write operations

in order maintain consistency in a database, before and after the tranaction, certain properties are followed 

these are called acid properties

![[Pasted image 20211227052603.png]]

Atomicity:

the entire transaction takes places at once or doesn't happen at all.

- abort: if a transaction aborts, changes made to database are not visible
- commit: if a transaction commits, changes made are visible

consider transfer of 100 from account x to account y

![[Pasted image 20211227052831.png]]

if the transaction fails after completion of T1 but before completion of T2, like we are write(x) but the wite(y) is not completed yet, that is amount is detucted from X but not added to Y, this resuts in inconsistent state.

consistency:

database should be cosistent before and after the transaction, in the above example,

before transaction the total was x(500) + y (200) = 700
after transaction the total should be x(400) + y(300) = 700

if not the result T is incomplete

Isolation:
this property ensures that multiple transactions can occur concurrently wihtout leading to inconsistency of database state

transaction occur independently without interference 

changes occuring in a particular transaction will not be visible to any other transaction untill the particular change is commited.

X= 500 , Y=500

![[Pasted image 20211227053937.png]]

suppose T has been executed till read(y) and then T' starts, thus incorrect value of y is used in T'

transaction must takes place in isolation and changes should be visible only after they have been made to the main memory

Durability:

the transactions has completed execution, the updates and modifications to database are stored and writen to disk and they persist even if a system failure occurs.

