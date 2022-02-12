its similar to arp

![[Pasted image 20220212083231.png]]

it has a neighor cache instead of arp table

![[Pasted image 20220212083334.png]]

ARP broadcasts requests to every host on the LAN, and that interrupts every host on the LAN to inspect and process the request to see if it is for them.

IPv6 has eliminated broadcast (a good thing). Instead, each interface must subscribe to a solicited-node multicast group for each IPv6 address assigned to the interface (each IPv6 interface will probably have at least two IPv6 addresses, and maybe more) based on the addresses assigned to the interface. When ND tries to perform an "ARP" function, it sends the request to the solicited-node multicast address (based on the IPv6 address to resolve). That will probably interrupt only the target host (far fewer hosts than IPv4 ARP).

