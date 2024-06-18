def Fibonacci_series(number):
    if number <= 1:
      return number
    else:
       return (Fibonacci_series(number-1) + Fibonacci_series(number -2))
    
nterms = int(input("Enter a number"))

if nterms <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(nterms):
       print(Fibonacci_series(i))