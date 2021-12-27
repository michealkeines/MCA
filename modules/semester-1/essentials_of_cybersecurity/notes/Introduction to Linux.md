GNU project is aimed to create usable operating system that's only comprised of free software.

Linux is just a lot of files, this was introduced in unix

file abstraction

- almost everything is represented as a file
- files that represent hardware devices, system information, network connections etc

the basic principle behind this is to represent I/O resources as a stream of bytes exposed through the filesystem namespace.

in linux interprocesscommunication is also do using files

this way, a single system call or API can used to interact with variety of resources

Example,

when a file is opened within a process, the kernel returns a file descriptor

when a network connectionsi established a file descriptor is returned to the process

same system call can be used to write to both file descriptors even though in essence they are entirely different resources.

/dev - contains special files that represents hardware devices
/proc - files related to processes

to get random cryto secure value we can call /dev/random or /dev/urandom

the difference between random and urandom is that seed it uses to create the random value, it is recommended to use urandom in crypto secure areas.

ls - list files in the directory
cat - conncatination or outputing the file data
clear - clear screen
ps - list all current running process

/dev/null - anything written to this file will be discarded, it will used to redirect errors in rpocess from showing up in the output and directly passed to /dev/null

```bash
0 means stdin 
1 means stdout(useful output)
2 means stderr(error message output)
```

./testprogram 2>/dev/null

/proc/cpuinfo, /proc/meminfo

are used to get cpu information and current memeory usage information

every pid will contain a symlink for all the files that are opened currently by the process under fd folder

/proc/pid/fd


	