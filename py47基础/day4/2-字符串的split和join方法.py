"""
======================
Author: 柠檬班-小简
Time: 2021/12/20 20:55
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
split  字符串分割。字符串.split(分隔符),得到的是个列表。
join   字符串拼接。 列表的成员一定是字符串。
*
+
"""
nmb_py47_stu = "de, 十一, 岳取其上, 明xi, 水空流, H"
# 需求：把上面字符串当中，按逗号隔开，把每个人的名字放在列表当中。
# 对字符串进行分割 - 按一定的规律
# split(分隔符)
stu_list = nmb_py47_stu.split(",")
# stu_list = nmb_py47_stu.split(",", 2)
print(stu_list)


# 需求：有一个列表，里面的成员全是字符串。把列表里的成员，按一定的规则拼成一个字符串。
# "拼接符".join(列表)
stu_list = ['de', ' 十一', ' 岳取其上', ' 明xi', ' 水空流', ' H']
new_str = "".join(stu_list)
print(new_str)

# 列表转字符串
stu_str = str(stu_list)
print("列表转成字符串：")
# ‘['de', ' 十一', ' 岳取其上', ' 明xi', ' 水空流', ' H']’
print(stu_str)
print(type(stu_str))


# +
str1 = "hello "
str2 = "world"
print(str1 + str2)

# *
print("*" * 66)
