"""
======================
Author: 柠檬班-小简
Time: 2022/1/5 21:37
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
str_old = 'url:/futureloan/mvc/api/member/register@mobile:18866668888@pwd:123456\n'
str_list = ['url:/futureloan/mvc/api/member/register', 'mobile:18866668888', 'pwd:123456']
temp = "url:/futureloan/mvc/api/member/register"
new_dict = {"url":"/futureloan/mvc/api/member/register", "mobile":"18866668888","pwd":"123456"}
"""
strip: 去掉\n
split: @分割 - 列表
       split: :分割 - key value

"""
