import pytest

num1 = 50
num2 = 40
def Add():
   sum = num1 + num2
   assert sum == 90

def sub():
   dif = num1 - num2
   assert dif == 10

def multiply():
   multi = num1 * num2
   assert multi == 100

def divide():
   dvd = num1 / num2
   assert dvd == 10
