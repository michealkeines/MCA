![[Pasted image 20220113000927.png]]

![[Pasted image 20220113001039.png]]

![[Pasted image 20220113002327.png]]

![[Pasted image 20220113002413.png]]

Ethernet switches operate in full duplex mode

![[Pasted image 20220113002518.png]]

Data Link Layer - Sublayer

![[Pasted image 20220113002636.png]]

Logical Link Control (LLC) - it acts as the interface between upper layers and the device hardware

Media Access Control (MAC) - it is reponsible for data encapsulation and media access control

mac is party realted with physical layer, thus data link layer has both hardware and software parts

Data link layer context

packets are transferred by different link protocols over different links

transportation segment = link, transportation mode = link protocol

![[Pasted image 20220113003106.png]]

Thus packets can expereince differnt kinds of media transition in different links before it reaches the destination

At each hop along the path, a router performs four basic layer 2 functions

Accepts a frame from the network medium

De-encapsulates the frame to expose the encapsulated packet

Re-encapsulates the packet into a new frame with update mac address of next hop

forwards the new frame on the medium of the next network segment

Where is link layer implemented

in each host routers and end devices

Implemented in adapeter knwon as network interface card NIC

NIC interfaces software in datalink layer and hardware in physical layer

attaches into host's system buses

![[Pasted image 20220113010542.png]]

![[Pasted image 20220113010747.png]]

# Error Control

![[Pasted image 20220113011249.png]]

# Parity Checking

a single bit added to the data for error detection

parity bit is send by the sender and checked by the receiver

if we have 10011101, if we have add number of 1 in out data then enter 1 as the parity bit, the receiver can then count the nuberr of 1 while receiveg and see if the parity matches

it is not reliable, because if two bits are lost the bit check might pass, but actual data is wrong

![[Pasted image 20220113011735.png]]

EDC - Error Dectection Correction

data with parity bit is called as D+EDC 

Error correction using two dimensional bit parity

data is placed in rows and parity bit is added to row and column, that we it can pin down which bit made the error and could be corrected without having to retransmit it again

![[Pasted image 20220113014422.png]]

![[Pasted image 20220113014710.png]]


# Cyclic redundancy check

![[Pasted image 20220113014902.png]]


choose r CRC , G bits such that sent data divided by G gives zero

if there is non zero reminder error is detected

can detecte all burst errors less than r+1 bits

![[Pasted image 20220113015600.png]]

sender add the remider to the data that way it should dvide to give zero in receiver end, if there was not error in trasmit

![[Pasted image 20220113015722.png]]

![[Pasted image 20220113015826.png]]

