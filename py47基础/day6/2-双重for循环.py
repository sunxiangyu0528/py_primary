"""
======================
Author: 柠檬班-小简
Time: 2021/12/27 20:46
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
圣诞礼品：[苹果礼盒、现金盲盒、圣诞娃娃] for

同学们：[熊猫、湫、繁、小小D、苗] for

从头到尾，访问了同学们的每一个成员。
同学们的每一个成员，
                从头到尾访问了圣诞礼品
                
熊猫 - 苹果礼盒
熊猫 - 现金盲盒
熊猫 - 圣诞娃娃

湫 - 苹果礼盒
湫 - 现金盲盒
湫 - 圣诞娃娃

繁 - 苹果礼盒
繁 - 现金盲盒
繁 - 圣诞娃娃

小小D - 苹果礼盒
小小D - 现金盲盒
小小D - 圣诞娃娃


苗 - 苹果礼盒
苗 - 现金盲盒
苗 - 圣诞娃娃

排队的饭友们 - 列表
食堂的20道菜 - 列表

相亲：
20个女孩子
20个男孩子 

单层for: 从头到尾访问每一个成员，做同样的一件事情。
"""
gifts = ["苹果礼盒", "现金盲盒", "圣诞娃娃"]
names = ["熊猫", "湫", "繁", "小小D", "苗"]

# name = "熊猫"
# for gift in gifts:
#     print("礼品是：", gift)

for name in names:
    # 每取到一个人名，要干的事情。干的事情比较特殊：去遍历另外一个列表。
    for gift in gifts:
        print("礼品是：", gift)
# 行列 双重for: 行是什么？列是什么？
"""
*
**
***
****
"""
# 找规律。先假设举例，再找规律。
# 第一行：怎么实现？
# print("*")
# 第二行：怎么实现？
# print("**")
# 第三行：怎么实现？
# print("***")
# 找到与行的规律 ？内部for怎么实现？外部for怎么实现？
# for i in range(1,5):
#     print("*"*i) # print是在控制台打印出。每次调用print会自动换行

# i = 0
# while i <= 5:
#     print("*" * i)
#     i += 1

# for num1 in range(5):
#     for num2 in "*":
#         print(num2 * num1)

# for i in range(1, 5):
#     for j in range(0, i):
#         print("*", end="")
#     print()

"""
1
1 2 
1 2 3 
1 2 3 4
1 2 3 4 5
"""
# 第一行怎么实现？
# row = 1, print(1)
# 第二行怎么实现？
# row = 2, 输出1, 2
# 第三行怎么实现？
# row = 3, 输出1, 2, 3
# 第四行怎么实现？
# row = 4, 输出1, 2, 3, 4
# 第五行怎么实现？
# row = 5, 输出1, 2, 3, 4, 5
# row = 1
# for index in range(1,row+1):
#     print(index, end='\t')  # print默认的结束符是换行。但是可以改，比如可以改成空格。
#
# row = 2
# for index in range(1,row+1):
#     print(index, end='\t')
#
# row = 3
# for index in range(1,row+1):
#     print(index, end='\t')

for row in range(1,6):
    for index in range(1, row + 1):
        print(index, end='\t')
    print() # 换行


# 冒泡排序：https://www.runoob.com/python3/python-bubble-sort.html