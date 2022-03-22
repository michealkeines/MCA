Real Mode and Protected Mode

![[Pasted image 20220315005810.png]]


Real mode

![[Pasted image 20220315005916.png]]

![[Pasted image 20220315010024.png]]

VirTual Memory

![[Pasted image 20220315010114.png]]

# Dynamic Relocation

Base register points to the acualt phhycisal address and bouds holds the total size

thus we can calculate the physical  address = virtual address + base register


![[Pasted image 20220315010325.png]]


internal Fragmentation

The waste of allocated space is known as internal farmentation

![[Pasted image 20220315010620.png]]

Sections & Segments

![[Pasted image 20220315010737.png]]


Segments in Memory

![[Pasted image 20220315010859.png]]

Segments implementation

![[Pasted image 20220321234839.png]]

Virtual memory segment mapping

![[Pasted image 20220321235058.png]]

Sharing segments

RWX protection

![[Pasted image 20220321235230.png]]

Pagging

Solving External Fragmentation 

![[Pasted image 20220321235450.png]]

as we mutliple size bocks, we can convert them into fixed size pages

Pages & Page Frame

![[Pasted image 20220321235645.png]]

Page Tables

![[Pasted image 20220322000043.png]]

![[Pasted image 20220322000202.png]]

Paging Overhead

![[Pasted image 20220322000445.png]]

Translation Lookaside Buffer

TLB

![[Pasted image 20220322000540.png]]

TLB hit & TLB miss

Hit

![[Pasted image 20220322000722.png]]


Miss

![[Pasted image 20220322000801.png]]

Spatial Locality

![[Pasted image 20220322000956.png]]

TBL for differ processes

![[Pasted image 20220322001153.png]]

Page table size

![[Pasted image 20220322001549.png]]

Multi-level Pages

![[Pasted image 20220322001726.png]]

Physical address to Virtual Address

![[Pasted image 20220322001852.png]]

example


![[Pasted image 20220322002037.png]]

Address space sizes

![[Pasted image 20220322002308.png]]



Swapping

![[Pasted image 20220322002419.png]]

Present Bit

![[Pasted image 20220322002531.png]]

Page Replacement

![[Pasted image 20220322002628.png]]



