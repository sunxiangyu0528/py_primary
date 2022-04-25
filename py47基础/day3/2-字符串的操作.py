"""
======================
Author: 柠檬班-小简
Time: 2021/12/20 20:24
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
replace - 字符串变量.replace(old,new,cout)  count是指替换的次数，默认-1,是匹配到的全部替换
strip - 去掉字符串左右2边的指定字符，默认是去掉空格。
startswith - 判断字符串是否以指定字符开头。如果是则True，如果不是则False
endswith - 判断字符串是否以指定字符结束。如果是则True，如果不是则False

debug调试方式：
1) 要确定从哪一行开始，程序交到你手里，由你来把控下一行代码的执行
   打断点
2）右键运行，选择debug
"""
welcome = "欢迎大家 ，我们是第47期，老师是#teacher#老师，我也很喜欢#student#老师"

# 字符串变量.replace(old,new,cout)  count是指替换的次数，默认-1,是匹配到的全部替换。
new_str = "雨泽"
new_welcome = welcome.replace("#teacher#", new_str)
print(new_welcome)
new_welcome = new_welcome.replace("#student#", "小马")
print(new_welcome)
print(welcome)


# strip - 去掉字符串左右2边的指定字符，默认是去掉空格。
# lstrip - left 去掉字符串左边的指定字符。  rstrip - right  去掉字符串右边的指定字符。
ss = "1122  66666 6  hell11"
ss1 = " 66666"
ss2 = "66666 "
print(ss)
# res = ss.strip()
# print(res)
res = ss.strip("11")
print(res)

# startwith
print(ss.startswith("22"))
print(ss1.startswith(" "))
sss = "http://www.baidu.com"
print(sss.startswith("http://"))
sss.endswith(".com")