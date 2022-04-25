"""
======================
Author: 柠檬班-小简
Time: 2021/8/18 20:48
Project: py43-python编程技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
访问权限：
类/对象的属性/方法，对象都可以访问。

修改权限：
实例方法修改实例属性、类方法修改类属性。



类属性:
    定义：直接在类名之后，通过 变量名 = 值  定义。
    访问：类/对象都可以访问。但是，对象不能更改类属性值。
    class By:
        LEVEL = 11
        BUG = 12
    print(By.LEVEL)
    
类方法:
    @classmethod   
    def 方法名(cls): # cls class的简称。代码当前类本身
        pass
    

实例方法和类方法、静态方法有什么区别？
1、第一个参数：实例方法是self,类方法是cls,静态方法没有必传参数。 
2、类方法用@classmethod装饰。静态方法用@staticmethod装饰。
3、实例方法，一定要有对象能访问。
   类方法，不需要对象直接类名访问,类和对象都可以访问。
   静态方法，对象和类都可以访问。


静态方法：
     @staticmethod   
    def 方法名(): 
        pass
    普通函数，没有必传的参数。
    只是放在类中定义，通过类名/对象名调用。
    
"""

# def static_action_func():
#     print("我是一个跟类和对象都没有啥关系的函数。仅仅是放在类内容，供送遣！")

# 创建一个类型出来了
# 定义类(不知道未来的对象是谁？ - self就代表对象，拥有属性和行为)

class Dog:

    # 类属性
    category = "狗"

    # 类方法
    @classmethod
    def update_class_attr(cls):
        # 更改类属性。类名.属性名 = 值
        cls.category = "大狗狗"

    # 静态方法
    @staticmethod
    def static_action():
        print("我是一个跟类和对象都没有啥关系的函数。仅仅是放在类内容，供送遣！")

    # 魔术方法 - 不需要主动调用，在实例化对象的同时会自动调用。
    # 初始化函数、构造函数
    # 实例的属性，一般都是在__init__内部通过self.属性名 = 值
    # 其它的方法(参数第一个为self)当中可以直接通过self.属性名去访问。
    def __init__(self, kind, name, color, age=1):
        self.kind = kind  # 属性赋值
        self.name = name  # 属性赋值
        self.color = color  # 属性赋值
        self.age = age  # 属性赋值
        # sex = "公"


    # 狗的行为：吃
    def eat(self, food):
        print("{} 狗要吃 {}！！！".format(self.name, food))

    def drink(self):
        self.bark()
        print("狗要喝水了！！！")

    def bark(self):
        print("狗嗷嗷的叫！！！")
        print("注意警惕！！")

    # 实例方法改实例属性
    def update(self, new_name):
        self.name = new_name

if __name__ == '__main__':

    # 实例化类 =》 对象/实例
    # 对象名 = 类名()

    # 小小菲的狗 - 泰迪、棕色、summer、一岁、母的
    xxf_dog = Dog("泰迪", "summer", "棕色", 2)
    print("===========   类方法修改类属性   =================")
    print(xxf_dog.category)
    Dog.update_class_attr()
    print(xxf_dog.category)
    print("===========   类/对象  都可以访问静态方法   =================")
    Dog.static_action()
    xxf_dog.static_action()

    print("=========== 对象   访问实例属性/实例方法  =================")
    # # 调用实例方法
    # xxf_dog.eat("狗粮")
    # xxf_dog.drink()
    # # 访问实例属性
    # print(xxf_dog.color)
    # print(xxf_dog.kind)
    # print("=========== 对象/类   访问类属性  =================")
    # # 对象访问类属性
    # print(xxf_dog.category)
    # # 类名访问类属性
    # print(Dog.category)
    # print("=========== 对象/类   对象不能更改类属性的值，但是可以更改对象的属性值  =================")
    # # 对象修改 类同名属性
    # xxf_dog.category = "狗狗"
    # # 对象访问类属性
    # print("通过对象名，访问类的同名属性：", xxf_dog.category)
    #
    # # 类名访问类属性
    # print("通过类名，访问类属性：", Dog.category)
    # # 小简家的狗 - 串串、米白色、钱罐、1岁半
    # xj_dog = Dog("串串", "钱罐", "米白色", 1.5)
    # print(xj_dog.category)


