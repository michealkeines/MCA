Purpose


![[Pasted image 20220112225342.png]]

![[Pasted image 20220112225513.png]]

Transports bits across the network media

accepts a complete frame from the datalink layer and encodes it as series of signals that are transmitted to the local media

this is the last step in the encapsulation process

![[Pasted image 20220112225843.png]]

![[Pasted image 20220112225944.png]]

# encoding

method of coverting a stream of data bits into predefined code

coding provides predictable patters that can be recoganized by the next networking device

eg: manchester, 4b/5b, 8b/10b

in machester - transition occurs at the middle of each bit period, if the same bit is next , then transition starts from the begining

![[Pasted image 20220112230435.png]]

# signaling

method of representing the bit 1 and 0 on the physical medium

signaling method varies based on the type of physical medium

three types of media

copper,
fiber optic,
wireless

![[Pasted image 20220112230836.png]]


# difference between signalling and encoding

Signaling is the method by which you define what a one or zero is. Encoding is how you use the 1s and 0s to represent information

Signaling defines method (voltage, current, RF, light) will be used to represent a 1 or 0. For example; if I say a 1 is 5 volts and a 0 is 0 volts, this is signaling.

Encoding is how the 1s and 0s will be used. For example; if I say a 1 means "On" and a 0 means "Off", this is encoding.

the confusion arose because i thought both represent 0,1 it true in some cases, but there is other cases where encoding define 1 to something else and 0 to something else


thus signaling just defines the method in our 0 and 1 will b represented

encoding will define what that 0 and 1 will represent maybe cat and dog

further similar explanations

I would also say that encoding could be as simple as converting a bit stream to another bit stream that represents the amplitudes of the actual physical line code, so if 01 represented 1, 1 would be converted to 01, whereas the signalling details the baud rate that gets used, hence then the bandwidth of the signal. It also includes the power amplitude of the signal (the actual amount of power radiated from the antenna for the symbol representing 1 for instance), and may contain further details such as the carrier frequency or even the frequency response of the channel and the channel gain

# characteristics

Physical layer is responsible for speed of data transfer in controlling bits for information

bandwidth is the capacity at which a medium can carry data

measures the amount of data flows in BPS

![[Pasted image 20220112231033.png]]

physical properties, current technologies and the laws of physics play a role in dertermining available bandwidth

# bandwidth terminology

terms used to measure the quality of bandwidth include

latency, throughput, goodput

Latency = amount of time, including delays for the data to travel from one device to the another

throughput = the measure of the transfer of bits accross the media over a given period

goodput = the measure of usable data transferred over a given period

goodput = throughput - traffic overhead

