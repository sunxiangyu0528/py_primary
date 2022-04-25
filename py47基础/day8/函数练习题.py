"""
======================
Author: 柠檬班-小简
Time: 2021/12/31 20:22
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
题目3：列表去重函数
定义一个函数 def remove_element(a_list):
将列表[10, 1, 2, 20, 10, 3, 2, 1, 15, 20, 44, 56, 3, 2, 1]
去除重复元素(不能用集合去重，要使用for循环)。
函数定义样式如下：
def remove_repeatitive_elements(a_list):
...
函数调用：
my_list = [10, 1, 2, 20, 10, 3, 2, 1, 15, 20, 44, 56, 3, 2, 1]
remove_repeatitive_elements(my_list)
(ps：也可以使用其它的列表作为参数传递)

"""
def remove_element(a_list):
    new_list = []
    for item in a_list:
        if item not in new_list:
            new_list.append(item)
    print(new_list)

my_list = [10, 1, 2, 20, 10, 3, 2, 1, 15, 20, 44, 56, 3, 2, 1]
remove_element(my_list)
you_list = [10, 1, 2, 20, 10, 3, 2, 1, 15, 20, 44, 56, 3, 2, 1,200,201,44,33,22,11]
remove_element(you_list)

