"""
============================
Author:柠檬班-木森
Time:2019/12/27
E-mail:3247119728@qq.com
Company:湖南零檬信息技术有限公司
============================
"""
"""
整数和 浮点数转换为字符串：使用str
字符串和 浮点数转换为整数：使用int
整数和 字符串转换为浮点数：使用float

整数和 字符串 浮点数转换为布尔类型：bool

#  注意点：使用字符串 转换为int何float时，字符串的内容必须是数字（不能有字母和符号）

"""

a = 19
b = 11.11

s1 = "999"

print(s1, type(s1))
print(a, type(a))
print(b, type(b))


print('-------转换之后----------')
# 将字符串转换为整数int类型，怎么做
s = int(s1)
print(s,type(s))
#  将字符串转换为浮点类型，怎么做
s2 = float(s1)
print(s2,type(s2))


# 整数和 浮点数转换为字符串
a1 = str(a)
print(type(a1))


# 整数转换为浮点类型
a2 = float(a)
print(type(a2))


#  使用input输入的数据，接收到的都是字符串类型






