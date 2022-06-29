import numpy as np
import pandas as pd

# 1. Write a program to create a data frame of countries using a dictionary that stores country names, capitals, and populations of the country

countries = {
    "Name" : ["India", "Chile", "Austria", "Japan"],
    "Capital" : ["Delhi", "Santiago", "Vienna", "Tokyo"],
    "Population" : [45, 12, 2, 4]
}

# 2. Create a dictionary, convert it into the corresponding data frame and display it

countries_data_frame = pd.DataFrame.from_dict(countries)

print(countries_data_frame)

# 3. Write a Pandas program to get the powers of an array values element-wise. First array elements raised to powers from second array

data_3 =  {'X':[68,75,86,70,76], 'Y':[74,84,79,73,76],'Z':[76,87,86,62,73]}

sample3_data_frame = pd.DataFrame.from_dict(data_3)

print(sample3_data_frame)


