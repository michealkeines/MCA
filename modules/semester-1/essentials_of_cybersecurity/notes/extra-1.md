Everything is a file describes one of the defining features of unix that a wide range of input and output resources such as document, directories , harddrives, keyboards, printers, inrpocess com, network com are simple stream of bytes exposed through file system name space

unix file types

seven standard unix file types

regular
directory
symbolic link
FIFO special
block special
character special 
socket

differen files are represented by the mode bit

regular file:

- hyphen-minus in mode bit

![[Pasted image 20211227010106.png]]

directory:

d is used in mode bit

![[Pasted image 20211227010153.png]]

symbolic link

a symbolic link is a reference to another file

it is represented using l in mode bit

![[Pasted image 20211227010301.png]]

Named pipes FIFO

its is similar or `|` but with a name in filesystem, it can used by mutiple processes, it provided bidirectional communication, as many processes with enough privilege can read or write to it

![[Pasted image 20211227011620.png]]

![[Pasted image 20211227011151.png]]

![[Pasted image 20211227011215.png]]

it is repesented with p in mode bit

![[Pasted image 20211227011258.png]]

socket

a socket is a special file used in interprocess communication, which encable communication between two processes, sendmsg() and recmsg() systemcalls are used


![[Pasted image 20211227011507.png]]

block/character special

https://unix.stackexchange.com/a/60147

the name block device comes from the fact that the corresponding hardware typicall reads or write a whole block at a time eg sector on a hard disk

the name character device comes from the fack that each character is handled individually

![[Pasted image 20211227012954.png]]






