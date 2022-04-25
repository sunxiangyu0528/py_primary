"""
======================
Author: 柠檬班-小简
Time: 2021/12/27 21:38
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
函数：实现了一个功能。功能可以反复使用。
     把一个功能封装，取个名字。要用的时候喊名字就可以使用了，不用管这个东西怎么实现的。

我们未来使用的功能：
一部分是我们自己实现
一部分是使用别人实现的 - print()  int()  

函数的实现：
def 函数的名字():
    函数的实现代码。 函数体

函数的调用(重复):
函数名称()
"""


# 定义了一个函数(功能) - 函数制造者
def get_max_value():
    a = 100
    b = 150
    c = 300

    max = a
    if a < b:
        max = b
    if max < c:
        max = c
    print(max)

# 使用函数(功能) - 会去执行函数的代码。
# get_max_value()

get_max_value()
get_max_value()
get_max_value()
get_max_value()
get_max_value()


# for i in range(5):
#     get_max_value()

# 下节课：函数的参数类型、返回值。
# https://www.runoob.com/python3/python3-function.html