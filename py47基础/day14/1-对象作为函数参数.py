"""
======================
Author: 柠檬班-小简
Time: 2022/1/14 19:27
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
4、类的对象，可以作为函数的参数吗？ -- int/str/float/list/tuple/dict也是类。
     当然是可以的。
     函数内部，能否通过对象点调用实例方法/属性？
     可以
"""
class Dog:

    def __init__(self, kind, name, color, age=1):
        self.kind = kind  # 属性赋值
        self.name = name  # 属性赋值
        self.color = color  # 属性赋值
        self.age = age  # 属性赋值
        self.sex = None # 当属性的初始值不确定的时候，可以设置为None

    # 狗的行为：吃
    def eat(self, food):
        print("{} 狗要吃 {}！！！".format(self.name, food))

    def drink(self):
        self.bark()
        print("狗要喝水了！！！")
        self.sex = "未知"  # 实例方法当中修改实例属性

    def bark(self):
        print("狗嗷嗷的叫！！！")
        print("注意警惕！！")

# 小小菲的狗 - 泰迪、棕色、summer、一岁、母的
xxf_dog = Dog("泰迪", "summer", "棕色", 2)

# 参数形参名类型：类名。申明/希望你传进来的是这个类的对象。
def hello(object_name: Dog):
    print(object_name)
    res = object_name.bark()
    print(res)

hello(xxf_dog)


# # 参数形参名类型：数据类型/类名。申明/希望你传进来的是一个字符串。
# def hello(object_name: str):
#     print(object_name)
#     res = object_name.split(" ")
#     print(res)
#
# hello("hello world 666")


