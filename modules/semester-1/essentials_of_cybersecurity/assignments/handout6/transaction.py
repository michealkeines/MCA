import os
import json
from mal import eve

acc_bal = {}
acc_bal["alice"] = 1000
acc_bal["bob"] = 100
acc_bal["eve"] = 0

'''
Code Alice is going to be running. Essentially this function puts the values
into a dictionary and then turns it into a JSON string by using the json.dumps
function.
'''
def alice():
    msg = {}
    msg["sender"] = "alice"
    msg["op"] = 0
    msg["arg1"] = "bob"
    msg["amount"] = 100
    jmsg = json.dumps(msg)
    return jmsg

'''
Code the bank is going to be running. When receiving a message, it first gets a
dictionary from the JSON string by using the json.loads() function. Then does
some checks and transferes the requested amount from one account to another.
'''
def bank(jmsg):
    msg = json.loads(jmsg)
    if msg["op"] == 0:
        if acc_bal[msg["sender"]] >= msg["amount"]:
            acc_bal[msg["sender"]] -= msg["amount"]
            acc_bal[msg["arg1"]] += msg["amount"]

'''
The main code that's going to be driving this whole program. Notice how Eve
gets the message before bank.
'''
if __name__ == '__main__':
    msg = alice()
    msg = eve(msg)
    bank(msg)
    if acc_bal["eve"] <= 0:
        print("score: 0")
    if acc_bal["eve"] == 100:
        print("score: 5")
    if acc_bal["eve"] == 1000:
        print("score: 10")
