# -*- coding: utf-8 -*-
# @Time    : 2021/8/15 4:45 下午
# @Author  : sunxy
# @Email   : xsun449@gmail.com
# @File    : demo.py
# @Software: PyCharm
# t1 = ("aa", 11)
# t2 = ('bb', 22)
# li1 = [("cc", 11)]
# li1.insert(0,t1)
# li1.insert(1,t2)
# print(li1)
# # {"aa":11,"cc":22,"bb":22}
# t11 = list(t1)
# print(t11)
# print(dict(li1))
num = 12345
print(num//10)
# print(num%1000)
for i in range(5):
    print(num % 10)
    num = num // 10
