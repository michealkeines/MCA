digital data can be thought of existing in of the following

data at rest
data at motion
data in use

data at rest as a special case

ideally the data should be secure no matter its form of existence

# Data at rest

data that is stored in a persistent digital state like in
hard drive, ssd
mobile devices
backups
file hosting services

![[Pasted image 20220117104927.png]]

let say that alice stored her password in pendrive, and eve got access to the pendrive, thus eve will be able to access alice's password and use it, this should be prevents, that why we should encrypt all the dat athat are at rest, even eve gets access to pendrive she shouldnt be able to use the password


Special case: data in rest but get used in time

![[Pasted image 20220117110212.png]]

communication thorugh time.



# Data in motion

data flowing in and out through a network

can be either trusted or untrusted network

communication between two or more parties

![[Pasted image 20220117105402.png]]

no matter what, the communication channel should be encrypted.

# Data in use

data that's stored in non-persistent state
- RAM
- CPU cache
- Register

Data that's currently in used by application in memory

it done using memory encryption and enclaves (hardware encryption)



# Secure communication model
crptography exists to ensure secure commuication

![[Pasted image 20220117224134.png]]

eve shouldn't be able to read the message no matter what.

Confidentiality

only the send and the receiver should be able to understand the message

so, in our scenario, only alice and bob should be able to understand the message

this property is called condidentiality, protecting data from unauthorized viewers

secure channel

![[Pasted image 20220117224431.png]]

the solution is to use a channel that's only accessible to alice and bob

if even cant even access the message, there is nothing she can do

often we wont be confirm the nature of the underlying communication medium

thus we should be able to send and receive even if the communication channel is insecure

![[Pasted image 20220117224813.png]]

plain text message can be intercepted and read

encryption turns the message into unreadble gibberish

this unreadle gibberish is called ciphertext

decryption turns the ciphertext back into the message

![[Pasted image 20220117224958.png]]

cipher text can be intrecepted but cant be read without proper decryption 

![[Pasted image 20220117225119.png]]

the communication remains secure if and only if the decryption algorithm remains secret




