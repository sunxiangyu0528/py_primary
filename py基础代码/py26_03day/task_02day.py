"""
============================
Author:柠檬班-木森
Time:2019/12/26
E-mail:3247119728@qq.com
Company:湖南零檬信息技术有限公司
============================
"""

# --------------第一题---------
"""
1、写一段代码，运行的时候在控制台依次提示提输入姓名，年龄、性别
最终在控制台按照以下格式输出  
"""
# 用户输入
name = input("请输入姓名：")
age = input("请输入年龄：")
gender = input("请输入性别：")
# 输出到控制台
print("********************")
print("姓名：", name)
print("年龄：", age)
print("性别：", gender)
print("********************")

# --------------第二题---------
"""
2、请描述一下标识符的命名规范，和有哪几种命名风格？（简单题）

命名规范：
    1、由数字、字母、下划线组成，并且不能用数字开头
    2、不能使用python中的关键字作为标识符
命名风格：
    下划线命名法
    大驼峰命名法
    小驼峰命名法
"""

# --------------第三题---------
"""
3、现在有变量 a = ‘hello’ ,    b = ‘python18’     c = ‘!’  
通过相关操作转换成字符串：'hello python18 !'（注意点:转换之后单词之间有空格）
"""

a = "hello"
b = "python18"
c = "!"
# 拼接字符串
str1 = " ".join((a, b, c))
print(str1)

# --------------第四题---------
"""
4、现在有一个字符串 s = 'abcdefghijk',
    要求一：通过切片获取: defg
    要求二：通过切片获取：cgk
    要求三：通过切片获取：jhf

"""
s = 'abcdefghijk'
# 要求一
s1 = s[3:7]
print(s1)

# 要求二
s2 = s[2::4]
print(s2)

# 要求三
s3 = s[-2:-7:-2]
print(s3)
