"""
======================
Author: 柠檬班-小简
Time: 2021/12/31 20:32
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
3、不定长参数。
不确定参数的个数。
定义函数的时候，不确定使用者会传几个参数进来。
*args: 可以不传，也可以传多个。传参的形式：value,value
在定义函数的时候，在函数内部args是一个元组。

定义函数的时候，函数参数为 * args的时候，表示可以传多个值进来。
调用函数的时候，传参时用 * 列表 / 元组，表示解包。
一变多：如果不解包，就是一个参数。如果解包，就是列表 / 元组有几个值，就是几个参数。
解包：拆掉 / 脱掉列表的中括号，元组的小括号。
不是什么情况下都要拆包，符合的情况下才拆包。

**kwargs: 可以不传，也可以传多个。传参的形式：key=value,key=value
   在定义函数的时候，在函数内部kwargs是一个字典。
"""
def myfunc(**kwargs):
    # kwargs是字典。
    print(kwargs)

# 调用的时候，
myfunc(name="xj", year="2021")

# 必传参数，默认参数，*args, **kwargs
def myfunc2(*args, **kwargs):
    print(args)
    print(kwargs)

myfunc2(1234,3421)
myfunc2(name="xj", year="2021")
myfunc2()

def myfunc3(a=100, **kwargs):
    pass