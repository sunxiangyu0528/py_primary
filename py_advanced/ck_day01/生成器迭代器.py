# -*- coding: utf-8 -*-
# @Time    : 2021/8/15 11:48 上午
# @Author  : sunxy
# @Email   : xsun449@gmail.com
# @File    : 生成器迭代器.py
# @Software: PyCharm

# 可迭代对象是指可以被迭代的对象，即可以使用for循环遍历的对象。在Python中，任何实现了__iter__方法的对象都是可迭代对象，包括序列、集合、字典、生成器等。
# 迭代器： 可以for循环的都是可迭代对象
# 可迭代对象中的__iter__方法返回一个迭代器对象，迭代器对象则负责实际的迭代操作，即返回序列中的每一个元素。当迭代器对象遍历完序列中的所有元素时，会引发StopIteration异常，表示迭代结束。

# # 生成器表达式
tu = (i for i in range(10))  # 生成器对象
print(next(tu))
print(next(tu))
print(next(tu))

#
#
# for i in range(11):
#
#     print(next(tu))

# def gen_fun():
#     yield 100
#     print("hello.py")


# 返回的是生成器对象
# res = gen_fun()
# print(res)
# print(next(res))

li = [1, 2, 3, 4]
# li1 = iter(li)
list
li1 = iter(li)
print(next(li1))
# print(next(li1))
# print(next(li1))

# def fun():
#     g = yield 1000
#     print(g)
#
#
# res1 = fun()
# print(next(res1))
# print(res1.send(999))
