Labsheet2

1.  Program 1

```
#!/bin/bash

# create a directory hierarchy

mkdir -p test1/test2/test3;

ls -l > test1/test2/test3/file1;

cd test1/test2/test3;

echo "Files and Dirs";
cat file1 | grep -E "^-" # all files
cat file1 | grep -iE "^d" # all dir


echo "files and dir start with d in current working directory"
find . | grep -Ei "^\./d" # everything that starts with d

# print every word in the file in seperate line
for word in $(cat file1); do echo "$word"; done;

cd ../../../;
pwd;

```

![[Pasted image 20220219060851.png]]

![[Pasted image 20220219060908.png]]

2. Program 2

```
#!/bin/bash

echo "Student Alice Essentials 20 PSAT 22 Maths 34 Cultural 25 Physics 80 English 70
Student Bob Essentials 23 PSAT 21 Maths 32 Cultural 18 Physics 18 English 94
Student Boby Essentials 43 PSAT 31 Maths 22 Cultural 8 Physics 76 English 93
Student Clara Essentials 18 PSAT 16 Maths 27 Cultural 12 Physics 34 English 45
Student Dirck Essentials 25 PSAT 23 Maths 48 Cultural 25 Physics 45 English 98
Student Eve Essentials 8 PSAT 6 Maths 12 Cultural 13 Physics 4 English 5" > Student_details;

echo "Details of Bob: ";
cat Student_details | grep " Bob ";

echo "Find student names containing letter i,e or a";
cat Student_details | awk -F ' ' '{print $2}' | grep -E '[iea]'

echo "Find marks of students whose name starts with b (case insensitive)"
cat Student_details | grep -iE 'Student b(.*)'

echo "Find marks of students whose name starts with b (case sensitive)"
cat Student_details | grep -E 'Student b(.*)'


```

![[Pasted image 20220219063324.png]]

![[Pasted image 20220219063348.png]]

![[Pasted image 20220219063430.png]]

3. Program 3


```
#!/bin/bash

man sort > Sort_manual;

echo "";

echo "Starts with compare";

cat Sort_manual | grep -E "^( *)compare";

echo "";

echo "Ends with sort";

cat Sort_manual | grep -iE "(.*)sort$"

echo "";

echo "Number of lines which has numeric in it";

cat Sort_manual | grep "numeric" | wc -l;

echo "";

echo "Replace '--' to '-' and write to new file";

cat Sort_manual | sed 's/--/-/g' > new_manual;

cat new_manual;



```

![[Pasted image 20220219064859.png]]

4,5

![[Pasted image 20220219065019.png]]
6. create a new file count with content

![[Pasted image 20220219070711.png]]

7 copy contents of count to count2 using cat

![[Pasted image 20220219070751.png]]

8. create a file with contents


![[Pasted image 20220219065558.png]]

9. concatenate the contents of file count2 and count3 to countfinal

![[Pasted image 20220219070833.png]]

10, 11 - first and last ten lines

![[Pasted image 20220219070908.png]]

12. inverted form

![[Pasted image 20220219070929.png]]

