running programs:

every program is serached through a predefined paths, if its found there it will be executed

if not we have to enter the full path of the execcutable

to run a program in background

./exe &, & is used to say that it should be executed in background

while a program is already running we using bg to send it to background

![[Pasted image 20220102233538.png]]

unless we have already redirected the program output to file or somewhere, it will be output into the terminal out

but the background process wont be able to read input from terminal if its running in background

Signals:

a way to notify a process that an even has occurred

there are default mechanism for handling  signals, a process can also have custom implementations

we can use kill command to send specific signals to specific process using their process id

## Stop a process

- we can use ctr+z to stop a process
- it sends the SIGTSTP signal
- this signal could be ignored or overriden by the process
- SIGSTOP or ctrl + c can used to stop the process, this cannot be ignored or overriden.

## resuming a process

- we can use fg command to resume a process that is stopped alredy
- we can use bg command to send a foreground process to background


## killing a process

we can use signals
SIGINT
SIGTERM
SIGKILL

the key combination CTRL+c sends the SIGINT signal

the program kill bydefault sends SIGTERM signals

SIGKILL is a signal that can't be ignored or handled

The shell accoiates a job with each pipeline, it keeps a table of currently executing jobs, which may be listed with jobs command.

to facilitate the implementation of the use interface to job control, 

the os maintains the notion of a current terminal process group ID, Member of this proces group (processes whose process group ID is equal to the current teminal process group ID) receive key-board generated signals such as SGINIT. these process are said to be foreground

background processes are those whose process group ID differs from the terminal's; such process are immune to keyboards generated signals.

there are number of ways to refer to a job in a shell. the character '%' introduces a job specification (jobspec)


job number n may be specified to as %n

```
%%, %+ refers to current job
%-, previous job

``` 

![[Pasted image 20220103001024.png]]

important commans

jobs - to list all jobs
jobs -l : list with pid


Term - Default action is to terminate the process
Ign - Default action is to ignore the signal
Core - Default action is to terminated and dump core
Stop - Defautl action is to stop the process
Cont - Default action is to continue the process if it is currently stopped

Signal      Standard   Action   Comment

SIGCHLD      P1990      Ign     Child stopped or terminated
SIGKILL      P1990      Term    Kill signal
SIGTERM      P1990      Term    Termination signal
SIGTRAP      P2001      Core    Trace/breakpoint trap
SIGTTIN      P1990      Stop    Terminal input for background process
 SIGTTOU      P1990      Stop    Terminal output for background proces
 SIGINT       P1990      Term    Interrupt from keyboard
 
