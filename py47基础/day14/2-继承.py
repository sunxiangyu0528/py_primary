"""
======================
Author: 柠檬班-小简
Time: 2022/1/14 19:27
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
继承：父类的所有属性和方法(除了私有化以外的)，子类都全部拥有。

语法：
    class 子类(父类):
        pass
        
继承面临的问题:
    1、如果父类有不想被继承的，怎么办？ --如何私有化
    2、对于继承的某此方法，完全覆盖父类的实现方式。
                       保留父类方法的实现，新增/优化实现方式。
                    
多继承
多重继承
"""
class Parent:

    def __init__(self,name,age):
        self.name = name
        self.age = age
        self.private_money = 0

    def save_priveate_money(self, money):
        print(f"藏私房钱了....藏了{money}元")
        self.private_money += money
        print(f"藏私房一共有{self.private_money}元")

    def earn_money(self,do_work, salary):
        print(f"{self.name}从事{do_work}工作")
        print(f"{self.name}通过这个工作，每个月赚{salary}元")

class Son(Parent):
    pass

# 继承：父类的所有属性和方法(除了私有化以外的)，子类都全部拥有。
s = Son("子类", 18)
s.save_priveate_money(200)
s.save_priveate_money(200)
s.earn_money("刷碗", 3000)

