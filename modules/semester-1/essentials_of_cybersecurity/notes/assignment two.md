![[Pasted image 20220103034010.png]]

it handles certain signals

on will give us the flag

sudo kill -4 $(ps a | grep chall2 | grep R | awk -F ' ' '{print $1}') 


get the pid and try out diffreent combinations of signals

kil -l to list the different signals that we can send

![[Pasted image 20220103034129.png]]

