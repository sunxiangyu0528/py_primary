# -*- coding: utf-8 -*-
# @Time    : 2021/8/17 10:22 下午
# @Author  : sunxy
# @Email   : xsun449@gmail.com
# @File    : 上下文管理器.py
# @Software: PyCharm

#  上下文管理器： 上下文管理器是一个python对象，为操作提供了额外的上下文信息，这种额外的信息，在使用
#  with语句初始化上下文，以及完成with块中的所有代码时，采用可调用的形式
#
# with open() as f:
#     f.write()

# 上下文管理器中有 __enter__ 和 __exit__ 两个方法，以with为例子，__enter__ 方法会在执行 with 后面的语句时执行，一般用来处理操作前的内容。
# 比如一些创建对象，初始化等；__exit__ 方法会在 with 内的代码执行完毕后执行，一般用来处理一些善后收尾工作，比如文件的关闭，数据库的关闭等


#
class MyOpen(object):

    def __init__(self, filename, method):
        self.filename = filename
        self.method = method

    # f是__enter__函数返回的内容
    def __enter__(self):
        return "python"

    def __exit__(self, exc_type, exc_val, exc_tb):
        """

        :param exc_type: 远程类型
        :param exc_val: 异常值
        :param exc_tb: 异常追踪信息
        :return:
        """
        print(exc_type)
        print(exc_val)
        print(exc_tb)
        # <class 'NameError'>
        # name 'name' is not defined
        # <traceback object at 0x7f7fb04ef910>
        pass


with MyOpen("a.txt", "r") as f:
    print(f)
    # print(name)
