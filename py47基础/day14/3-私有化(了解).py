"""
======================
Author: 柠檬班-小简
Time: 2022/1/14 20:52
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
继承面临的问题:
    1、如果父类有不想被继承的，怎么办？ --如何私有化

私有化：
    _属性名/方法名:    
        不是强制私有。实际上通过对象/子类对象名都是可以访问的。子类对象名/子类的self.私有属性
        子类可以继承。
        潜规则：希望大家都遵守，但我不强制。
    
    __属性名/方法名:
      父类的私有方法，子类不能访问。父类的对象也不可以访问。
      只有父类内部能访问，父类内部实现可以通过self.__属性名/方法名。

类 - 功能集封装。
开放功能给别人用。别人怎么访问。通过对象。
"""


class Parent:

    def __init__(self, name, age):
        self.name = name
        self.age = age
        self.__private_money = 0

    def save_priveate_money(self, money):
        print(f"藏私房钱了....藏了{money}元")
        self.__private_money += money
        print(f"藏私房一共有{self.__private_money}元")

    def earn_money(self, do_work, salary):
        print(f"{self.name}从事{do_work}工作")
        print(f"{self.name}通过这个工作，每个月赚{salary}元")


class Son(Parent):

    def use_private_money(self):
        print(self.__private_money)



# 继承：父类的所有属性和方法(除了私有化以外的)，子类都全部拥有。
s = Son("子类", 18)
s.save_priveate_money(200)
s.save_priveate_money(200)
s.earn_money("刷碗", 3000)

# 子类对象，访问父类的__开头的私有属性，报错。
# s.use_private_money()
# 父类对象，直接访问__开头的私有属性，报错。
# print(Parent("父类", 55).__private_money)

