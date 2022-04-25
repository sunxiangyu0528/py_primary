"""
======================
Author: 柠檬班-小简
Time: 2021/12/29 19:40
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
入参：形参(定义函数的时候，变量，占位符)，实参(调用函数时，具体的数据)

使用函数，就是与函数的功能进行交互，交互的时候就会有数据的输入，输出。
输入：要传递给函数功能的数据。
输出：函数处理之后，给你的结果数据。

定义的时候，不知道用户会输入什么数据。-- 形参(告诉用户，在什么地方放什么东西)
只有在使用的时候，用户才会传递真实的数据。
函数的参数(输入)：用变量表示
    在定义函数时：
    def 函数名称(参数1，参数2，参数3.....):
        pass

1、位置参数/必传参数。定义的只有形参名。调用时，传参顺序一一对应。
2、默认参数
   在定义函数的时候，就给形参设置一个默认值。   
   在调用函数的时候，如果不传就使用默认值，如果传了，就使用传的值。 
   默认参数，要排在必传参数的后面。
   可以设置多个默认值。
   在调用的时候，可以使用指定参数。

3、不定长参数。
   不确定参数的个数。
   定义函数的时候，不确定使用者会传几个参数进来。
   *args: 可以不传，也可以传多个。
   在定义函数的时候，在函数内部args是一个元组。
   
   定义函数的时候，函数参数为*args的时候，表示可以传多个值进来。
   调用函数的时候，传参时用*列表/元组，表示解包。
       一变多：如果不解包，就是一个参数。如果解包，就是列表/元组有几个值，就是几个参数。
       解包：拆掉/脱掉列表的中括号，元组的小括号。
       不是什么情况下都要拆包，符合的情况下才拆包。
"""
# 必传参数 > *args > 默认参数
def get_max_value_v4(aa,bb,*args,cc=300):
    print(args)
    max = aa
    if aa < bb:
        max = bb
    if max < cc:
        max = cc
    if args:
        # 遍历元组。
        for item in args:
            if item > max:
                max = item
    print(f"最大值是：{max}")

# # 调用
mylist = [23,44,12,34,55,66]
# get_max_value_v4(mylist[0], mylist[1], mylist[2], mylist[3],mylist[4], mylist[5])
# # 调用函数的时候，传参偷懒方式：解包。 *列表/元组。
# get_max_value_v4(*mylist)
# 脱完的效果：get_max_value_v4(23,44,12,34,55,66)

# print("11","22",66666)
# print(*mylist,sep="---")
# print(mylist,sep="---")


# get_max_value_v4(100, 200, 330)
# get_max_value_v4(100, 200, 300,500,600,cc=777)





# 定义的时候，使用*args
# def get_max_value_v3(*args):
#     print(args)
#     # 如果args=(),是False。not ()=True。如果元组为空，就无法比较。
#     # if not args:
#     #     print("没有数据，无法比大小！")
#     # else:
#     #     max = 0
#     #     for item in args:
#     #         if item > max:
#     #             max = item
#     #     print(f"最大值是：{max}")
#     # args不为空元组,是True
#     if args:
#         max = 0
#         # 遍历元组。
#         for item in args:
#             if item > max:
#                 max = item
#         print(f"最大值是：{max}")
#     else:
#         print("没有数据，无法比大小！")

# # 调用
# get_max_value_v3()
# get_max_value_v3(100, 200, 300)
# get_max_value_v3(100, 200, 300, 666)


# # 定义函数，使用默认参数
# # 在调用函数的时候，如果不传就使用默认值，如果传了，就使用传的值。
# def get_max_value_v2(aa=11, bb=444, cc=222):
#     """
#     对三个数，进行比大小。并输出最大的那一个数字。
#     :param aa: 第一个数字。整数或者浮点数
#     :param bb: 第二个数字。整数或者浮点数
#     :param cc: 第三个数字。整数或者浮点数
#     :return:
#     """
#
#     # 公共的逻辑流程(不会变)：
#     max = aa
#     if aa < bb:
#         max = bb
#     if max < cc:
#         max = cc
#     print(max)
#
# get_max_value_v2()
# get_max_value_v2(11,33)
# get_max_value_v2(11,33,5)
# # 只想给cc传值。指定参数：指定形参=实参
# get_max_value_v2(cc=101)
# # get_max_value_v2(cc=101, aa=100, bb=98)

# 定义了一个函数(功能) - 定义时是形参。定义的时候不知道用户会传什么值。
# def get_max_value_v1(aa, bb, cc):
#     # 数据(会变)
#     # a = 100
#     # b = 150
#     # c = 300
#
#     # 公共的逻辑流程(不会变)：
#     max = aa
#     if aa < bb:
#         max = bb
#     if max < cc:
#         max = cc
#     print(max)
#
# # 调用
# get_max_value_v1(100, 400, 300)
# get_max_value_v1(255, 330, 111)
# get_max_value_v1(18, 9, 3)
# get_max_value_v1(18.88, 9.56, 15.223)
# get_max_value("hello", "world", True)

