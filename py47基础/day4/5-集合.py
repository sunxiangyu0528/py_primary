"""
======================
Author: 柠檬班-小简
Time: 2021/12/22 21:49
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
集合(set)  
https://www.runoob.com/python3/python3-set.html

面试题: 列表里的元素去重。   先用集合去重，再转回列表。

"""
seta = {1,2,3,34,4}

lista = [12,22,33,22,55,43,12,88,88,88]
# 去重 - 转成集合
setb = set(lista)
print(setb)
# 集合转回列表
new_list = list(setb)
print(new_list)