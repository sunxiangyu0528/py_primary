# -*- coding: utf-8 -*-
# @Time    : 2021/9/24 4:05 下午
# @Author  : sunxy
# @Email   : xsun449@gmail.com
# @File    : 深浅拷贝.py
# @Software: PyCharm
# 所谓深拷贝呢，就是重新分配一个内存空间（新对象），将原对象中的所有元素通过递归的方式进行拷贝到新对象中。
import copy

a = [[11, 22, 33], [44, 55, 66]]

# b= copy.copy(a)
b = copy.deepcopy(a)

a[0][0] = 999
print(a)
print(b)


