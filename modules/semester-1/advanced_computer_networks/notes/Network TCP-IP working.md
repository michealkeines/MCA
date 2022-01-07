Addresses in TCP/IP model

![[Pasted image 20220107044409.png]]

Special: Application specific and optional. eg: URL: test.com , Email: test@test.com

Port: To identify the right application. Eg: http port 80

Logical IP address: To identify the right destination network.  eg: IP address of google.com 142.250.182.14

Physical MAC address: To identify the right host in the network

eg: sd-23sd-32-sd NIC

![[Pasted image 20220107045217.png]]

![[Pasted image 20220107045312.png]]

IP address contains 2 parts

left most part indicates the network group, remaining part of the address identifies a specific device within the group. this portion is unique for each device on the network.

eg: 192.168.1.43

"192.168.1" this is the network portion, ".43" it is the device specific id

Devices within the same network use the physical MAC address for communication

MAC addresses are embedded into the Ethenet NIC card

if the network portion of IP address is same, then sender and receiver are in same network

if the network portion of Ips address are different, they are in different network

Default Gateway

Gateway address of any host determines the path to exit/enter into another network.

![[Pasted image 20220107052901.png]]

if the packet is sent outside the network, the the destination mac address will be the mac address of default gateway not the host outside the server

since data link addressing is local addressing, it will have a source and destination for each link or hop of the joury to the destination

![[Pasted image 20220107054646.png]]

each hop will have it own send mac and reciver mac, but the send IP and reciver IP doesnt change

pc1 -> R1 : source: mac of pc1 , des : mac ofgateway of pc1 r1
r1 -> r2: source is mac of R1, des: mac of r2
r2 -> server: source is mac of r2, des mac of server



