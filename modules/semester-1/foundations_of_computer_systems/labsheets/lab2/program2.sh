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


