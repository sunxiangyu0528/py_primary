"""
======================
Author: 柠檬班-小简
Time: 2022/1/10 20:08
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
OOP  Object Oriented programming

函数：封装  把一个功能封装起来了。使用者只需要知道功能名字，和参数。
高铁票 - 取票、买票、打印报销凭证、改签
ATM机(一体化) - 取钱、存钱、转帐、查余额、打流水 -- 前提：卡一插，密码一输
商场(一站式) - 买衣服、买首饰、吃饭、看电影、打电子游戏、滑冰、唱歌、书店

更高级的封装：
    不再是针对单一功能，针对功能集合。
    
类和对象
类:  同一类事物的共同特征(属性+功能/行为/能力)描述。抽象的
对象： 是类的某一个具像化。是具体的。
先有类，再有对象。对象是类衍生出来的，是类的具像化。
先定义类

工作 - 106份工作。具体1：城市薪资工作时间岗位名称
人类 - 吃喝拉撒睡(功能)   (属性特征)外貌特征 身高 体重 年龄 名字  是否单身  是否结婚  是否有娃 
ATM机 - 所属银行   干的事情(功能)：取钱、存钱、转帐、查余额、打流水
商场
狗
鸡
宝马
飞机
男朋友
女朋友

编程里面：
1、别人写好的类 - 提供了一系列的功能。 你作为使用者，你要去创造对象，去使用功能。
2、自己去写类，然后再去创造对象，再去使用。
定义类的语法：
class 类名(大驼峰命名):
    属性 - 变量
    功能 - 函数(function)实现的。 在类当中，叫方法(method)。
          __init__() --  初始化方法(方法名固定)
"""




class MyAtm:

    # 面临的问题：每一个方法里面，都有对card,passwd的统一判断处理。
    # 代码重复了。那可不可以只写一个方法，就对card,passwd的统一判断处理
    # 如果不处理，函数放在类内部，和放在类外面，没有什么区别。

    # 取钱
    def get_money(self,card,passwd,left_money,to_be_geted_money):
        """
        取钱：卡号正确(10位)，密码要正确(6位)，有钱(>100)。atm也得有钱。
        :return:
        """
        if len(card) != 10 or len(passwd) != 6 or left_money < 100:
            print("您的卡号不是10位，或者密码不是6位，或者余额少于100")
            return
        print("可以取钱了...")
        if to_be_geted_money > left_money:
            print(f"您的余额不足，取不出{to_be_geted_money}")
            return
        print("取钱成功....")
        print(f"您的余额还剩：{left_money - to_be_geted_money}")

    # 存钱
    def save_money(self,card,passwd,saved_money):
        if len(card) != 10 or len(passwd) != 6:
            print("您的卡号不是10位，或者密码不是6位")
            return
        if saved_money % 100 != 0:
            print("请存100的整数倍金额！")
            return
        # 存钱上限是多少

    # 转帐
    def give_money_out(self,card,passwd,left_money,other_card,out_money):
        if len(card) != 10 or len(passwd) != 6 or left_money < 100:
            print("您的卡号不是10位，或者密码不是6位，或者余额少于100")
            return

    # 查询
    def see_money(self,card,passwd):
        if len(card) != 10 or len(passwd) != 6:
            print("您的卡号不是10位，或者密码不是6位")
            return

    # 打印帐单
    def print_payment(self,card,passwd):
        if len(card) != 10 or len(passwd) != 6:
            print("您的卡号不是10位，或者密码不是6位")
            return




def get_money(card,passwd):
    pass

def save_money(card,passwd):
    pass

def give_money_out(card,passwd):
    pass

def see_money(card,passwd):
    pass

def print_payment(card,passwd):
    pass
