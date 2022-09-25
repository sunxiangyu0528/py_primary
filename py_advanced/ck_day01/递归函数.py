# -*- coding: utf-8 -*-
# @Time    : 2021/8/15 1:50 下午
# @Author  : sunxy
# @Email   : xsun449@gmail.com
# @File    : 递归函数.py
# @Software: PyCharm

# 编程语言中，函数Func(Type a,……)直接或间接调用函数本身，则该函数称为递归函数
# 递归函数实现阶乘
def func(n):
    if n == 1:
        return 1
    else:
        return func(n - 1) * n


print(func(4))


# 2、递归推斐波那契数列
def func1(n):
    ''' n为斐波那契数列 '''
    if n <= 2:
        ''' 数列前两个数都是1 '''
        v = 1
        return v  # 返回结果，并结束函数
    v = func1(n - 1) + func1(n - 2)  # 由数据的规律可知，第三个数的结果都是前两个数之和，所以进行递归叠加
    return v  # 返回结果，并结束函数


print(func1(15))  # 610    调用函数并打印结果


