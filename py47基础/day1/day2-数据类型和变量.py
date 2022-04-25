"""
======================
Author: 柠檬班-小简
Time: 2021/12/17 21:16
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
数据类型：
字符串(str): 
    双引号括起来的。单引号括起来的。单引号和双引号没有区别。  单行字符串。
    换行的处理：\n(换行)
    多行输出：三引号括起来的。
整数(int)    1 2 3
浮点数(float)  1.23   1.11
复数(complex)
布尔值(boolean)  只有2个值：True False 
当前变量是什么数据类型：type(变量名)

变量
银行帐号 = 10万

你自己
你爸爸
你妈妈
你对象
你儿子
你女儿

变量(标识符) = 数据类型
welcome = "hello world 111 222 "
变量名 = 具体的数据值

1、变量是什么
     1）用来标识数据。
     2）语法：变量名 = 值(数据)

2、变量名的命名规范
     1）由数字、字母、下划线组成
     2）不能以数字开头
     3）不能是关键字(keyword.kwlist)
     4）区分大小写。
     5）见名知意
怎么看关键字有哪些？
import keyword
print(keyword.kwlist)

命名风格: 
1）下划线命名法(python)  welcome_teacher
2）大驼峰命名法 WelcomeTeacher
3）小驼峰命名法welcomeTeacher

"""
# 使用\n换行输出
welcome = "哈罗，python48期"
name = "小简"
hello_world = "hello,world!!!"
num = 1
num2 = 1.2
num1 = "1"
bool_1 = True
bool_0 = False

print(num)
print(num1)
print(bool_1)

# 打印num的数据类型
print(type(num))

# 字符串有引号怎么办？
welcome11 = "hello 'world' 111 222 "
welcome22 = 'hello "world" 111 222 '
# 单双引号有特殊意义的，是字符串的象征。
# 如何把它当作一个普通的内容？ 转义符\+要转义的内容
welcome33 = 'hello \'world\' 111 222 '
welcome44 = "hello \"world\" 111 222 \\ "

# a = 1
# a = 2
# print(a)

# import keyword
# print(keyword.kwlist)