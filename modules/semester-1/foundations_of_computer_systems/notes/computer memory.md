Memory Unit

- Cache Memory
- Primary Memory- RAM, ROM
- Secondary Memory


Cache memory

the fetching of data from memery takes a lot of time, thus placing a temp memory between primary memory and processor, give a performance boost

no system bus needed to access the cache

frequently accesed data are place here

Primary memory

Limited storage capcity, storage of data and instructions

types - 
random access memory RAM
readonly memory ROM

RAM

read/write 
volative, stays till the power is on
type
static ram - retains stored data as long as power is on, high speed
dynamic ram - frequent refresing needed, refreshing should be done serveral hundred times per second

ROM

permanent memory
non volatile
stored by manufacturer
read only
like BIOS infomation required to boot up the OS everytime we start the computer


Prograrmmable ROM - info written only once
Electrically PROM - can be erased and programmed, ultra violent ligt is used to erase the ROM for 40 mins
Electrically Erasable PROM - can erased using electic light, can be erased one byte at a time, it slow process
Flash EPROM - erasing is fast but the entire device is erased at once

Secondary memory

permanent storage, 
non volatile, 
high capacity, 
cheaper, 
slow compare to primary memory

Memory cell

unit of memory is a cell  
typically it is 8 bits or a byte

Most significant bit: the bit at the left end (high order) MSB
Least significant bit: the bit at the right end (low order) LSB


![[Pasted image 20211226090640.png]]

Address, a name that uniquely identifies one cell in the computer main memory

each address is a single byte of storage

the names are actually numbers

these numbers are assigned consecutively starting at zero

if there is k = 10 address bit, then you will be able to represent 2^k locations

as 32-bit bus addresses 2^32 location or 4gp address space.


Byte ordering

big endian - high order bits are stored in LSB
little endian - high order bits are stored in MSB

suppose we store value 0x1234567

![[Pasted image 20211226091844.png]]










