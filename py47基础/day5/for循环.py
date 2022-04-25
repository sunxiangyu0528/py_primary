"""
======================
Author: 柠檬班-小简
Time: 2021/12/24 21:15
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
for循环，for遍历
遍历：从头到尾，每一个都访问，访问之后执行同样的动作/代码。
循环的去做同样的一件事情，只不是和不同的对象。

列表/字典           字符串/元组

for 变量名(用来接收每一个成员) in 列表/字典:
    从列表/字典当中取出的每一个成员后，都要执行的代码。

内置函数：range  取头不取尾
range(n)：默认生成一个 0到n-1的整数序列
range(n,m)：默认生成一个n到m-1的整数序列
range(n,m,k)：相当于其他函数里面的for循环。n 初始值 m 结束值 ， k 步长。
                           会生成初始值为n,结束值为m-1,递减或者是递增的整数序列。

"""
py47_name = ["帝辛", "明xi", "罪名", "抱抱熊", "将心比心"]

# 列表的循环 - 每一次取的是列表的成员(常用)。
# for stu in py47_name:
#     print(stu)
#     print("打个电话，聊一聊最近的学习怎么样")

# 列表的循环 - 得到列表的所有索引，然后遍历索引。 [0,1,2,3]
# 如何得索引？[0,1,2,3]
#  range函数
# print(list(range(5)))
# print(list(range(1,5)))
# print(list(range(2,10,2)))

# range(len(py47_name))  [0,1,2,3,4]
for index in range(len(py47_name)):
    print(index)
    print(py47_name[index])


# 题目：用户输入5次，分别输入5个数字。每输入一个数字，请判断是否在1-100之间(整数)。
# 如果是，打印数字。如果不是，打印：不是1-100以内的数字。
# 用户输入22，判断是否在1-100之间，是则。。不是则。。

for _ in range(5):
    user_num = int(input("请输入一个整数数字: "))
    if user_num in range(1,101):
        print(user_num)
    else:
        print("不是1-100以内的数字")

# 第一步：先把场景都假设出来。然后提取共同之处。什么是变的，什么是不变的。再去考虑重复了什么？如何实现重复
# # 假设用户第一次输入的是22
# user_num = 22
# if user_num in range(1,101):
#     print(user_num)
# else:
#     print("不是1-100以内的数字")
#
# user_num = 88
# if user_num in range(1,101):
#     print(user_num)
# else:
#     print("不是1-100以内的数字")
#
# user_num = 120
# if user_num in range(1,101):
#     print(user_num)
# else:
#     print("不是1-100以内的数字")
#
# user_num = 188
# if user_num in range(1,101):
#     print(user_num)
# else:
#     print("不是1-100以内的数字")