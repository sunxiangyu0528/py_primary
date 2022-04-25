"""
======================
Author: 柠檬班-小简
Time: 2021/8/18 20:14
Project: py43-python编程技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
函数与方法：
   类当中定义的函数，叫做方法
   不在类当中定义的函数。


一定要有实例化对象才能访问的。
实例属性：
    定义的时候：self.属性名 = 值
    调用的时候：对象名.属性名
实例方法：
    定义的时候：方法的第一参数是self
    调用的时候：对象名.方法名(有参传参)

在实例方法当中，可不可以通过self调用其它的实例方法？？？
可以
注意：方法不要互相调用


实例属性，都在__init__方法中定义初始值。
实例方法，第一个参数必须是self。在实例方法当中，可以修改实例属性的值。

"""
# 创建一个类型出来了
# 定义类(不知道未来的对象是谁？ - self就代表对象，拥有属性和行为)
class Dog:

    kind = "狗"
    # 魔术方法 - 不需要主动调用，在实例化对象的同时会自动调用。
    # 初始化函数、构造函数
    # 实例的属性，一般都是在__init__内部通过self.属性名 = 值
    # 其它的方法(参数第一个为self)当中可以直接通过self.属性名去访问。
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

# 参数形参名：数据类型/类名。申明/希望你传进来的是一个字符串。
def hello(object_name: str):
    print(object_name)
    res = object_name.split(" ")
    print(res)

hello("hello world 666")
# # 调用实例方法
# xxf_dog.eat("狗粮")
# xxf_dog.drink()
# print(xxf_dog.kind)
# # 访问实例属性
# print(xxf_dog.color)
# print(xxf_dog.kind)

