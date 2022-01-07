# ALU 
alu performs 

addition
subration
increment
decrement
logical AND
Logical OR
Logical Exclusive or
complement (logical not)
left shift

it has 74  insturctions in its instructions set

they are catagorized into

Data transfer instrction
Arithmetic instructions
Logical Instructions
Branching instruction
Machine control insturctions


## Data transfer Instructions

Move : Move Rd, Rs

Move Immediate: MVI R, 8 bit data

Input from port: IN 8bit address of input port
Output to port: OUT bit address of output port

Add register to accumulator: ADD R

Add immediate to accumulator: ADD 8-bit data

Subtract register from accumulator: SUB R

Subtract immediate from accumulator: SUI 8-bit data

Increment register: INR R

Decrement register: DCR R

AND with accumulator: ANA R

AND immediate with accumulator: ANI 8-bit data

OR with accumulator: ORA R

OR immediate with accumulator: ORI 8-bit data

Exculsive OR with accumulator: XRA R

exculsive OR with immediate with accumulator: XRI 8bit data

Complement accumulator: CMA

unconditional JUMP: JMP address (label)

Jump on Zero: JZ address (label)

Jump on non-zero: JNZ address (label)

Jump on carry: JC address (label)

Jump on no carry: JNC address (label)

Jump on plus: JP address (label) // check sign flag

Jump on minus: JM address (label) // check sign flag

Jump on even parity: JPE address (label)

Jump on odd parity: JPO address (label)

HLT: HLT

No operation: NOP


