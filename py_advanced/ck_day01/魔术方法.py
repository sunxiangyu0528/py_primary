# -*- coding: utf-8 -*-
# @Time    : 2021/8/15 10:03 下午
# @Author  : sunxy
# @Email   : xsun449@gmail.com
# @File    : 魔术方法.py
# @Software: PyCharm


# 当使用print输出对象的时候，只要自己定义了__str__(self)方法，那么就会打印从在这个方法中return的数据
# __str__方法需要返回一个字符串，当做这个对象的描写
# 使用str函数或者print打印的时候回优先触发str方法，没定义str方法的情况下，会再去找repr方法，如果都没有
# 那么就回去找父类的str方法
# 使用repr方法或者交互环境下输入变量，会先找到自身的repr方法，自身没有repr方法，再去找父类的repr方法
class ClassDemo(object):

    def __init__(self, name):
        self.name = name

    def __new__(cls, *args, **kwargs):
        # print("这个是new方法")
        return super().__new__(cls)

    # 必须return字符串
    # def __str__(self):
    #     print(self.name)
    #     return self.name

    def __repr__(self):
        print("repr被触发")
        return "hello,py"


m2 = ClassDemo("sunxy")


# 通过以下方法可以触发__str__方法
#

# print(m2)
# format(m2)

# res = repr(m2)
# print(res)


# call方法

class Demo2(object):
    def __call__(self, *args, **kwargs):
        # 在像函数一样调用的时候触发
        print("call方法")
    pass

m3 = Demo2()

# m3()
# call方法
