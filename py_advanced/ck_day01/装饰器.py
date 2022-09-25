# -*- coding: utf-8 -*-
# @Time    : 2021/8/15 8:13 下午
# @Author  : sunxy
# @Email   : xsun449@gmail.com
# @File    : 装饰器.py
# @Software: PyCharm


def login(fun):
    def index():
        print("首页")
        return fun()

    return index


@login
def outside():
    print("outside")


outside()


@login
class MyClass(object):
    def __init__(self):
        pass


# 在装饰器内层函数加return
m = MyClass()
print("M", m)
print(MyClass())
