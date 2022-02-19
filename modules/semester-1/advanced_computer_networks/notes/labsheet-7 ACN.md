# Advanced Computer Networks Labsheet7

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