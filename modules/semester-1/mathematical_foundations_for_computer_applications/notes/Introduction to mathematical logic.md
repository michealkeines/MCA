a statement in mathematical term requires a true or false value

compound statement is a combination of different statements using connectors and quantifiers

Mathemetical logic is a tool for workgin with elaborate compound statements

it includes

- a formal language for expressing statements
- a concise notation for writing statements
- we will be able to show in detuctive logical steps whether the compound statement is true or false
- this allows us to form mathematical proofs

There are two ways of expressing mathematical logic

propositional logic

a statement or a proposition is a collection of declarative statements that has either a truth value "true" or a truth value "false", but not both or inbetween

however, you might not know the actual truth value, and the truth value might depend on the situation or context

we use lowercase to denote proposition

p: 2 is an even number - true
q: 2 is an odd number - false

not a propostion

r: 1+2 - its an expression not a proposition
s: my cat is beautifull - its a opinion not a proposition
t: who is this? - its an question not a proposition

a proposition consist of propositional variables and connectives.

propositional logic is used in desigin digital electronic circuits

negation of proposition:
the truth of value of the negation of p, is the opposite of the truth value of p

propositon: p
negation: -p (read as not p)

proposition: micheal's pc runs linux
negation: it is not the case that michealls pc runs linux or micheal's pc doesnt run  linux

negation is just he oppoositon of proposition

operator / connectives

an operator or connective combines one or more operand experssions into a larger expression

binary operators takes 2 operands eg 2 + 3
unary operator takes 1 operand eg -3

proposition operators or boolean opeartors operatoe on proposions instead of on numbers

![[Pasted image 20211227082902.png]]

OR (∨)

AND (∧)

Negation/ NOT (¬)

Implication / if-then (→)

If and only if (⇔)

Negation operator:
it transforms a proposition into its logical negation

p = ihave blakc hair
not p is = i dont have a black hair

Conjection operator:
combiles two logical propositions to form their logical conjunction

if p = i had rice for lunch and q = i had noodles for dinner

p ^ q = i had rice for lunch, and i had noodles for dinner

only if i had both rice for lucnh and noodle for dinner this compound statement is true


if ther is two variable the 2^n possible ways 2^2 is 4 thus, there is four possible ways

Disjunction:

combines two propositions to form their logical disjunction

p = my car has a bad engine
q = my car has a bad carburetor

p v q = my car has a bad engine or my car has a bad carburetor

for this statement to be true, it could be that my car has a bad egine or that it has a bad carburetor or it could be both

in english when is say i want an apple or an orange, i do not mean that i want both of them

in mathematic logic 'or' can be that both propositions are true

this is also called as inclusive-or as it allows the possibilty that both statements are true

p is true or q is true or both are true

Excluive or:

p = i will earn a A in this course
q = i will drop this course

i wil either earn an A in this course or i wil drop it,

both can not happen

it excules the possibilty that both p and q are true, thuus it is exlusive or

implication operator:

p -> q, if p, then q

p = you study hard
q = you will get a good hard

p->q, if you study hard, then you will get good grade

if p is not true, q could be true or false, as you can get good grades, evne if you dont study hard

p->q is not a causatation

it not the course of the other

because the reflection of q is not determined by p, only the implication is affected

thus p -> q is false only when p is true and q is not ture

if both propositions are false, then its is true

1=8 -> apple is blue in color, both are false leading to a true implication

the proposition q -> q is called converse of p -> q

the contrapositive of p -> q is the propositon -q -> -p

the proposition -p -> -q is called inversion of p -> q

Bicondition operators:

p<->q, p if only if q

p = you van take a flight
q= you buy a ticket

you can take a flight if and only if you buy a ticket

its true if both or true or false



An important step used in a mathematical argument is the replacement of astatement with another statement with the same truth value

because of this, methods that produce propositions with the same truth value as a given compound porposition are used extensivly in the construction of mathematical arguments

Order of precedence for logical operators

![[Pasted image 20211228050834.png]]

for example the precedence for this p ^ q v r is (p ^ q) v r

as ^ has higher precedence than V

a statement/proposition variable standing alone is a well formed formula

if A is a well-formed formula, then -A is also a well formed formula

a string of symbold containing the statement variables connectives and parentheses is a well formed formula, if it can be obtained by finietly many applications of the precedence rules

a tautology is a compound proposition thatt is true no matter what the truth value of its atomic proposition are

p V -p

![[Pasted image 20211228051500.png]]

A contradiction is a compound proposition that is false no matter what

p ^ -p

![[Pasted image 20211228051535.png]]

other compound propositions are called contingencies

Logical equivalence:

compound proposition p is logicaly equivalent to compound propoition q, written p<->q, iff the compound porposition p<->q is a tautology

compound proposition p and q are logically equivalent to each other IFF p and q contain the same truth values as each other in all rows of their truth tables
