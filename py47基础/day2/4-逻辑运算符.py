"""
======================
Author: 柠檬班-小简
Time: 2021/12/18 20:30
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
# 用户输入、用户交互
# 变量名 = input(提示信息)。输入完成之后按enter键结束输入。
条件与或非
and  与   真与真=真  
or  或者   假or假=假
not  非    not真=假   not假=真
"""


user_sex = input("请输入你的性别(男or女)：")
user_city = input("请输入你的城市：")

# 与
print(user_sex == "女" and user_city == "长沙")
# 或
print(user_sex == "女" or user_city == "长沙")
# 非
print(not user_sex == "女")


