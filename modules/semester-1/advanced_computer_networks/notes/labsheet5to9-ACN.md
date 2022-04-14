# Labsheet 5

![[Pasted image 20220414000116.png]]

![[Pasted image 20220414000045.png]]

![[Pasted image 20220414000210.png]]


# Labsheet 6

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


# Labsheet 7

Open a command/DOS window (get to the DOS prompt) or terminal in ubuntu.
Ensuring proper identity in the command prompt, as shown below, type the command netstat -r

![[Pasted image 20220219045807.png]]

1.	What is the role of this host routing table which you observe from netstat command?

The next hop a packet should travel is decided based on the entries in this table

2.	Identify the interface in the interface list which is active in interacting with the Internet?

192.168.1.1 (etho0) is the gateway that is used to forward the packets to internet 

3.	Identify the default gateway in the IPv4 route table. Check whether it is the same, which is displayed using ipconfig command. What is the role of this gateway?

It is same as most of the traffic will be routed via this

4.	How many networks are there in the given topology?

there are 4 networks

192.168.1.0/24
192.168.2.0/24
192.168.3.0/24
192.168.4.0/24

5. 	Analyze the PC1 host routing table in the Packet Tracer.

![[Pasted image 20220219050846.png]]


PC1 -   

192.168.1.254/24

Fa0/0

6. 

![[Pasted image 20220219051421.png]]

7. the ping packet from PC1 to PC2 at the first hop Router1

![[Pasted image 20220219051607.png]]

router 1 table
![[Pasted image 20220219052012.png]]

s :   0090.2BA4.1451

d:   000B.BE49.081E

  

SRC ADDR:0090.0C9E.A7E9

  

DEST ADDR:00D0.580D.8967

8. the ping packet from PC1 to PC2 at the first hop Router2

![[Pasted image 20220219052348.png]]

  

SRC ADDR:0090.0C9E.A7E9

  

DEST ADDR:00D0.580D.8967

router 2 table 

![[Pasted image 20220219052512.png]]


9. the ping packet from PC1 to PC2 at the first hop Router3


![[Pasted image 20220219052551.png]]

  

DEST ADDR:0001.971C.718E
  

SRC ADDR:0001.420D.5B29

router3 table

![[Pasted image 20220219052720.png]]

# Labsheet 8

Connect Default Gateway Router to a LAN
The objective of this lab is to understand the configuration of a router in a LAN.

Complete the following packet tracer activities and provide appropriate completed screenshots for each of the 2 activity following the instructions.

1.	10.3.4 Connect a router to a LAN

![[Pasted image 20220226041811.png]]

![[Pasted image 20220226041831.png]]

![[Pasted image 20220226041848.png]]

![[Pasted image 20220226041917.png]]


2.	10.3.5 Troubleshoot Default Gateway issues


![[Pasted image 20220226044652.png]]

![[Pasted image 20220226044704.png]]

![[Pasted image 20220226044717.png]]


![[Pasted image 20220226044730.png]]



# Labsheet 9 

IPv4 Subnetting Scenario


ps-115 lan - 31

ps-101 lan - 19

pd-1 lan - 21

pd-2 lan - 14


# Subnet table

![[Pasted image 20220305075933.png]]


# Device Addressing table

![[Pasted image 20220305080035.png]]

# Screenshots

![[Pasted image 20220305085102.png]]

![[Pasted image 20220305084100.png]]

![[Pasted image 20220305084249.png]]


![[Pasted image 20220305084159.png]]

![[Pasted image 20220305084223.png]]