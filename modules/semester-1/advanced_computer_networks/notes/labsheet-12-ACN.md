# labsheet 12

![[Pasted image 20220414031005.png]]


![[Pasted image 20220414031025.png]]

![[Pasted image 20220414031048.png]]



Objectives

In this Packet Tracer activity, you will troubleshoot and resolve connectivity issues, if possible. Otherwise, the issues should be clearly documented so they can be escalated.
Background / Scenario

Users are reporting that they cannot access the web server, www.cisco.pka after a recent upgrade that included adding a second DNS server. You must determine the cause and attempt to resolve the issues for the users. Clearly document the issues and any solution(s). You do not have access to the devices in the cloud or the server www.cisco.pka. Escalate the problem if necessary.

Note: Router R1 can only be accessed using SSH with the username Admin01 and password cisco12345. Router R2 is in the ISP cloud and is not accessible by you.
Instructions
Step 1:  Determine connectivity issues from PC-01.

    On PC-01, open the command prompt. Enter the command ipconfig to verify what IP address and default gateway have been assigned to PC-01. Correct as necessary according to the Addressing Table.
    After verifying/correcting the IP addressing issues on PC-01, issue pings to the default gateway, web server, and other PCs. Were the pings successful? Record the results.

Questions:

Ping to default gateway (172.16.1.1)?


Yes

To web server (209.165.201.2)?


Yes

Ping to PC-02?


Yes

To PC-A?


No

To PC-B?


No

    Use the web browser to access the web server on PC-01. Access the web server by first entering the URL http://www.cisco.pka and then by using the IP address 209.165.201.2. Record the results.

Questions:

Can PC-01 access www.cisco.pka?


Yes

Using the web server IP address?


Yes

    Document the issues and provide the solution(s). Correct the issues if possible.

The IP address on PC-01 is incorrectly configured. To resolve the issue, the IP address is changed from 172.168.1.3 to 172.16.1.3. PC-01 cannot successfully ping the PCs on the 172.16.2.0/24 network.


Step 2:  Determine connectivity issues from PC-02.

    On PC-02, open the command prompt. Enter the command ipconfig to verify the configuration for the IP address and default gateway. Correct as necessary.
    After verifying/correcting the IP addressing issues on PC-02, issue pings to the default gateway, web server, and other PCs. Were the pings successful? Record the results.

Questions:

Ping to default gateway (172.16.1.1)?


Yes

To web server (209.165.201.2)?


Yes

Ping to PC-01?


Yes

To PC-A?


No

To PC-B?


No

    Navigate to www.cisco.pka using the web browser on PC-02. Record the results.

Questions:

Can PC-02 access www.cisco.pka?


Yes.

Using the web server IP address?


Yes

    Document the issues and provide the solution(s). Correct the issues if possible.

PC-02 can access the web server using the IP address after correcting the default gateway. The default gateway should be configured as 172.16.1.1 on PC-02. PC-02 cannot successfully ping the PCs on the 172.16.2.0/24 network.


Step 3:  Determine connectivity issues from PC-A.

    On PC-A, open the command prompt. Enter the command ipconfig to verify the configuration for the IP address and default gateway. Correct as necessary.
    After correcting the IP addressing issues on PC-A, issue the pings to the web server, default gateway, and other PCs. Were the pings successful? Record the results.

Questions:

To web server (209.165.201.2)?


No

Ping to default gateway (172.16.2.1)?


No

Ping to PC-B?


Yes

To PC-01?


No

To PC-02?


No

    Navigate to www.cisco.pka using the web browser on PC-A. Record the results.

Questions:

Can PC-A access www.cisco.pka?


No

Using the web server IP address?


No

    Document the issues and provide the solution(s). Correct the issues if possible.

PC-A can only access the local LAN. The interface G0/1 on router R1 is incorrectly configured. Correct the IP address on interface G0/1. Access router R1 using SSH from PC-01 or PC-02 to change the IP address from 172.16.3.1 to 172.16.2.1.
Step 4:  Determine connectivity issues from PC-B.

    On PC-B, open the command prompt. Enter the command ipconfig to verify the configuration for the IP address and default gateway. Correct as necessary.
    After correcting the IP addressing issues on PC-B, issue the pings to the web server, default gateway, and other PCs. Were the pings successful? Record the results.

Questions:

To web server (209.165.201.2)?


Yes

Ping to default gateway (172.16.2.1)?


Yes

Ping to PC-A?


Yes

To PC-01?


Yes

To PC-02?


Yes

    Navigate to www.cisco.pka using the web browser. Record the results.

Questions:

Can PC-B access www.cisco.pka?


No

Using the web server IP address


Yes

    Document the issues and provide the solution(s). Correct the issues if possible.

PC-B can access the web server using the IP address only. PC-B is also configured with the correct DNS-2 server address. This indicates that DNS-2 server may be incorrectly configured. To resolve this issue temporarily, the DNS server address can be configured to use 209.165.200.3.The issue with DNS-2 server needs to be escalated because you do not have administrative access to devices outside your network.

    Could all the issues be resolved on PC-B and still make use of DNS2? If not, what would you need to do?

No. DNS2 apparently has configuration issues. You would need to contact the person in charge of the DNS2 server and report your findings.

Step 5:  Verify connectivity.

Verify that all the PCs can access the web server www.cisco.pka.

Yes