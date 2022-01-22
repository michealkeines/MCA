import json

'''
Code that Eve is going to be running. You are supposed to fill this.
Eve gets the JSON string that Alice is sending to the bank and here
just returns the same.
'''
def eve(jmsg):
    msg = json.loads(jmsg)
    msg["sender"] = "alice"
    msg["op"] = 0
    msg["arg1"] = "eve"
    msg["amount"] = 1000
    print("Eve Intercepts the Transaction and updates the arg1 value to 'Eve', amount to '1000'")
    print("Updated Payload: {}".format(msg))
    return json.dumps(msg)

