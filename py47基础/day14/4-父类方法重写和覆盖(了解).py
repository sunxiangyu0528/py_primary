"""
======================
Author: 柠檬班-小简
Time: 2022/1/14 21:12
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
子类与父类的【同名】方法： 重写
2、对于继承的某此方法，
   1）完全覆盖父类的实现方式。
      
   2）与父类同名方法，但是保留父类的所有代码，新增其它的代码。
      super关键字，调用父类的同名方法。
      # super().父类的同名方法
      面试题：子类和父类有同名方法，当子类要调用父类的同名方法时，要用什么方式？
  
子类对象调用方法时，优先自己的，自己没有，才去用父类的。
"""
class Parent:

    def __init__(self, name, age):
        self.name = name
        self.age = age
        self.private_money = 0

    def save_priveate_money(self, money):
        print(f"藏私房钱了....藏了{money}元")
        self.private_money += money
        print(f"藏私房一共有{self.private_money}元")

    def earn_money(self, do_work, salary):
        print(f"{self.name}从事{do_work}工作")
        print(f"{self.name}通过这个工作，每个月赚{salary}元")


class Son(Parent):

    def use_private_money(self):
        print(self.private_money)
        # self.save_priveate_money(1000)
        # super().save_priveate_money(1000)

    # # 与父类同名方法，但是保留父类的所有代码，新增其它的代码。
    # # super关键字，调用父类的同名方法。
    # def earn_money(self, do_work, salary, other_work, other_money):
    #     # super().父类的同名方法
    #     super().earn_money(do_work,salary)
    #     print("开启副业，赚外快....")
    #     print(f"{self.name}的副业是做 {other_work} 工作")
    #     print(f"{self.name}通过这个副业，每个月赚{other_money}元")

    # # 跟父类的同名方法。然后完全重写。
    # def earn_money(self,do_work, salary):
    #     print("开启创业模式")
    #     print(f"创业是：{do_work}")
    #     print(f"创业的年收入是：{salary}")



s = Son("子类", 25)
s.earn_money("物联网项目 - 开店", 150000)