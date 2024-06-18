list1 = [2,5,7,8,12,15,18,20]
list2 = [22,45,32,54,13,32,24,11]

print("First List " , list1)
print("Second List ", list2)

list3 = []

for num in list1:
    if(num %2 != 0):
        list3 .append(num)

for num in list2:
    if(num %2 == 0):
        list3.append(num)
        
print("Thrid lsit is :", list3)
