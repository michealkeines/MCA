# Labsheet 0

```
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from pylab import randn

# 1. Write a program to create a data frame of countries using a dictionary that stores country names, capitals, and populations of the country

countries = {
    "Name" : ["India", "Chile", "Austria", "Japan"],
    "Capital" : ["Delhi", "Santiago", "Vienna", "Tokyo"],
    "Population" : [45, 12, 2, 4]
}

# 2. Create a dictionary, convert it into the corresponding data frame and display it

countries_data_frame = pd.DataFrame.from_dict(countries)

print(countries_data_frame)
print("\n\n")

      Name   Capital  Population
0    India     Delhi          45
1    Chile  Santiago          12
2  Austria    Vienna           2
3    Japan     Tokyo           4


# 3. Write a Pandas program to get the powers of an array values element-wise. First array elements raised to powers from second array

data_3 =  {'X':[68,75,86,70,76], 'Y':[74,84,79,73,76],'Z':[76,87,86,62,73]}

sample3_data_frame = pd.DataFrame.from_dict(data_3)
## updated version after live session

power_arr = sample3_data_frame.pow(sample3_data_frame)

print(sample3_data_frame)
print("\n\n")

                     X                    Y                    Z
0                    0                    0                    0
1  2435553365352800019                    0  1826852818786091687
2                    0  1483551237918615471                    0
3                    0 -3116162374727926391  4611686018427387904
4                    0                    0 -3116162374727926391


# 4. Write a Pandas program to get the first 3 rows of a given DataFrame

exam_data = {'name': ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'],
'score': [12.5, 9, 16.5, np.nan, 9, 20, 14.5, np.nan, 8, 19],
'attempts': [1, 3, 2, 3, 2, 3, 1, 1, 2, 1],
'qualify': ['yes', 'no', 'yes', 'no', 'no', 'yes', 'yes', 'no', 'no', 'yes']}
labels = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']

exam_df = pd.DataFrame.from_dict(exam_data)

exam_row = exam_df.loc[0:2].iloc[:,[2,0,3,1]]  # rearrage columns
exam_row.index=labels[:3] # update index label
print(exam_row)
print("\n\n")

   attempts name qualify  score
a         1    A     yes   12.5
b         3    B      no    9.0
c         2    C     yes   16.5

# 5. Write a Pandas program to count the number of rows and columns of a DataFrame

exam_data = {'name': ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'],
'score': [12.5, 9, 16.5, np.nan, 9, 20, 14.5, np.nan, 8, 19],
'attempts': [1, 3, 2, 3, 2, 3, 1, 1, 2, 1],
'qualify': ['yes', 'no', 'yes', 'no', 'no', 'yes', 'yes', 'no', 'no', 'yes']}
labels = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']

exam_df = pd.DataFrame.from_dict(exam_data)

print("Number of Rows: {}".format(len(exam_df.index)))
print("Number of Columns: {}".format(len(exam_df.columns)))
print("\n\n")

Number of Rows: 10
Number of Columns: 4

# 6. Write a Pandas program to select the rows where the score is missing, i.e. is NaN

exam_data = {'name': ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'],
'score': [12.5, 9, 16.5, np.nan, 9, 20, 14.5, np.nan, 8, 19],
'attempts': [1, 3, 2, 3, 2, 3, 1, 1, 2, 1],
'qualify': ['yes', 'no', 'yes', 'no', 'no', 'yes', 'yes', 'no', 'no', 'yes']}
labels = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']
exam_df = pd.DataFrame.from_dict(exam_data)
exam_df = exam_df.iloc[:, [2,0,3,1]]
exam_df.index = labels

print(exam_df[exam_df.isnull().any(axis=1)])
print("\n\n")

   attempts name qualify  score
d         3    D      no    NaN
h         1    H      no    NaN

# Write a NumPy program to test element-wise for complex number, real number of a given array. Also test whether a given number is a scalar type or not.

np_array = np.array([1+1j, 1+0j, 4.5, 3, 2, 2j])

print("Input Array: {}".format(np_array))

print("Complex number: {}".format(np.iscomplex(np_array)))
print("Real number: {}".format(np.isreal(np_array)))
print("Scalar number: {}".format(np.isscalar(np_array[2])))
print("\n\n")

Input Array: [1. +1.j 1. +0.j 4.5+0.j 3. +0.j 2. +0.j 0. +2.j]
Complex number: [ True False False False False  True]
Real number: [False  True  True  True  True False]
Scalar number: True

# Write a NumPy program to create an element-wise comparison (greater,greater_equal, less and less_equal) of two given arrays.

np_array1 = [3, 5, 6, 2, 8]
np_array2 = [3, 6, 5, 2, 8]

print("Input arrays\n{}\n{}".format(np_array1, np_array2))

print("Greater: {}".format(np.greater(np_array1, np_array2)))
print("Greater Equal: {}".format(np.greater_equal(np_array1, np_array2)))
print("Lesser: {}".format(np.less(np_array1, np_array2)))
print("Lesser Equal: {}".format(np.less_equal(np_array1, np_array2)))
print("\n\n")

Input arrays
[3, 5, 6, 2, 8]
[3, 6, 5, 2, 8]
Greater: [False False  True False False]
Greater Equal: [ True False  True  True  True]
Lesser: [False  True False False False]
Lesser Equal: [ True  True False  True  True]

print("Array of 10 zeros: {}".format(np.zeros(10)))
print("Array of 10 ones: {}".format(np.ones(10)))
print("Array of 10 fives: {}".format(np.ones(10) * 5))
print("\n\n")

Array of 10 zeros: [0. 0. 0. 0. 0. 0. 0. 0. 0. 0.]
Array of 10 ones: [1. 1. 1. 1. 1. 1. 1. 1. 1. 1.]
Array of 10 fives: [5. 5. 5. 5. 5. 5. 5. 5. 5. 5.]

# Write a NumPy program to check whether two arrays are equal (element wise) or not

np_array1 = np.array([3, 5, 6, 2, 8])
np_array2 = np.array([3, 6, 5, 2, 8])

print("NP array equality check: {}".format(np.equal(np_array1, np_array2)))
print("\n\n")

NP array equality check: [ True False False  True  True]

#Write a Python program to draw a line using given axis values taken from a text file, with suitable label in the x axis, y axis and a title

lines = open("test.txt").readlines()

x_axis = []
y_axis = []

for line in lines:
    x, y = line[:-1].split(" ")
    x_axis.append(x)
    y_axis.append(y)
print("X-axis: {}\nY-axis: {}".format(x_axis, y_axis))
plt.plot(x_axis, y_axis)

plt.xlabel("Time")
plt.ylabel("Speed")

plt.title("Motion")

plt.show()


```

![[Pasted image 20220702040340.png]]

```

# Write a Python programming to display a bar chart of the popularity of programming Languages. Use different color for each bar

langs =  ['Java', 'Python', 'PHP', 'JavaScript', 'C#', 'C++']
pop =  [22.2, 17.6, 8.8, 8, 7.7, 6.7]

colors = ["#3457b4", "#f4f34e", "#2ca23c", "#46d798", "#7367ed", "#3e574b"]

explode = (0.1, 0, 0, 0, 0, .1)  

plt.pie(pop, explode=explode, labels=langs, colors=colors, autopct='%1.1f%%', shadow=True, startangle=160)

plt.title("PopularitY of Programming Language", bbox={'facecolor':'0.8', 'pad':5})

plt.show()

```
![[Pasted image 20220702040409.png]]
```
# Write a Python program to draw a scatter graph taking a random distribution in X and Y and plotted against each other.

X = randn(200)
Y = randn(200)
plt.scatter(X,Y, color='b')
plt.xlabel("X")
plt.ylabel("Y")
plt.show()

```

![[Pasted image 20220702040453.png]]

```
# Write a Python program to draw a scatter plot comparing two subject marks of Mathematics and Science. Use marks of 10 students

math_marks = [88, 92, 80, 89, 100, 80, 60, 100, 80, 34]
science_marks = [35, 79, 79, 48, 100, 88, 32, 45, 20, 30]
marks_range = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

plt.scatter(marks_range, math_marks, label='Math marks', color='b')
plt.scatter(marks_range, science_marks, label='Science marks', color='r')
plt.title('Scatter Plot')
plt.xlabel('Marks Range')
plt.ylabel('Marks Scored')
plt.legend()
plt.show()

```

![[Pasted image 20220702040510.png]]

