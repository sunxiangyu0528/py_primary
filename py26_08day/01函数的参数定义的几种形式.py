"""
============================
Author:柠檬班-木森
Time:2020/1/10   20:22
E-mail:3247119728@qq.com
Company:湖南零檬信息技术有限公司
============================
"""
"""
函数的参数定义的几种形式
形参：在定义函数的时候，定义的参数，叫形参（形式上的参数，并没确定值是多少）
形参是用来接收实参传递的值的。
    1、必需参数（必备参数）：定义了几个就要传几个，不能多也不能少
    2、默认参数（缺省参数）:定义的时候给一个默认值，调用函数时，该参数可以传，也可以不传（不传使用默认值）
    3、不定长参数（动态参数）:可以用来接收0个或者多个参数（可接收的参数不限定长度（参数的个数））
        *args:可以用来接收0个或者多个参数(只能接收以位置传参方式传递的参数)，以元组形式保存
        **kwargs:可以用来接收0个或者多个参数(只能接收以关键字指定参数传参方式传递的参数)，以字典的形式保存
        
        # 不定长参数必需定义在默认参数和必需参数之后，

# 拆包和打包：* 、 **

# 拆包
* : 可以用来对元组/列表/字符串进行拆包（调用函数传递参数的时候）
**: 可以用来对字典进行拆包（调用函数传递参数的时候）

注意点：使用*和**拆包，只能在调用函数传递参数的时候使用


# 打包
定义参数的时候在参数前面，加个*或者**,那么这个参数就是一个不定长参数
带有一个*的不定长参数，会将接收到的参数，打包成一个元组
带有一个**的不定长参数，会将接收到的参数，打包成一个字典

# 打包，
"""


# 必需参数:定义了几个就要传几个，不能多也不能少
def func(a, b):
    print("a的值：{}".format(a))
    print("b的值：{}".format(b))
    return a + b

res = func(11, 88)
# res = func(11, b=88)   # 传参的时候，同时使用位置传参和关键字传参，位置参数写前面，关键字参数写后面。
print("相加的结果为：{}".format(res))


# 默认参数（缺省参数）：定义的时候给一个默认值，调用函数时，该参数可以传，也可以不传（不传使用默认值）
# def func( a, b=99,name="木森"):
#     print("a的值：{}".format(a))
#     print("b的值：{}".format(b))
#     print("name的值:{}".format(name))
#     return a + b
#
# res = func(11, 12, 'python')
# print("相加的结果为：{}".format(res))

# *args
# def func(a, b=99, *args):
#     print("a的值：{}".format(a))
#     print("b的值：{}".format(b))
#     print("ppp的值：{}".format(args))
#     return a + b


# res = func(11, 12, 888, 999, 789, 666)
# print("相加的结果为：{}".format(res))


# **kwargs
# def func(a, b=99, **kwargs):
#     print("a的值：{}".format(a))
#     print("b的值：{}".format(b))
#     print("kwargs的值：{}".format(kwargs))
#     return a + b
#
#
# res = func(a=11, b=22, c=333,d=999)
# print("相加的结果为：{}".format(res))


# def func(a, b, c):
#     print("a的值：{}".format(a))
#     print("b的值：{}".format(b))
#     print("c的值：{}".format(c))


# 拆包和打包：* 、 **
# li = [1, 2, 3]
# tu = (11, 22, 33)
# dic = {"a": "111", "b": "222", "c": "999"}

# 正确的用法
# func(li[0],li[1],li[2])
# func(*li)
# func(*tu)
# func(**dic)

# 打包：


#  不能这样用(错误示范)
# a,b,c = *li

# *li = 11,22,33,44


# tu1 = (11, 22, 33)
# a, b, c = tu1
