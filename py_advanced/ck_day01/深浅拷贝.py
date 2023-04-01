# -*- coding: utf-8 -*-
# @Time    : 2021/9/24 4:05 下午
# @Author  : sunxy
# @Email   : xsun449@gmail.com
# @File    : 深浅拷贝.py
# @Software: PyCharm
# 所谓深拷贝呢，就是重新分配一个内存空间（新对象），将原对象中的所有元素通过递归的方式进行拷贝到新对象中。
# 当您执行浅拷贝时，它只会复制对象的引用，而不是对象本身。换句话说，如果您更改了原始对象，则复制的对象也会相应地更改
import copy

a = [[11, 22, 33], [44, 55, 66]]

# b= copy.copy(a)
b = copy.deepcopy(a)

a[0][0] = 999
print(a)
print(b)


