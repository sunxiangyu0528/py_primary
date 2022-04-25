"""
======================
Author: 柠檬班-小简
Time: 2021/12/31 20:41
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
返回值：
print  和  return的区别
高铁站取票：屏幕上面的显示的就是print。吐出来的高铁票就是return

函数不一定要有返回值。 --len()
函数没有return，a = 函数调用，a就是None.
函数设计返回值，必然是因为使用了这个函数之后，要用它的返回值，做另外的事情。

return的作用：
    1、程序执行完成之后，返回数值。
    2、当程序执行遇到return时，函数终止。
    3、return [没有值/有多个值]
    4、return 后面没有值，相当于return None
    5、一个函数里是可以有多个return。在不同的分支可以使用return.
    6、返回多个值：return 值1,值2,值3....
       接收函数返回值时：result = 函数调用()。result是个元组。
       或者，变量1, 变量2...= 函数调用()  有几个返回值，就用几个变量接收。
       
"""
# 如果args为空元组，直接退出函数。
def get_max_value_v3(*args):
    if args == ():
        print("没有传数据进来，退出程序！")
        return   # 相当于return None

    print("有数据，继续执行......")
    max = 0
    min = args[0]
    # 遍历元组。
    for item in args:
        if item > max:  # 最大值
            max = item
        if item < min:
            min = item  # 最小值
    # 返回最大的值
    return max,min

# result = get_max_value_v3()
# print(result)
# result = get_max_value_v3(11, 88, 33, 44)
# print("最大值和最小值是：", result)
#
# if result is None:
#     print("哎呀，没有结果呀")
# else:
#     print(f"最大值和最小值的相乘的结果：{result[0] * result[1]}")

# max_value, mix_value = get_max_value_v3(11, 88, 33, 44)
# print("最大值和最小值是：", max_value, mix_value)

# 比较：数据值是否相等。==    is 内存地址是否是一样的。

# 带有for循环的函数，使用break和return的区别
def remove_element(a_list):
    new_list = []

    for item in a_list:
        if item not in new_list:
            new_list.append(item)
        if len(new_list) == 4:
            return new_list

    print(new_list)

my_list = [10, 1, 2, 20, 10, 3, 2, 1, 15, 20, 44, 56, 3, 2, 1]
remove_element(my_list)