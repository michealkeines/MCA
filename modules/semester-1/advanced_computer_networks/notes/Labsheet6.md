Labsheet 6

arp -a command

![[Pasted image 20220212093344.png]]

![[Pasted image 20220212093516.png]]


1.	Find the arp table entries of PC0. Ensure it to be empty using arp –d

![[Pasted image 20220212105614.png]]

2.	Ping from PC0 to PC1 and use simulation to find the status of ARP frame used in the ARP process.
ARP Broadcast frame from pc0
ARP Reply frame from pc1

![[Pasted image 20220212111051.png]]

3.	Find the source and destination MAC address from PC0 to PC1  

source : 00-e0-b0-57-c8-77
destination: 00-90-21-9e-7e-88

![[Pasted image 20220212110717.png]]



1.	Find the arp table entries of PC1. Ensure it to be empty [using arp –d *]

![[Pasted image 20220212111239.png]]

3.	Ping from PC1 to PC3 and use simulation 
a.	Find the status of ARP frame used in the ARP process inside the PC1 network.
ARP Broadcast frame from PC1
ARP Reply frame from Router0

![[Pasted image 20220212111606.png]]

b.	Find the status of ARP frame used in the ARP process outside the PC1 network.
ARP Broadcast frame from PC1
ARP Reply frame from PC3

![[Pasted image 20220212112310.png]]

c.	Find the source and destination IP, MAC address from PC1 to Router0

Source:   111.111.111.112 , 00-90-21-9e-7e-88
Destination: 111.111.111.254, 000C.854A.3B85
d.	Find the source and destination IP, MAC address from Router0 to PC3
Source : 222.222.222.254, 00D0.97C0.ED54
Destination: 222.222.222.222, 00-01-97-e9-10-84


