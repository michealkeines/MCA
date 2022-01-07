Set of rules for any communication to be effective
Sender/Transmitter transmits signals from message source
Receiver receives signals and becomes the message destination

message source -> tansmitter -> transmission medium -> Receiverr -> message destination

![[Pasted image 20220107005149.png]]

Network protocol Requirements

Protocols = set of rules

Protocols should meet these requirements to send the message

message encoding and decoding rules
message delivery options and size
message timing - rules of engagement
message formatting and encapsulation

Message Encoding:

Encoding is the process of converting information into another acceptable form for transmission

sender encodes the message source to signals to get transmitter in the communication medium

Decoding reverses the process to interpret the information 

receiver decodes the signal to the message

![[Pasted image 20220107005649.png]]

Message Delivery Options & Size

Unicast: One Sender -> One Receiver

in this case, there is one send and one receiver 

Multicast: One Sender -> Group of Receivers

in this case, there is one sender and group of receivers

Broadcast: One Sender -> All Receivers

in this case, there is one sender and all the hosts in the network are the receivers

![[Pasted image 20220107005741.png]]

Message size restricted depending on media/link capacity

Message Timing

Rules of engaement:

Access method, what kind of method use for the communication

Flow control, way to check if something has arrived to the destination and to request again, if needed

Response time out, way to stop waiting after a particular wait time.

Message formatting & Encapsulation

Body of the message is encapsulated with the wrapper and sent, it contains information about sender and receiver

![[Pasted image 20220107011030.png]]

Network Protocal Types

Protocals can be implemented on devices in software, hardware or both

Network Communication protocols
	Enables two or more devices to communicate over one or more network
	eg: HTTP, TCP, IP

Network Security protocols
	Secure data to provide authentication, data integrity and data encryption
	eg: TLS, SSH, SSL

Routing Protocols
	Enable routers to exchange route information and thus helps to select best path for packets to move forward
	eg: OSPF, BGP

Serivce Discovery
	Used for automatic detection of devices or services
	eg: DNS, DHCP
	
![[Pasted image 20220107011650.png]]

Network Protocol Functions

protocols have their own format, function and rules

Addressing - Identifies sender and receiver - IP, Ethernet
Reliability - Provides guaranteed delivery - TCP
Flow Control - Ensures data flow at an efficient rate - TCP
Sequencing - Uniquely labels each transmitted segment of data - TCP
Error Detection - Determine if data becomes corrupted during transmission - TCP, IP, Ethernet
Application Interface - Process-to-Process communication between network applications - HTTP, HTTPS

![[Pasted image 20220107012058.png]]

