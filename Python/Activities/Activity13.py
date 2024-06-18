def calculateSum(num):
  sum = 0
  for number in num:
    sum += number
  return sum
  
  numlist = [10,20,30,40,50,60]
  result = calculateSum(numlist)

  print("Sum of all elements in list :" +str(result))