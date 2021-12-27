find the right flag

find the process id, got proc/pid/fd

ls -la and find the data/flag32 is opened

![[Pasted image 20211227022043.png]]

or we use strings ./chall1, the file name is hardcoded

![[Pasted image 20211227021953.png]]

or use ltrace to intrecept all the calls

![[Pasted image 20211227022130.png]]

