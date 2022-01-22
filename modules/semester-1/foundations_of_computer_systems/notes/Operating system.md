An operating system is system software that manages all resources of a computer system

controls computer hardware including the core computer and peripheral devices, software resources

provides common services for computer programs

Acts as an intermediary between user and the computer hardware

OS is a resource allocator

Manages all resources
Decides between conflicting requests for efficient and fair resource use.

OS is a control program

controls execution of programs to prevent eros and improper use of the computer.

# Basic concepts

Kernel
system calls
interrupts
shell

# kernel

The kernel is the core component of an operating system 

it is the part of the operating sytem that loads first, and it remains in main memory

it is responsible for providing secure access to the system's resources

it acts as an interface between the user applications and the hardware

when a process makes requests of the kernel, the request is called system call

![[Pasted image 20220117002048.png]]


# System Calls

A system call is the means by which a computer program requests a service from the kernel of the operating system on which it is executed.

this may include hardware related services, creation and execution of new processes and communication with integral kernel services such as process scheduling

system calls provide an essential interface between as process and the operating system.

# Interrupts

An interrupt is a reponse by the processor to an event that needs attention from the software

An interrupt condition alerts the processor and serves as a requst for the processor to interrupt the currently executing code when premitted, so that the event can be processed in a timely manner.

if the request is accepted, the processor responds by suspending its current activities, saving its state and executing a function called interrupt handler (or an interrupt service routine ISR) to deal with the event


# Shell

A shell is a user interface for access to an operating system's services

in general, operating system shell use either a commandline interface CLI or graphical user interface GUI, depending on a computer's role and particular operation.

Types of shells

a GUI graphical user interface most famously seen in windows family operating systems

command line interface - usually associated with the unix family

command line shells require the user to be familar with commands and their calling syntax and to understand concepts about the shell specific scripting language


# Classification of OS

classification based on the concept of process

Process

A program in execution is calle a process.
when a process is on, it will continuously need various types of resources
it will need CPU, I/) devices, main memory and various type of software resources.


single tasking vs multi tasking

a single taking system can only run one process at a time, while a multi-taksing operating system allows more than one process to be runningin concurrency

this is achieved by time sharing, where the available process time is divided between multipile processes

Other resouces too would need to be share in multi tasking environment

single user vs multi user

single user operating systems have no facilities to distinguish users, but may allow multiple processes to run in tandem

a multi-user operating system extends the basic concept of multitaking with facilities that identiy processes and resources

the system premits multiple users to interact with the system at the same time.

distributed operating systems

a distributed system is a collection of physically separate, possibly hetrogeneous, computer systems that are networked to provide users with access to the various resources that the system maintains

appear to be a single computer, as all computations are distributed - divided amongst the constituent computers

Embedded operating systems

embedded systems are computers which control some larger machinery

embedded operating systems are designed to be used in embedded computer systems

they are designed to operate on small machines with less autonomy

they are very compact and extremely efficient by design, and are able to operate with a limited amout of resources.

realtime operating systems

real time computers operate with stringent real-tiime requirements
as real-time operating system is an operating  system taht guarantees to process events or data by a specific moment in time

it can either be single or muli tasking

specialized scheduling algorithsm for multi tasking

OS operations

interrupt driven
hardware interrupt, software interrupt (exeception, trap)

software error (divide by zero)
request for operating system service
other process problems

eg: infinite loop, processes modifying each other or the operating system

# Dual mode
dual mode allows OS to protect itself and other system components

user mode and kernel mode

mode bit provided by hardware
provides ability to distinguish when system is running user code or kenel code
some instructions designated as privileged only executable in kernel mode
system call changes mode to kernel, return from call resets it to user.

## transition form user mode to kernel

Timer to prevent infinite loop/ process hogging resources
when coutner zero generate an interrupt

![[Pasted image 20220117065751.png]]

