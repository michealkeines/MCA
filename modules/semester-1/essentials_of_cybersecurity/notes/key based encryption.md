Encryption and decryption algorithms depend on keys

both parties share a key for both encryption and decryption

this means the key should be securely communicate prior to intiating the the actual communction

![[Pasted image 20220117232058.png]]

![[Pasted image 20220117232218.png]]

# symmetric key

![[Pasted image 20220117232256.png]]

As long as the key remain a secret, it upholds the confidentiality requirement even in the presense of an insecure channel

problems

![[Pasted image 20220117234540.png]]

if eve decided to modify the cipher text, bob would have no way to know

ideally there must be a way to figure out and reject modified cipher texts

thus maintaining data integrity

bob cannot determine the message came from alice or eve, thus lacking authentication

# message/data origin authentication

it requires that 
the message should remain unmodified in transit: data integrity
the receiver can verify the source of the message: authentication

