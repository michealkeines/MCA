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

