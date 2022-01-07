Network Protocols are set of rules defined in the sofware process for 

how are messages formatted or sturctured?
how and when erro and system messages are passed between devices
setup and termination of data transfer session

networks are complex with many components 

organizing network structure better is possible by layered models

Components:

end devices - laptop, mobile
intermediary devices - switch, routers
media - wired: copper, fiber, wireless: radio, microware
applications: provides human interface
protocols - set of rules for network communication
services - follows protocols to prepare data for the network

protocol layers helps in organizing the structure of the complex systems like network

![[Pasted image 20220107035459.png]]

Layers each layer implements a service

via its own internal layer actions ex: at the gate layer, loading & unloading

relying on services provided by later below

![[Pasted image 20220107035810.png]]

Layered model is used to easily explain and understand complex concepts like how network operates

TCP/IP and OSI models describe network operation

Modularization eases maintenance, updating of system

eg: change in services in one layer doesnt affect other layers

Benefits:

Assist in protocol design because protocols that operate at a specific layer have defined information that they act upon and a defined interface to the layers above and below.

Foster competition because products from different vendors can work together

prevent technologies or capability changes in one layer from affecting other layers above and below

provide a common language to describe networking functions and capabilities

Protocol stack

Network designers organize protocols in layers

each protocol belongs to one of the layers

each layers provides its services by 
performining actions to the layer
use the services of the layer directly below it bg: HTTP uses the TCP service from Transport layer

network components are distrubuted among layers eg: Router = Layer 3

when taken together, the protocol of varios layers are called protocol stack

Internet protocal stack = TCP/IP model

Application layer - supports network applications like web, email - HTTP, SMTP
Transport layer - Process to Process data transfer - TCP, UDP
Network layer - Routing packets to destination - IP, OSPF etc
Data Link layer - Data transfer between neighboruing devices - HDLC, PPP
Physical layer - Bits as signals on the wite - Ethernet

![[Pasted image 20220107041331.png]]

OSI Reference Model

Application layer - Support network applications like web, email
Presentation layer - Provides for common representation of the data
Session layer - Managed data exechange session
Transport layer - process to process data transfer
Network layer - determine the best path through the network
Data Link layer - data transfer between neighbouring devices
Physical layer - bits as signals on the communication medium

![[Pasted image 20220107041418.png]]

![[Pasted image 20220107041822.png]]

Encapsulation - process where protocols add their information to the data
at each layer, a protocol data unit has has a differnt name to reflect its new functions

Intital data is created in the application layer
its is then sliced into chucks in session layer
every chuck is added transport header which contain source and destination port with flow control related flags called as a segment

![[Pasted image 20220107042159.png]]

every segment is added a network header whihc contains source and destination IP address called as a packet

![[Pasted image 20220107042334.png]]

every packet is addes a frame header and frame trailer whihc contains structure information based on the transmission medium like wifi, ethernet bluetooth etc

Phycial layer convertes the fames in to bits and send them through transmission media

![[Pasted image 20220107042837.png]]

Sending message using Internet Protocol stack

data is pushed down in protocol stack in sending a message in TCP/IP communication process

Encapsulation is adding control or header information along with the user data

encapsulation takes place in the sender side


eg: web server sending a HTML page

Receiving messaing using Internet protocol stack

data is popped out from protocol stack in receiving a message in TCP/IP

de-encapsulation is removing control or header information from the user data, it takes palc ein the receiver side

eg: web client receiving the HTML page from web server


