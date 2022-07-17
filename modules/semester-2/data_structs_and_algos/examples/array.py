from operator import le


class Array:
    def __init__(self, length) -> None:
        self.values = [0] * length
        self.length = length
    
    def traverse(self):
        for index in range(0, self.length):
            yield (index, self.values[index])
    
    def insert(self, value, index=None):
        if index is None and type(value) == list:
            for i in range(0,len(value)):
                self.values[i] = value[i]
        else:
            if index >= self.length:
                raise IndexError
            if index < 0:
                raise IndexError
            self.values[index] = value
    
    def search(self, value, duplicates=False):
        indexs = []
        for (index, item) in self.traverse():
            if value == item and not duplicates:
                return index
            elif value == item and duplicates:
                indexs.append(index)
        
        if not duplicates:
            return None
        else:
            if len(indexs) == 0:
                return None
            else:
                return indexs

    def print_elements(self):
        if self.length == 0:
            print("No Elements")
            return
        for _, value in self.traverse():
            print("{},".format(value), end=" ")
        print("\n")

    def remove_element(self, value, resize=False):
        index = self.search(value, duplicates=True)
        if index is not None:
            if type(index) is not list:
                index = [index]
            current = 0
            for temp_i in index:
                if not resize:
                    self.insert(index=temp_i, value=0)
                else:
                    temp = [0] * (self.length - 1)
                    count = 0
                    for (i, item) in self.traverse():
                        if(i == (temp_i - current)):
                            continue
                        temp[count] = item
                        count += 1
                    self.values = temp
                    self.length = self.length - 1
                current += 1

    def merge(self, other):
        if type(other) is not Array:
            raise TypeError
        l = self.length + other.length
        temp = [0] * l
        count = 0
        for _, val in self.traverse():
            temp[count] = val
            count += 1
        for _, val in other.traverse():
            temp[count] = val
            count += 1
        self.length = l
        self.values = temp

    def merge_sort(self, values):
        if len(values) > 1:
            mid = len(values) // 2
            left = values[:mid]
            right = values[mid:]
            
            self.merge_sort(left)
            self.merge_sort(right)

            i = j = k = 0
           # print("{} {}".format(left, right))
            while i < len(left) and j < len(right):
                if left[i] < right[j]:
                   # print("{},{}: {} , {}".format(k, i, values[k], left[i]))

                    values[k] = left[i]
                    i += 1
                else:
                   # print("{},{}: {} , {}".format(k, j, values[k], right[j]))
                    values[k] = right[j]
                    j += 1
                k += 1
            
            while i < len(left):
              #  print("{},{}: {} , {}".format(k, i, values[k], left[i]))
                values[k] = left[i]
                i += 1
                k += 1

            while j < len(right):
               # print("{},{}: {} , {}".format(k, j, values[k], right[j]))
                values[k] = right[j]
                j += 1
                k += 1
            

    def sort(self, asc=True):
        self.merge_sort(self.values)
        if not asc:
            temp = []
            for i in reversed(range(0, self.length)):
                temp.append(self.values[i])
            self.values = temp

array = Array(10)

for i in range(0, 10):
    array.insert(index=i, value=i+1)

array.print_elements()

array.insert(value=[7,2,4,5,6,7,2,3,6,1])

array.print_elements()


print("Search value: 9, index: {}".format(array.search(9)))
print("Search value: 2, index: {}".format(array.search(2)))
print("Search value: 2, index: {}".format(array.search(value=2, duplicates=True)))

array.print_elements()
array.remove_element(value=7, resize=True)
array.print_elements()

array1 = Array(3)
for i in range(0,3):
    array1.insert(index=i, value=i+1)

array2 = Array(3)
for i in range(0,3):
    array2.insert(index=i, value=i+2)

array1.print_elements()

array1.merge(array2)
array1.print_elements()
array1.remove_element(value=2, resize=True)
array1.print_elements()
array1.remove_element(value=3, resize=True)
array1.print_elements()
array1.remove_element(value=4, resize=True)
array1.print_elements()
array1.remove_element(value=1, resize=True)
array1.print_elements()

array2 = Array(7)
array2.insert(index=0, value=38)
array2.insert(index=1, value=27)
array2.insert(index=2, value=43)
array2.insert(index=3, value=3)
array2.insert(index=4, value=9)
array2.insert(index=5, value=82)
array2.insert(index=6, value=10)

array2.print_elements()
array2.sort(asc=False)
array2.print_elements()