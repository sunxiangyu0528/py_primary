"""
======================
Author: 柠檬班-小简
Time: 2022/1/14 21:54
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
# 判断一个对象，是否为某一个类的对象。
isinstance(对象名, 类名))
# 子类的对象，也是父类的对象。

多态：父类类型，接收子类对象。
java:定义函数的任何参数，必须指明类型。在java当中一定是在继承的情况下会用。

python可以说是没有动态，也可以说是处处皆多态。
python当中：鸭子类型


"""

class Base:
    def __init__(self, kind, name):
        self.kind = kind  # 属性赋值
        self.name = name  # 属性赋值

    def eat(self, food):
        print("{} 要吃 {}！！！".format(self.name, food))

    def drink(self):
        print("要喝水了！！！")

class Dog(Base):

    def __init__(self, kind,name,color, age=1):
        super().__init__(kind,name)
        self.color = color  # 属性赋值
        self.age = age  # 属性赋值
        self.sex = None # 当属性的初始值不确定的时候，可以设置为None

    def eat(self, food):
        print("狗吃",food)

    def bark(self):
        print("狗嗷嗷的叫！！！")
        print("注意警惕！！")

class Cat(Base):

    def __init__(self, kind,name,color, age=1):
        super().__init__(kind,name)
        self.color = color  # 属性赋值
        self.age = age  # 属性赋值
        self.sex = None # 当属性的初始值不确定的时候，可以设置为None



    def bark(self):
        print("狗嗷嗷的叫！！！")
        print("注意警惕！！")

class People:

    def eat(self, food):
        print("人吃", food)

    def __init__(self):
        pass



# 小小菲的狗 - 泰迪、棕色、summer、一岁、母的
xxf_dog = Dog("泰迪", "summer", "棕色", 2)
xxf_cat = Cat("英短", "小白", "黑白色", 3)
# 判断一个对象，是否为某一个类的对象。
# 子类的对象，也是父类的对象。
# print(isinstance(xxf_dog, Dog))
# print(isinstance(xxf_dog, Base))

# 参数形参名类型：类名。申明/希望你传进来的是这个类的对象。
def hello(object_name):
    print(object_name)
    # 调用object_name的eat方法。
    # python当中只要传进来的参数，有eat这个方法。就可以了。
    res = object_name.eat("美食")
    print(res)

# hello(xxf_dog)
# hello(xxf_cat)
hello(People())
