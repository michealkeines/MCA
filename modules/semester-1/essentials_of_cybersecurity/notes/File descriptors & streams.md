File descriptors:

as everyting in unix is file, thus every process is allocated with a file descriptor which is a nonnegative number that is mapped to specific a permission.

eg: file descriptor is like a ticket, everytime we want to access omething we give show the ticket to the kernel, it gives back the respective resource with respective permission

the mapping of file descriptor to actual permission is handled by the kernal.

kernel maintains a global file state table

every process maintains a file descriptor table

![[Pasted image 20220103013458.png]]

![[Pasted image 20220103013610.png]]

no matter what operation it is , like i/o, network, special, everyhing is handled using file descriptors

![[Pasted image 20220103004719.png]]

program only sees the file descriptors, kernel takes cares of the rest


Every process has three streams which are also file descriptors

0 - stdin
1 - stdout
2 - stderr

![[Pasted image 20220103005117.png]]

as we know that 0,1,2 are actually mapped to stdin, stdout, and stderr, we can redirecting the 1 to a file that we created

'<' refers to stdin
'>' refers to stdout

this can be used to 
make a program read its input from a file
make a program write its output ot a file
make a program write its errors out to a file

making the output of one program as input ofanother program method is known as anontmous pipes using a | pipe operator

![[Pasted image 20220103005804.png]]


![[Pasted image 20220103010117.png]]

while redirection we should &inforn of file discriptors, if not it will create sile with that name

cat test 1>&2

this will redirect stdout to stderr, we specify &2 to make it point to 2 stderr and not 2 as file name

we can stack this, but we should rember that it wilol executed in sequence

cat test 2>test 1>&2

we redirect stderr to file name test, then redirect stdout to stderr, as stderr is redireced to a file , stdout wil also be rediected to that file

 this wont work if cat test 1>&2 2>test, as it will be executed in sequence , tout will be rediected to err first
 
 
 ![[Pasted image 20220103012228.png]]
 
 


