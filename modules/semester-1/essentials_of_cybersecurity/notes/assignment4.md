we have 999 files

we have to find the flag, hint is the flag is readonly

we can use find to search for it using permissions

Octal    Binary 
0        0 0 0 (No Read,  No Write,  No Execute) -- No permission
1        0 0 1 (No Read,  No Write,  Yes you can execute)
2        0 1 0 (No Read,  Can Write, No execute)
3        0 1 1 (No Read,  Can Write, Can execute)
4        1 0 0 (Can Read, No Write,  No Execute)
5        1 0 1 (Can Read, No Write,  Can execute)
6        1 1 0 (Can Read, Can Write, No execute)
7        1 1 1 (Can Read, Can Write, Can execute)

this i how we can represent the file permission

so we are looking for a file with ony read thus 4

X means permission given to the owner of the file.
Y means permission given to the group of the owner.
Z means permission given to all other users in system , outside of user's group.

we only want the owner of the file to be readonly

400

![[Pasted image 20220103040946.png]]

find . -name 'flag*' -type f -perm 400