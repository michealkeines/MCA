we have control access to terminal and to privilege exec mode

![[Pasted image 20220202232218.png]]

password command to set password for cli access

secret to set passworrd for privelege exec mode

![[Pasted image 20220202232326.png]]

we can see all configs using

show running-config

![[Pasted image 20220202232456.png]]

![[Pasted image 20220202232517.png]]

to set password for remote logins

![[Pasted image 20220202232659.png]]

![[Pasted image 20220202232722.png]]

to add encrpytion to the password in config

service password-encrpytion

![[Pasted image 20220202232829.png]]

add a banner message in the beginning

![[Pasted image 20220202233041.png]]

![[Pasted image 20220202233101.png]]

to save all the configs we just made from ram memory to nvram

![[Pasted image 20220202233833.png]]

this way changes will be stored in non volatile memory

nvram holds the startup config file where we will copy our unsaved changes that is the running-config

![[Pasted image 20220202234006.png]]

to reload the switch with new changes

we cna use reload command, it will restart the switch

to earse the config


![[Pasted image 20220202234155.png]]

we can revert to start config, by copying startconfig to running config

![[Pasted image 20220202234350.png]]

