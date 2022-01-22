Essentilaly the security of the system should not hinge on the secrecy of the cipher text itself

reasoning being kerckhoff principle

keeping small keys secure is much easier than keeping the whole system secure

the fewer secrets required, the easier it is to main the system

the security os the cryptographic system should only depend on the secrecy of the keys

Reasons to use public algorithms

it ensures that there wont be obvious or trivial overisights in the algorithms themselves

thus, neverr use new or unrpoven cryptographic algorithms

A cryptographic algorithm can be considered broken in many ways. For an encryption algorithm, you can imagine several ways to attack the algorithm: the secret key can be obtained somehow, messages can be decrypted without the help of the key, some information about the message can be revealed just by looking at the encrypted message, and so on. Anything that would somehow weaken the assumptions we made about the algorithm could be considered a break.

