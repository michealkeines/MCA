def swap(a, b, list):
    temp = list[a]
    list[a] = list[b]
    list[b] = temp

def bubble(list):
    i = 0
    n = len(list)
    while (i <= n - 2):
        swapped = False
        j = 0
        while (j <= n - 2 - i):
            if list[j] > list[j + 1]:
                swap(j, j+1, list)
                print(list)
                swapped = True
            j = j + 1
        if not swapped:
            break
        i = i + 1

def main():
    unsorted = [23, 25, 12, 34, 15, 16]
    print(unsorted)
    bubble(unsorted)
    print(unsorted)

main()
