# -*- coding: utf-8 -*-
# @Time    : 2021/8/15 2:23 下午
# @Author  : sunxy
# @Email   : xsun449@gmail.com
# @File    : 常用的内置函数.py
# @Software: PyCharm

# filter：把过滤好的数据添加到一个列表里面
def fun(n):
    return n > 2


li = [1, 2, 3, 4]
tu = (1, 2, 3, 4)
res = filter(fun, li)

print(list(res))

# map:  将可迭代对象中的数据迭代出来，一个一个传到函数中调用，将返回结果放到新的对象中
res1 = map(fun, li)
print(list(res1))

# zip:
res2 = zip([1, 2, 3], [4, 5, 6])
# print(list(res2))
res3 = list(res2)
print(res3)
print(dict(res3))
# print(type(res3))


# 匿名函数
res4 = lambda a, b: a + b
print(res4(11, 22))

# 匿名函数应用
res5 = filter(lambda a: a < 10, [1, 2, 3, 4])
print(list(res5))

# 三目运算符（三元运算符）
a = 2
b = 1

if a > b:
    max = a;
else:
    max = b;

max = a if a > b else b
