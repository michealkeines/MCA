Fetcdh the instruction from the memory
decode the instructions
execute the instruction

This three step process is called a machine cycle

Fetch-Decode-execute

Instruction Register (IR) : Holding the instruction that is being executed
Program Counter (PC): Hold the address of the next instruction to be executed

![[Pasted image 20220105082741.png]]

# Instruction Fetch

The content of the program counter has been taken
Corresponding memory cells content copied to the instruction register, it varies based on the arch, as every arch ahs differnt intruction size
update the porgram counter

![[Pasted image 20220105083953.png]]

program counter is updated with size of the insturction, in this case its two bytes, thus it will be incremented by two bytes

![[Pasted image 20220105084053.png]]

# Insturction Decode and execution

Decode the instruction in instruction register IR
Instruction decoder will then generate the signals to activate the circuitry to carry out the instruction

ef: if instruction register contain 156c (encode form)
CPU decodes it
156c is Load register 5 with the content of the memory cell 6c
perfor load execution step

this is a machine cyckle





