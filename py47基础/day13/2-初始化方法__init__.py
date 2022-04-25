"""
======================
Author: 柠檬班-小简
Time: 2022/1/10 21:04
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
编程里面：
1、别人写好的类 - 提供了一系列的功能。 你作为使用者，你要去创造对象，去使用功能。
2、自己去写类，然后再去创造对象，再去使用。
定义类的语法：
class 类名(大驼峰命名):
    属性 - 变量
    功能 - 函数(function)实现的。 在类当中，叫方法(method)。
          __init__() --  初始化方法(方法名固定)

类的实例化 - 对象
变量名(对象名) = 类名()
1个类 = 可以创造多个对象。

定义类的时候：
    参数self: 代表的是对象本身。在定义时不确定对象是谁，用self表示。
             在通过对象调用的时候，self=具体的对象名
    提问：既然self代表对象本身，请问，在类内部，能否通过self访问对象的所有方法？
         可以！
         类内容，但凡是有self参数的方法，全部都可以访问。
                也可以通过self访问对象的所有属性

def __init__(self)  
初始化方法：不需要你手动调用。它是自动调用的。在什么时候呢？在你创建对象的同时就调用了。
初始化方法的参数，在实例化对象的同时，要传参。

问题：对象的所有属性定义，建议全部在初始化方法当中...为什么不在其它的方法中定义？？

"""


# pep8编码规范：类名与上面的内容之间，空2行。类内部方法之间，空1行。
class MyAtmV2:

    # 类属性
    atm_money = 10000

    @classmethod
    def update_class_property(cls):  # 类方法
        cls.atm_money = 12000

    @staticmethod
    def bank():  # 静态方法
        pass

    # 前提条件！！！ 只有这个前提条件满足了，才可以用后面的 --- 初始化。
    def __init__(self, card, passwd,left_money):
        if len(card) != 10 or len(passwd) != 6:
            print("您的卡号不是10位，或者密码不是6位")
        else:
            # 设置对象的属性。 self.属性名 = 值
            self.card = card
            self.left_money = left_money

    # def set_object_property(self,card):
    #     # 没有调用此方法，就没法给对象设置以下三个属性。
    #     self.card = card
    #     self.passwd = 123456
    #     self.flag = None

    # 取钱
    def get_money(self, left_money, to_be_geted_money):
        """
        取钱：卡号正确(10位)，密码要正确(6位)，有钱(>100)。atm也得有钱。
        :return:
        """
        # 通过self对象，访问对象的其它方法。
        # self.prepare(card,passwd)
        if left_money < 100:
            print("您的余额少于100")
            return
        print("可以取钱了...")
        if to_be_geted_money > left_money:
            print(f"您的余额不足，取不出{to_be_geted_money}")
            return
        print("取钱成功....")
        print(f"您的{self.card}卡余额还剩：{left_money - to_be_geted_money}")

    # 存钱
    def save_money(self, saved_money):
        # # 通过self对象，访问对象的其它方法。
        # self.prepare(card, passwd)
        if saved_money % 100 != 0:
            print("请存100的整数倍金额！")
            return
        # 存钱上限是多少
        print("可以存钱了。。。")
        # 卡的余额增加 -- 可以改变对象的属性值
        self.left_money += saved_money
        print(f"您的{self.card}上的余额目前变更为：{self.left_money}")

    # 查询
    def see_money(self):
        # # 通过self对象，访问对象的其它方法。
        # self.prepare(card, passwd)
        print(f"您的{self.card}上的余额目前为：{self.left_money}")

# 访问类属性
# print(MyAtmV2.atm_money)
# MyAtmV2.update_class_property()
# print(MyAtmV2.atm_money)
# 实例访问类属性、类方法
ch_gs_atm = MyAtmV2("1234567890", "123456", 5000)
print(ch_gs_atm.atm_money)
ch_gs_atm.update_class_property()
print(ch_gs_atm.atm_money)

# # 实例访问类属性、类方法
# my_atm = MyAtmV2("1231231211", "120000", 10000)
# print(my_atm.atm_money)

# ch_gs_atm = MyAtmV2("1234567890","123456",5000)
# # 查询余额
# ch_gs_atm.see_money()
# # 存钱
# ch_gs_atm.save_money(2500)
# # 查询余额
# ch_gs_atm.see_money()
