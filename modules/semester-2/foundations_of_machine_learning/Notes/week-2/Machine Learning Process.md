# Machine Learning Process

![[Pasted image 20220709075943.png]]

## Data Preprocessing

![[Pasted image 20220709080116.png]]

## Data Cleansing

![[Pasted image 20220709080319.png]]

![[Pasted image 20220709080415.png]]


## Feature Engineering

selection, extaction, addition, filtering

![[Pasted image 20220709080515.png]]

Feature selection

![[Pasted image 20220709080603.png]]

Feature Extraction

![[Pasted image 20220709080704.png]]

## Data Transformation

![[Pasted image 20220709080824.png]]

Feature Scaling

![[Pasted image 20220709080912.png]]

as the value in unnormalized data set is graded out different scales, it's not accurate, so we normalize all the values into one scale

### normalization techniques

![[Pasted image 20220709081234.png]]

min-max , standardization

# Data Partitioning

![[Pasted image 20220709081433.png]]

Training, validation, test

![[Pasted image 20220709081521.png]]

![[Pasted image 20220709081709.png]]


![[Pasted image 20220709081746.png]]

Data partitioning alone may not give the best end result, instead the data should be split repeatedly and multiple models should be trained

# K-fold Cross-Validation


![[Pasted image 20220709082002.png]]

evertime we take ddiffernt set as test samples and take average of all results

![[Pasted image 20220709082037.png]]

Sensitive and influence of data set

![[Pasted image 20220709082105.png]]

![[Pasted image 20220709082118.png]]

LOOCV leave one out crooss 

![[Pasted image 20220709082214.png]]


Variations of cross validation

![[Pasted image 20220709082241.png]]

Stratified 

![[Pasted image 20220709082308.png]]

take some from every class

Shuffle-split

![[Pasted image 20220709082447.png]]

tranining set is split randomly

