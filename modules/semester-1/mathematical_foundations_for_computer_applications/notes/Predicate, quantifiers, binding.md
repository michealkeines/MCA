Propositional logic cannot adequately express the meaning of all statements in mathematics and in natural language

eg: Every computer connected to the univerisyt netwoek is functioning properly

no rules of propositional logic allows us to conclude the truth of the statement -computer3 is functioning properly. where, computer3 is one of the computers connected to the university network.

thus with predicate logic we can find a truth value for this statement.

# Predicate

statements involve variables such as x>3, x=y+3 are often found in mathematical assertions in computer programmes and in system specifications.

These statements are neithre true nor false when the values of the variables are not specified

the statement "x is greater than 3" has two parts

the first part, the variable x, is the subject of the statement

the second part, the predicate "is greater then 3" - refers to a property that the subject can have

we can denote the statment "x is greater than 3" by P(x), where P denotes the predicate "is greater than 3" and x is the variable.

the statement P(x) is also said to be value of the propositional function P at x

Once a value has been assigned to the variable x, the statement P(x) becomes a proposition and has a truth value.

example:

![[Pasted image 20220110231433.png]]

Predicate logic can also be generalized with grammatical notion of a predicate to also include propositional functions of any number of arguments, each of which may take any grammatical role that a noun can take

![[Pasted image 20220110231615.png]]


# Quantifies

when the variable in a propositional function are assigned values the resulting statement becomes a proposition with a certain truth value.

there is another way called quantification, to create a proposition from a propositional function.

Quantification expresses the extent to which a predicate is true over  a range of elements

in english, the words all, some, many, none, and few are used in quantifications

the area of logic that deals with predicate and quantifiers is called the predicate calculus.


## Universal quantificiation, 

which tells us that a predicate is true for every element under consideration

![[Pasted image 20220110232351.png]]

![[Pasted image 20220110232445.png]]


## existential quantificiation, 

which tells us that there is one or more element under consideration for which the predicate is true.


![[Pasted image 20220110232559.png]]

![[Pasted image 20220110232730.png]]

![[Pasted image 20220110233053.png]]


## Differenece

universal is that for every x the P of X is true
existential is there is atleast one x where the P of X is true


# Binding

when a quantifier is used on the variable x, we say that this occurrence of the variable is bound.

an occurrence of a variable that is not bound by a quantifier or set equal to a particular value is said to be free.

all the variables that occur in a porpositional function must be bound or set equal to particular value to turn it into a proposition.

this can be done using a combination of universal quantifiers, exsistential quantifiers and value assignments.

The part of the logical expression to which a quantifier is applied is called the scope of this quantifier

Consequently, a variable is free if is outside the scope of all quantifiers in the formula that specify this variable.


![[Pasted image 20220110233817.png]]

## Nested quantifiers


![[Pasted image 20220110234956.png]]

this is read as

for all X, there exist an X such that (x + y = 0)



![[Pasted image 20220110235142.png]]

![[Pasted image 20220110235320.png]]

![[Pasted image 20220110235447.png]]

![[Pasted image 20220110235616.png]]

## the order of qunatifies

many statments involve multiple quantifiers of propositional functions involving more than one variable

it is important to note that the order of the quantifiers is important, unless all the qunatifiers are universal quantifiers, or all are exsitential quantifiers


![[Pasted image 20220111000048.png]]

![[Pasted image 20220111000521.png]]

there is no unique y for all x, this is false

for all real numbers x there is y that way x+7 = 0, that is , if x =2, y =-2 will give 0

but

there exist a y for all real numbers x is like one real number can y = example -2 added with any realnumber x, x= 5 should give x+y = 0, that is not true.

this illustrated why order inwhich quantifiers is used makes a huge difference.

![[Pasted image 20220111001052.png]]


![[Pasted image 20220111001444.png]]

![[Pasted image 20220111001548.png]]

![[Pasted image 20220111001614.png]]

# Negating Quantified Expressions

![[Pasted image 20220111002139.png]]

![[Pasted image 20220111002222.png]]

![[Pasted image 20220111002316.png]]

![[Pasted image 20220111002409.png]]

it is not the case that there exist a student who jhas taken the class is logically  equivalent to

for all students it is not the case taht a student has tatken the class

## Rules of negation

The rules of negation for quantifiers are caled de morgan's law for quantifiers

![[Pasted image 20220111002654.png]]

![[Pasted image 20220111002825.png]]

![[Pasted image 20220111002837.png]]

There exist a politiction x who is honest

![[Pasted image 20220111002920.png]]

it is not the case that there exist a politician x who is honest

![[Pasted image 20220111002950.png]]

for all polliticians it is not the case the x is honest

![[Pasted image 20220111003117.png]]

