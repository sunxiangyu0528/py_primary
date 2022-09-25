# -*- coding: utf-8 -*-
# @Time    : 2021/8/15 11:48 上午
# @Author  : sunxy
# @Email   : xsun449@gmail.com
# @File    : 生成器迭代器.py
# @Software: PyCharm

# 生成器表达式
tu = (i for i in range(10))  # 生成器对象


# for i in range(11):
#
#     print(next(tu))
#
# def gen_fun():
#     yield 100
#     print("hello.py")


# 返回的是生成器对象
# res = gen_fun()
# print(res)
# print(next(res))

# 迭代器： 可以for循环的都是可迭代对象
# 可迭代对象转为迭代器可用iter方法
li = [1, 2, 3, 4]
li1 = iter(li)


# print(next(li1))
# print(next(li1))

def fun():
    g = yield 1000
    print(g)


res1 = fun()
print(next(res1))
# print(res1.send(999))
