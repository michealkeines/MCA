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



