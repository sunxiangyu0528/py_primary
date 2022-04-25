"""
======================
Author: 柠檬班-小简
Time: 2021/12/18 20:45
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
最终要输出的字符串有些内容是变动的，不是固定的。
1、格式化(占位符)：
    format    占位符{}
    字符串.format()
    print("我的幸运浮点数是: {}".format(num1))
2、f表达式
    f"字符串(变量)"
    print(f"哈罗，大家好，我是{name},我在{city}")
"""

# name = input("你的名字：")
# city = input("你的城市：")
# # print("哈罗，大家好，我是%s,我在%s" % (name,city))
# # 1 - 最常用的。
# print("哈罗，大家好，我是{},我在{}".format(name,city))
# # 2 -
# print("哈罗，大家好，我是{},我出生于{},我在{}工作。".format(name,city,city))
# print("哈罗，大家好，我是{0},我出生于{1},我在{1}工作。".format(name,city))
# print("哈罗，大家好，我是{0},我出生于{0},我在{0}工作。".format(name))
# # print("哈罗，大家好，我是{name},我出生于{city},我在{city}工作。".format(name=name,city=city))

# 3、指定浮点数的显示位数
num1 = 5.12365677
percent = 0.0789034
print("我的幸运浮点数是: {}".format(num1))
print("我现在的身价是：{:.3f}".format(num1))
print("我理财收益率是：{:.2%}".format(percent))  # 输出百分比。


# f表达式
name = input("你的名字：")
city = input("你的城市：")

# 1 - 最常用的。
# print("哈罗，大家好，我是{},我在{}".format(name,city))
print(f"哈罗，大家好，我是{name},我在{city}")
# 2 -
print(f"哈罗，大家好，我是{name},我出生于{city},我在{city}工作。")
print(f"我现在的身价是：{num1:.3f}")
print(f"我理财收益率是：{percent:.2%}")