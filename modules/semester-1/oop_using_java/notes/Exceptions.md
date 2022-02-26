
![[Pasted image 20220224111223.png]]

![[Pasted image 20220224111303.png]]

# Error

Errors tend to signal the end of your application as you know it. It typically cannot be recovered from and should cause your VM to exit. Catching them should not be done except to possibly log or display and appropriate message before exiting.

Example: OutOfMemoryError - Not much you can do as your program can no longer run.

Exceptions are often recoverable and even when not, they generally just mean an attempted operation failed, but your program can still carry on.

Example: IllegalArgumentException - Passed invalid data to a method so that method call failed, but it does not affect future operations.

These are simplistic examples, and there is another wealth of information on just Exceptions alone.


![[Pasted image 20220225234648.png]]


Eception Handling Keywords

![[Pasted image 20220225232414.png]]

try, catch, throw, throws, finally

![[Pasted image 20220225232647.png]]

![[Pasted image 20220225232704.png]]

![[Pasted image 20220225232741.png]]

![[Pasted image 20220225232846.png]]

# Exception Types

![[Pasted image 20220225233022.png]]

Error , Exception

# Exeption hierarchy

![[Pasted image 20220225233118.png]]

# Runtime exception

![[Pasted image 20220225233217.png]]

## uncaught exception

not handled

![[Pasted image 20220225233348.png]]

![[Pasted image 20220225233409.png]]

# mutliple catch blocks

![[Pasted image 20220225233537.png]]

![[Pasted image 20220225233627.png]]

# Built-in Exceptions

![[Pasted image 20220225233818.png]]

# Checked Exceptions

checked by compiler at compile time

![[Pasted image 20220225233912.png]]

# Unchecked Exceptions

not checked at compile time

![[Pasted image 20220225234050.png]]

![[Pasted image 20220225234223.png]]

![[Pasted image 20220225234317.png]]

# Throw

![[Pasted image 20220225235035.png]]

![[Pasted image 20220225235121.png]]

![[Pasted image 20220225235136.png]]

![[Pasted image 20220225235244.png]]

![[Pasted image 20220226000728.png]]

# Throws

![[Pasted image 20220226000829.png]]

![[Pasted image 20220226000932.png]]


# throw vs Throws

 Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.

Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.


# User defined Exceptions

![[Pasted image 20220226002002.png]]

![[Pasted image 20220226002029.png]]

![[Pasted image 20220226002120.png]]

![[Pasted image 20220226002224.png]]

![[Pasted image 20220226002319.png]]

![[Pasted image 20220226002400.png]]

