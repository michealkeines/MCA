The internal architecture of the 8085 MPU is capable of performing the following operations

- Store 8-bit data (Registers, Accumulator)
- Perform arithmetic and logic operations (ALU)
- Test for conditions (If/then)
- Sequence the execution of instructions
- store temporary data in RAM during execution

It communicates with the other units using a bus
- Address bus : 16 bit
- Data Bus and Control Bus: 8 bit

## Address Bus
- Consiste of 16 address lines A0 - A15
- Operates in unidirectional mode: the address bits are always sent from the MPU to peripheral devices, not reverse.
- 16 address lines are capable of addressing a total of 2^16 = 65,536 (64k) memory locations
- Address locations: 0000 (Hex) - FFFF (Hex)

## Data Bus
- Consists of 8 data lines: D0 - D7
- operates in bidirectional mode.
- Data range: 00 hex - FF hex

## Control Bus
- consiste of various lines carrying the control signals such as read/write enable, flag bits.

## Registers
- Six general purpose 8-bit registers: B, C, D, E, H, L
- They can also be combined as register pairs to perform 16 bit operations: BC, DE, HL
- Registers are programmable (load data, move, etc)

Flag bits:
indicate the result of condition tests
Carry, Zero, Sign, Parity, etc.
Conditional Operations (IF/THEN) are executed based on the condition of these flag bits

Stack pointer (SP):
containes the memory address (16 bits) of the top most memory location in the stack

Program Counter (PC):
contains the memory address (16 bits) of the instruction that will be executed in the next step.

## Accumulator
- Single 8-bit register that is part of the ALU
- Used for arithmetic/logic operations - the result is always stored in the accumulator




