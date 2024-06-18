numbers = list(input("Enter a set of numbers with comma; ").split(", "))
sum = 0
for numbers in numbers :
    sum += int(numbers)
print(sum)