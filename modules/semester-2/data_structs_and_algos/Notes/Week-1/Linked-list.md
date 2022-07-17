# Linked list

![[Pasted image 20220717091649.png]]

Head , Node

![[Pasted image 20220717091726.png]]

Properties

![[Pasted image 20220717091931.png]]

Operations

![[Pasted image 20220717092018.png]]

Applications

![[Pasted image 20220717092055.png]]

Example 

![[Pasted image 20220717092539.png]]

## Loop Detection

Floyd's Cycle-Finding Alogorithm

![[Pasted image 20220717093831.png]]

logic

![[Pasted image 20220717094729.png]]

![[Pasted image 20220717095207.png]]


Limitations of algo

https://stackoverflow.com/questions/44685102/why-does-floyds-cycle-finding-algorithm-fail-for-certain-pointer-increment-spee

The algorithm is only guaranteed to find a cycle at any position if the difference between the pointer increments and the cycle length are coprimes (i.e. their greatest common divisor must be 1).

For the general case, this means the difference between the increments must be 1 (because that's the only positive integer that's coprime to all other positive integers).

For `(1,3)`, the difference is `3-1=2`, and the cycle length is `2`, `2` and `2` are not coprimes, thus the algorithm is not guaranteed to find the cycle.

[](https://stackoverflow.com/posts/44686036/timeline)

The algorithm is only guaranteed to find a cycle at any position if the difference between the pointer increments and the cycle length are coprimes (i.e. their greatest common divisor must be 1).

For the general case, this means the difference between the increments must be 1 (because that's the only positive integer that's coprime to all other positive integers).

For `(1,3)`, the difference is `3-1=2`, and the cycle length is `2`, `2` and `2` are not coprimes, thus the algorithm is not guaranteed to find the cycle.

---

The key to understanding this is that, at least for the purposes of checking whether the pointers ever meet, the slow and fast pointers' positions within the cycle only matters relative to each other. That is, these two can be considered equivalent: (the difference is 1 for both)

```
slow fast             slow fast
   ↓ ↓                   ↓ ↓
 0→1→2→3→4→5→0     0→1→2→3→4→5→0
```

So we can think of this in terms of the position of `slow` remaining constant and `fast` moving at an increment of `fastIncrement-slowIncrement`, at which point the problem becomes:

> Starting at any position, can we reach a specific position moving at some speed (mod cycle length)?

Or, more generally:

> Can we reach every position moving at some speed (mod cycle length)?

Which will only be true if the speed and cycle length are coprimes.

For example, look at a speed of 4 and a cycle of length 6 - starting at 0, we visit:  
`0, 4, 8%6=2, 6%6=0, 4, 2, 0, ...` - GCD(4,6) = 2, and we can only visit every second element.  
To see this in action, consider increments of (1,5) (difference = 4) for the example given above and see that the pointers will never meet.

---

I should note that, to my knowledge at least, the (1,2) increment is considered a fundamental part of the algorithm.

Using different increments (as per the above constraints) might work, but it would be a move away from the "official" algorithm and would involve more work (since a pointer to a linked-list must be incremented iteratively, you can't increment it by more than 1 in a single step) without any clear advantage for the general case.
