![[Pasted image 20220105073758.png]]

Opcode - Specifies operation executed by the instruction
Operand - Data / Memory Location executing the instruction

# Instruction Formats

Three address Instruction
- Operation Source1 Source2 Destination
Two address Instruction
- Operation Source Destination
One address Instruction
- Operation Source/Destination
Zero address Instruction
- Location of all operands are defined implicitly

# Instruction Types

Data transfer instructions
Arithmetic/logic instructions
Control Instruction
 
 Data transfer insturctions
 Transfer of information from one location in the computer to another
 
 RRegister Tranfer Notaion
 LOAD: Request to fill a general purpose register with content of memory
 STORE: Transfer the content of the register to memroy cell
 
 Arithmetic and logic instructions
 
 Instructions that direct the ALU unit to perform some arithemtic or logic operations
 - ADD, SUB, AND, OR etc

control instructions:

Chanding the execution of the programs
Moving control from some other part of the memory
Jump instructions
- Unconditional Jump - jumps to amemory location without any check
- Conditional Jump - jups to a memroy loccation when a condion is true

Eg:

DIV A, B, C

Locad a register with a value from memory
load the second register with a memeory content
if the second valud is zero JUMP to step6
Perform devision operation and divide the contents of the first register by second register and store the result in a rhtird register
store the contents of the thrid register in memory
stop

Encoding instructions

![[Pasted image 20220105081812.png]]

address of current instruction is stored in instruction pointer
address of next insturciton is stored in program counter

Bit patter in the opcode field specifies which operation is requested by the instruction
Bit pattern at he operand feild give more inofmation about the operaion

https://technobyte.org/data-transfer-instructions-8085/


Let’s start with a summary of all the instructions that are used to copy data from one place to another inside the 8085 microprocessor.

In this table, R -> register; M -> Memory (HL register pair); data -> direct data; rp -> any of the three register pairs; A -> Accumulator; SP-> Stack pointer


![[Pasted image 20220111234059.png]]

![[Pasted image 20220111234112.png]]

![[Pasted image 20220111234124.png]]