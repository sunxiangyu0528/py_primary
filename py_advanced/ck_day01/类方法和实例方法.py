# -*- coding: utf-8 -*-
# @Time    : 2021/8/15 5:39 下午
# @Author  : sunxy
# @Email   : xsun449@gmail.com
# @File    : 类方法和实例方法.py
# @Software: PyCharm

class MyClass(object):
    def __init__(self, name):
        self.name = name

    # 类方法
    # 定义：使用装饰器 @ classmethod。第一个参数必须是当前类对象，该参数名一般约定为“cls”，通过它来传递类的属性和方法（不能传实例的属性和方法）；
    # 调用：类和实例对象都可以调用。
    @classmethod
    def func(cls):
        print("类方法")

    # 静态方法
    # 定义：使用装饰器 @ staticmethod。参数随意，没有“self”和“cls”参数，但是方法体中不能使用类或实例的任何属性和方法；
    # 调用：类和实例对象都可以调用。
    @staticmethod
    def func2():
        print("静态方法")

    # 实例方法
    #     定义：第一个参数必须是实例对象，该参数名一般约定为“self”，通过它来传递实例的属性和方法（也可以传类的属性和方法）；
    #     调用：只能由实例对象调用
    def func3(self):
        print("普通方法")

    # 装饰完后，属性只能读，不能该
    @property
    def read_attr(self):
        print("这个装饰器装饰完了后，该方法可以像属性一样调用")
        return "18"


MyClass.func()
MyClass.func2()
# MyClass.func3()
m1 = MyClass("sunxiangyu")
# m1.func()
# m1.func2()
# m1.func3()
print(m1.read_attr)
print(m1.name)
