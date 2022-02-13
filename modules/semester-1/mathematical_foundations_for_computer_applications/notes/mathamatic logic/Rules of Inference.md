Proofs in mathematics are valid arguments that establish the truth of mathematical statements

by an argument, we mean a sequence of statements that end with a conclusion

By valid, we mean that the conclusion, or final statement of the argument must follow from the truth of the preceding statements, or premises, of the argument.

we will look at arguments that involve only compound propositions

we will define what it means for an argument involving compound propositions to valid

then we will introduce a collection of rules of inference in propositional logic

![[Pasted image 20220104043537.png]]

![[Pasted image 20220104043647.png]]

Then the argument has the form p -> q


## Arguments

an argument in propositional logic is a sequence of propositions

all but the final proposition in the argument are called permises and the final propositin is called the conclusion.

an argument is valid if the truth of all its premises implies that the conclusion is true.

an argument from in propositional logic is a sequence of compound propositions involving propositional variables

an argument form is valid no matter what propositions are substituted for the propositional variables in its permises, the conclusion is true if the premises are all trrue.

![[Pasted image 20220104045553.png]]

![[Pasted image 20220104051522.png]]

Fortuntely, we do not have to resort to truth tables

instead, we can first establish a validity of some relatively simple argument forms, called rules of inference.

these rules can be used as building blocks to construct more complicated valid arguments forms

![[Pasted image 20220104054359.png]]


![[Pasted image 20220104055114.png]]


![[Pasted image 20220104055230.png]]

![[Pasted image 20220104055249.png]]

![[Pasted image 20220104055312.png]]

![[Pasted image 20220104055332.png]]

![[Pasted image 20220104055405.png]]

This argument uses the addition rule

![[Pasted image 20220104061554.png]]

# Problems

![[Pasted image 20220104062124.png]]

![[Pasted image 20220104062333.png]]

![[Pasted image 20220104062527.png]]

![[Pasted image 20220104062654.png]]

![[Pasted image 20220104062724.png]]

![[Pasted image 20220104062851.png]]

![[Pasted image 20220104062925.png]]

![[Pasted image 20220104062945.png]]

![[Pasted image 20220104063625.png]]

![[Pasted image 20220104063658.png]]

![[Pasted image 20220104064115.png]]

-p ^ q, we use simplfication rule (p ^ q) -> p, so (-p ^ q)  -> -p

-p

r -> p, -p ^ (r->p), we use modus tollens -q ^ (p->q) -> -p, so -p ^ (r->p) gives -r

-r

-r->s, -r ^ (-r->s), we use modus pones, p ^ (p->q) -> q, so -r ^ (-r -> s) gives s

s

s -> t, s ^ (s->t), we use modus pones, p ^ (p->q) -> q, so s ^(s->t) gives t

we take all premise and keep conjunting

![[Pasted image 20220104065736.png]]

![[Pasted image 20220104065831.png]]

hypothetical syllogism

( (p -> q) ^ (q -> r) ) -> (p -> r)

![[Pasted image 20220104065952.png]]

![[Pasted image 20220104070009.png]]






