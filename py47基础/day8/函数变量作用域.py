"""
======================
Author: 柠檬班-小简
Time: 2021/12/31 21:39
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
官方中文网站：https://docs.python.org/zh-cn/3.9/library/functions.html

函数内部定义的变量
函数外部定义的变量

常量：只定义和使用
"""
FLAG = True  # 全局变量

def remove_element(a_list,flag=FLAG):
    # global FLAG  # 申明是全局变量
    new_list = []  # 局部变量。
    for item in a_list:
        if item not in new_list:
            new_list.append(item)
    print(FLAG)  # 在函数内部，访问全局变量。不可以修改全局变量。
    # FLAG = False # 如果要修改全局变量，加关键字global
    print(new_list)

print(FLAG)