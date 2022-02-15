
![[Pasted image 20220214224542.png]]

# DH Variant

![[Pasted image 20220214224646.png]]

![[Pasted image 20220214224739.png]]

![[Pasted image 20220214224806.png]]


Client hello: The client sends a client hello message with the protocol version, the client random, and a list of cipher suites.

Server hello: The server replies with its SSL certificate, its selected cipher suite, and the server random. In contrast to the RSA handshake described above, in this message the server also includes the following (step 3):

Server's digital signature: The server uses its private key to encrypt the client random, the server random, and its DH parameter*. This encrypted data functions as the server's digital signature, establishing that the server has the private key that matches with the public key from the SSL certificate.

Digital signature confirmed: The client decrypts the server's digital signature with the public key, verifying that the server controls the private key and is who it says it is. 

Client DH parameter: The client sends its DH parameter to the server.

Client and server calculate the premaster secret: Instead of the client generating the premaster secret and sending it to the server, as in an RSA handshake, the client and server use the DH parameters they exchanged to calculate a matching premaster secret separately.

Session keys created: Now, the client and server calculate session keys from the premaster secret, client random, and server random, just like in an RSA handshake.

Client is ready: Same as an RSA handshake.

Server is ready

Secure symmetric encryption achieved

*DH parameter: DH stands for Diffie-Hellman. The Diffie-Hellman algorithm uses exponential calculations to arrive at the same premaster secret. The server and client each provide a parameter for the calculation, and when combined they result in a different calculation on each side, with results that are equal.

