# Concurreny control


![[Pasted image 20220226050148.png]]

# Concurreny Problems

![[Pasted image 20220226050300.png]]

# Dirty Read
![[Pasted image 20220226050536.png]]

![[Pasted image 20220226050547.png]]


# Unrepeatable read problem

![[Pasted image 20220226050722.png]]

# Phantom Read Problem

![[Pasted image 20220226050753.png]]

# Lost Update Problem

![[Pasted image 20220226050914.png]]

# Incorrect Summary

![[Pasted image 20220226051229.png]]

# Concurreny Control Protocols

![[Pasted image 20220226051353.png]]

# Lock-Based Protocols

exclusive, shared
![[Pasted image 20220226051656.png]]

![[Pasted image 20220226051646.png]]

![[Pasted image 20220226051853.png]]

# Lock Compatibility Matrix

![[Pasted image 20220226051820.png]]


![[Pasted image 20220226051921.png]]

Pitfalls

![[Pasted image 20220226052109.png]]

![[Pasted image 20220226052120.png]]

Starvation

![[Pasted image 20220226052228.png]]

# Two-Phase Locking Protocol

Growing phase

Shrinking phase

![[Pasted image 20220226052432.png]]

![[Pasted image 20220226052535.png]]

Locking and unlocking is done in two phases thus ensuring serializability

Lock point of a transaction is the point where it starts unlocking its variables


![[Pasted image 20220226052840.png]]

Drawbacks

deadlocks, cascading rollback

![[Pasted image 20220226052945.png]]

Variations

Strict two-phase locking

Rigorous two-phase locking

![[Pasted image 20220226053034.png]]

# implementation of locking

lock manager , lock table

![[Pasted image 20220226053120.png]]

Lock Table

![[Pasted image 20220226053250.png]]

# Timestamp based

![[Pasted image 20220226053706.png]]

W-timestamp , R-timestamp

![[Pasted image 20220226053750.png]]

![[Pasted image 20220226053858.png]]

![[Pasted image 20220226053912.png]]

![[Pasted image 20220226054024.png]]

![[Pasted image 20220226054117.png]]

 # Thomas' write rule

 ![[Pasted image 20220226054204.png]]

  