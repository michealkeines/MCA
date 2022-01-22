Objective
---------

Alice is trying to transfer some amount of money to Bob. The message that Alice
is sending to the Bank is however accessible by a 3rd party Eve. You are going
to be playing the role of Eve and your objective is to transfer as much money
as you can to your own bank account.

Program Structure
-----------------

transaction.py is the main program and you can run the same using python3.

> python3 transaction.py

The output will be your score for the exercise. 

mal.py contains the code that Eve is going to be running. Like mentioned,
Eve is going to be accessing the messages that Alice is going to send to the
bank. You have to fill out the code so that the maximum amount can be 
transferred to Eve's account.

JSON is used as the data format and serialization and deserialization of the
same can be done using json.loads() and json.dumps() respectively.
