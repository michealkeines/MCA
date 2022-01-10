# Access Control

linux is designed from the ground up to allow multiple users

when you have multiple users, there should be some permission model

there should be a way to prevent or allow other users access to specific files

this is what access control is, restricting access to some resource.

An access control policy specifies access rights, which regulate whether requess made by principals should be premitted or denied.

user - a human
subject - a process executing on behalf of a user
object - a peice of data or resource


# Discretionary Access Control (DAC)

A discretionary access control policy is a means of assiging access rights based on rules specified by users. the underlying philosophy in DAC is that subjects can determine who has access to their objects.

DAC is a type of access control

the access is restricted based on the identity of the subject or/and the groups to which they belong to

the permissions can be transferred

In linux, DAC is implemented with the owner concept

every file has an owner and a group

the owner can decide the permissions for all other users within the system.

# Users

Users are fundamental to Linux

Normally there will be at least two users, the super user (root) and the normal user

Super user has total access to do anything within the Linux OS

Normal user can only manipulate his own files and some specific other things

When a user creates a file, by default they become the owner of the file

super can access anything, even if a normal user restricted some resource only to be read by that user.

![[Pasted image 20220109234000.png]]

sudo privileges is equal to root user, any normal user can be provided this privilege.



# Managing Users

useradd or adduser command can be used to add an new user

by default new users will have

a their own home directory
bash shell as default shell
will be able to login to their own accounts
a group will also be created on their username

deluser command can be used to deleted a user

by default, no files will be removed but we can use

--remove-home to just remove the user's home directory
--remove-all-files to remove all files owned by the user

# Groups

users  are grouped together into groups
this allows an owner to manage access to a group of users
by default, there will be many users and groups already created for managing your system
you can use the groups command to find all the groups a user is part of

# Managing Groups

we can create new groupd using the 'addgroup' command
by default a new group won't have any users within it
we can use the adduser command to add users to an already existing group
we use used delgroup to delete the whole group
we can use the deluser command to remove a user from a group

![[Pasted image 20220110003919.png]]

![[Pasted image 20220110004015.png]]




