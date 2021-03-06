"""
============================
Author:柠檬班-木森
Time:2019/12/30
E-mail:3247119728@qq.com
Company:湖南零檬信息技术有限公司
============================
"""
"""
列表查找的方法
index:根据元素查找对应的下标（如果找不到对应的元素，会报错）
count:查找某个元素在列表中出现的次数


列表中修改元素值的方法：
通过下标指定元素进行修改


列表中其他的方法：
sort:排序

reverse:列表反向（倒序/反转）

copy:复制列表

内置函数：id(查看数据的内存地址)


"""

# li = [1, 2, 3, 11, 22, 33, 44, 1, 1]

# 根据元素查找对应的下标
# res = li.index(1)
# print(res)

# 查找某个元素在列表中出现的次数
# res2 = li.count(11)
# print(res2)


# 通过下标获取到列表中对应的元素，进行重新赋值
# li[3] = 999
# print(li)


# 列表排序
# li = [234, 12, 4, 33, 5, 6, 766, 7, 33, 4, 12, 444, 667, 32]

# 从小到大进行排序（列表排序时,列表中要全是数值数据）
# li.sort()

# 从大到小进行排序
# li.sort(reverse=True)
# print(li)

# 列表反向（倒序/反转）
# li.reverse()
# print(li)

# li0 = [1, 2, 3]
# li1 = li0
# li2 = [1, 2, 3]
# li3 = li0.copy()
#
# print(li0, id(li0))
# print(li1, id(li1))
# print(li2, id(li2))
# print(li3, id(li3))
