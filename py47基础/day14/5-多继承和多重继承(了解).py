"""
======================
Author: 柠檬班-小简
Time: 2022/1/14 21:44
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
多继承：一个子类可以继承多个父类。
class 子类(父类1, 父类2.....):
    pass
一般这种情况，父类之间是没有什么关联，独立的，实现不同功能。
涉及：新式类和旧式类。 有兴趣可以了解
     菱形继承问题。

多重继承：
 gggrand - grand - parent - son
"""
class Grand:
    pass

class Parent(Grand):
    pass

class Son(Parent):
    pass

class WaE:
    pass

class Another(Son,WaE):
    pass

