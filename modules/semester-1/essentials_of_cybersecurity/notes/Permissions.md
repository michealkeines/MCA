![[Pasted image 20220110002812.png]]

Read Permission

only users with this permisision to a particular object will be able to read that object

for example, only if we have the read permission to a file, we can use cat command to list the contents of the file

if not we will get permission denied error.

if we dont want any one to read a particular file we use 

![[Pasted image 20220110003258.png]]

here the owner has read,write
group has read
others has read

we can spcific the permission as

chmod u=rw, g=r, o= filename

![[Pasted image 20220110003814.png]]


Write permission

only users with this permission to a particular object will be able to modigy the contents of the file

it is required to 

write to a file
delete the contents of the file(just the contents, not th file)
append to a file

![[Pasted image 20220110004508.png]]

thus, if we dont want anyone to modify our files, we can just remove the write permission of the file.

Execute permission

only users with this permission will be able to execute the file.

like for example if the file is ELF statically compiled bin file, we dont need read permisision, execute permission is enough to execute the file.

the program required reading like a python file, that will be intrepeted in runtime by reading the file, then we need both read and execute permission

![[Pasted image 20220110005300.png]]

![[Pasted image 20220110005618.png]]

![[Pasted image 20220110005657.png]]

we can just remove the execute permission if we dont want others to execute the program.

we can use chmod to change the premssion of the particular file

chmod code filename

chmod u=rx,g=r,o=r filename

there are code we can use to specfy the permission

![[Pasted image 20220110011405.png]]

we have add all the permssio for user,froup,other

![[Pasted image 20220110011543.png]]

no permission to users, group or others

![[Pasted image 20220110011609.png]]

read for both user, group and none for other

read = 4, thus 440

![[Pasted image 20220110011712.png]]

read = 4
write = 2
read,write = 6, thus 640

or we can use 

u=
g=
o=
users, groups, others
rwx are the options that you can assign to those.

we can use chown to change the owner of the file

chown user:group filename

user and group are the name you wnat to change

![[Pasted image 20220110010354.png]]

initially testfile has micheal user and micheal group

we change that ott

chown tempuser:tempuser tesfile

we have changed the user to tempuser and group to tempuser


# Special permission

this is called the Set UID, this allows additional permisison 

User + s

commonly notes as SUID

a file with SUID always executes as the user who owns the file, regardless of the user passing the command

![[Pasted image 20220110014248.png]]


![[Pasted image 20220110012003.png]]

![[Pasted image 20220110023036.png]]

Group + x

if set on a file, it allows the file to be executed as the group that owns the file


other + t (sticky)

this permission does not affect individual files, however at directory level, it restricts file deletion, only the owner of a file can remove thefile with that dirctory.

if a user has read, write, execute permission for /dir, he can delete any files within that folder, even other user files

to prevent this from happening ,we add t sticty bit to a folder, thus only the owner of  the file can delete, even if the user has rwx in the directory

![[Pasted image 20220110032502.png]]

even tho the tempuser dont own the file3, as the directory is rwx for everyone, tempuser is able to delete that file

to prevent his from happening, we add the sticky bit

![[Pasted image 20220110032705.png]]







