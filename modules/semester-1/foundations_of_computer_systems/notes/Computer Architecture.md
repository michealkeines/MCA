- Rule of defining the functionalities of a computer
- Describing the capabilities and programming model of a computer

Instruction set architecture
Micro architecture
logic design

CPU basics

ALU - this is where is arithemetic operations happend
Control Unit - this controls the activites of every component
Registers - temporary storage locations for data

registers are classified into
Special purpose register
General purpose register

![[Pasted image 20220105071119.png]]

# Registers

registers are storage locations that hold data temporarily

Memory Address Register(MAR): Holds addresses
Memory Data Register (MDR): Holds the data
Instruction Register (IR): Holds the instruction currenlty beind executed
Program Counter (PC): Points to the next instruction that is to be fetched from memory

# Bus 

Group of wires which carries information between CPU and peripherals.

Data bus
Address bus
Control bus

# CPU basics

Memory Read:
CPU places the address of the required cell in the bus along with an electronic signal.

Memory Write:
CPU placess address of the cell and the data in the bus along with a write signal

# Stored Program Concept

Storing programs along with data in memory
Programs encoded as bit patters and stored in memory
control unit will decode and execute the instructions
programs can be updated in the memory

eg:
steps for multiplying two number:

- get the first value from the memory and store it in one of the registers
- get the second value from the memory and store it in another register
- activate the alu to perform multiplication with the two registers as input and store the result in another register
- store the result in memory
- stop


# Machine language

CPU show recognize the instructions encoded as bit patters

Collection of instructions along with encoded system is called machine language

set of all instructions recognized by machine

in machine language instructions are machine level instructions


# Instruction Set Architecture (ISA)

Reduced instruction set computer (RISC)
- Minimal set of machine instructions
- such machines are efficient, fast, and less expensive to manufacture

Complex Instuction set computer (CISC)
- Large number of complex instructions
- More complex CPU can better cope with evern increasing complexities of todays software.




