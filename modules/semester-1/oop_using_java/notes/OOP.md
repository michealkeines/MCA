class and objects are two main aspects of oop

class is the template for creating objects

object have data and code

oop binds together data and functions that operate on them

objects have unique attributes and behaviors

![[Pasted image 20211227231821.png]]

goals of OOPs

to reuse the code,

to hold the entire data of any entity into a single object

interfacing allows to hide the internal implementation

Encapsulation:

the mechanism that binds together code the data it manipulates and keeps both safe from outside interference and misuse

encapsulation is acheieved by private and public member s othe class.

Abstraction:

objects provide an abstraction that hides the internal implementatin details

only need to know whihc methods of the object are available to call and whihc input parameters are needed to trigger a specific operation.

that way we dont need to understand how a certain method is implemented internally and which kind of operation it performs to retur nthe desired outcome.

abstraction is achieved using public methods that internal call another function that ahs the actuall implemetation, thus act as as proxy

Class:

a class defines the structure and behaviour that will be shared by a set of objects

every object of a class has charactersitics

behavior - functions that can be called eg: start in car object
state - current state of the eg: name in a car objct
identity - every state can be uniquly identified eg: defining custom car objects

Polymorphism

ability to appear in many forms

Eg: if we are implementing a stack, the push method might ahve to push different data types, thus we dont have implemtnt push for every data_type, we can use same name with different input data tuype paramters, using method overloading

types:

static-dispatch/ complie time
dynamic-dispatch/ run time

if the compilier resolves the polymorphism during the comilation of the program, it is static binding
eg: method overloading

if it is resolved during runtime, then it is dynamic dispatch
eg: method overriding, that is when a subclass or child class has the same method as declared in the parent class.

Inheritence:

process of attaining the propertied of another object

it enables reuage of code, using common functions

parent/ base class - top class in the level
child/ derived class - class the inherites a parent class

![[Pasted image 20211228001943.png]]

![[Pasted image 20211228001956.png]]

Multiple inheritence is not supported in java

in a multiple inheritence a child class can inherit serveral parent classes.




