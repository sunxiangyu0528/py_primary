"""
======================
Author: 柠檬班-小简
Time: 2021/12/24 20:13
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
if 条件(结果为True或者False):
    条件为True的情况下，会执行的代码(会干的事情)

多行一起缩进快捷键：选中按Tab   取消缩进：Shift+Tab

if 条件(结果为True或者False):
    条件为True的情况下，会执行的代码(会干的事情)
else:
    if条件为False的时候，要执行的代码。
    
if 条件1(结果为True或者False):
    条件1为True的情况下，会执行的代码(会干的事情)
elif 条件2(结果为True或者False):
    条件1不成立，且条件2为True的情况下，会执行的代码(会干的事情)
elif 条件3(结果为True或者False):
    条件2不成立，且条件3为True的情况下，会执行的代码(会干的事情)
else:
    前面的条件都不成立的情况下，会执行的代码。
"""
# score = int(input("请输入你的分数:"))
#
# if score > 60:
#     print("还不错哦，及格")
#     if score > 100:
#         print("太牛了！")
# else:
#     print("太菜了！")
#     if score < 10:
#         print("菜的抠脚！！")


# if score >= 85:
#     print("A")
# elif 75 <= score < 85:
#     print("B")
# elif 60 <= score < 75:
#     print("C")
# elif 40 <= score < 60:
#     print("D")
# else:
#     print("E")

# if int(score) > 60:
#     print("么么哒")
#     print("真棒")
#     print("继续加油呀！")
# else:
#     print("一个巴掌")
#     print("让你不好好学习")

print("程序结束！")

"""
1、用户输入一个人的身高和体重。编程实现这个人的身材是否正常。
      公式：体重(kg)/身高(m)的平方值在18.5-24.9之间属于正常。
"""
height = float(input("体重："))
weight = float(input("身高："))

if 18.5<= height/(weight**2) <= 24.9:
    print("正常")
else:
    print("不正常")

