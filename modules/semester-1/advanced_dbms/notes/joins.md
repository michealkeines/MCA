Types

![[Pasted image 20220213100946.png]]

# cross join

![[Pasted image 20220213101021.png]]

![[Pasted image 20220213101049.png]]


# inner join

![[Pasted image 20220213101214.png]]

![[Pasted image 20220213101328.png]]

![[Pasted image 20220213115109.png]]

inner join is just cross join with a where condition

# equi join

![[Pasted image 20220217233343.png]]


equi is just cross join with where condition with equality check

# self join

![[Pasted image 20220217233811.png]]

here is the manager id is the employee id of the manager of that particular employee


its like, emoylee table has employee id of every person in the company along that includes the managers, they also have empoyee id

so for every employee the manager id is referering to that same table for get manager's employee id

# Outer join

![[Pasted image 20220217234613.png]]

## Left outer join

![[Pasted image 20220217234701.png]]

![[Pasted image 20220217234829.png]]

its same as inner join with a condtion that i also incudes the entries that didnt match in the first table

emplouee whose cities didnt match with customer will also be included in the result

## right outer join

![[Pasted image 20220217235732.png]]

its same as outer join with a condition that it also includes the entries that didnt match in the second table

customers whose cities didnt match with employees will also be included in the result

## Full outer join

![[Pasted image 20220218000027.png]]

![[Pasted image 20220217235948.png]]

includes both first and second table values that didnt match


