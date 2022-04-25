"""
======================
Author: 柠檬班-小简
Time: 2021/12/22 20:45
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
字典(dict)：key-value  键值对
     {}
     {key:value, key1:value1, key2:value2}
     key是不重复的，唯一的。 不可变数据类型，通常都是用字符串。
     通过key去读取值。
     无序的
     value可以是任意类型。

字典是可变类型： 可以进行修改
"""
dict_person_info = {
    "name": "xj",
    "age": 18,
    "city": "长沙",
    "weight": 94
}
print(dict_person_info)

# ===============  字典：成员运算符、len()  ===============
# print(len(dict_person_info))

# key in 字典
# print(18 in dict_person_info)
# print("age" in dict_person_info)

# 获取字典的所有keys,values
# print(dict_person_info.keys())
# print(dict_person_info.values())

# 判断18是否是字典所有values的成员之一
print(18 in dict_person_info.values())
# 判断age是否是字典所有keys的成员之一
print("age" in dict_person_info.keys())

print(dict_person_info.items())
print(("age",18) in dict_person_info.items())



# ===============  字典：删除key-value  ===============
# 方式一： del 字典[key]
# del dict_person_info["age"]
# print(dict_person_info)

# 方式二：字典.pop(key)  字典.popitem()
# dict_person_info.pop("age")
# dict_person_info.popitem()
# print(dict_person_info)

# # 清除字典里的所有key-value - 字典.clear()
# dict_person_info.clear()
# print(dict_person_info)
#
# # del 删除整个字典
# del dict_person_info



# ===============  字典：添加、修改数据  ===============
# 第一种：字典名[key]=value
# 如果key存在，则是修改。如果key不存在，则是添加。
# my_age = 25
# # 修改key-value
# dict_person_info["age"] = my_age
# print(dict_person_info)
#
# # 添加key-value
# # dict_person_info["hobby"] = ("听歌", "睡觉", "看书")
# dict_person_info["hobby"] = ["听歌", "睡觉", "看书"]
# print(dict_person_info)

# 第二种：字典名.setdefault(key,value)
# # key存在，则不做任何修改。 key不存在，则添加key-value.
# dict_person_info.setdefault("age", 25)
# print(dict_person_info)
# dict_person_info.setdefault("hobby", ["听歌", "睡觉", "看书"])
# print(dict_person_info)
#
# # 第三种：字典1.update(字典2)  将字典2合并到字典1当中去
# new_dict = {"sex": "女"}
# dict_person_info.update(new_dict)
# print(dict_person_info)

# ===============  字典：获取数据  ===============
# # 1、字典名[key] - key要存在于字典当中。
# print(dict_person_info["age"])
# # print(dict_person_info["hobby"])  # KeyError: 'hobby'
#
# # 2、字典名.get(key)
# print(dict_person_info.get("age"))
# print(dict_person_info.get("hobby"))  # key不存在的时候，为None


