"""
======================
Author: 柠檬班-小简
Time: 2021/12/22 19:15
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
排序 列表名.sort() 升序    列表名.sort(reverse=True) 降序
    sorted(列表名)   升序     sorted(列表名,reverse=True)   降序
反转  列表名.reverse()    列表名[::-1]

最大最小  min(列表名) - 获取列表的最小值    max(列表名) - 获取列表的最大值
列表1 + 列表2   合并成新列表
列表 * n  列表里的内容重复n次

应用场景：列表主要是用来存储同一数据类型的多个数据。
"""
#
list_num = [34,123,55,67,23,11,3,88]
list_str = ["py", "47", "nmb"]
new_list = list_num + list_str
print(new_list)
print(list_str * 4)

# # 最大值
# print(min(list_num))
# print(max(list_num))

# 排序(从小到大，从大到小) - 针对数字 - 冒泡排序
# # 升序排序 -- 修改了列表
# list_num.sort()
# print(list_num)
# # 降序排序
# list_num.sort(reverse=True)
# print(list_num)

# # 内置功能 - sorted()  升序   sorted(reverse=True)  - 不会修改列表本身
# print(sorted(list_num,reverse=True))
# print(list_num)


# 列表反转
# 方式一  -- 仅仅是读取列表数据，没有对列表进行修改。
# new_list = list_num[::-1]
# print(new_list)
# print(list_num)
# # 方式二 -- 对列表本身做了修改
# list_num.reverse()
# print(list_num)