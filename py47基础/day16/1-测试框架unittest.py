"""
======================
Author: 柠檬班-小简
Time: 2022/1/21 19:42
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
断言：期望结果与实际结果比对。 assert
     assert 实际与期望的比对表达式(True False)


1、导入unittest模块、被测文件或者其中的类
2、创建一个测试类，并继承unittest.TestCase
3、定义测试函数，函数名以test_开头(表示一个测试用例)。 
4、测试用例中：
            4.1  测试数据、期望结果
            4.2  用例步骤
            4.3  断言

AssertionError: 断言失败的报错。
每条用例之间互不干扰。

用例的执行顺序：用例名称按照 ASCII码的大小规则：0~9<A~Z<a~z



TestSuite
unittest.TestSuite()
均了解即可：
方法一：addTest(测试类名("用例名")) 添加一个测试用例
方法二：addTests([]) 添加一个测试用例的列表

TestLoader
可通过类名、模块名、目录三种方式去收集用例。
方法一：目录(常用)
unittest.TestLoader().discover(搜索目录)     
默认在test*.py中搜索用例
请习惯以test_*.py风格

# HtmlTestRunner

# unittestReport: 
  查看地址：https://gitee.com/lemon-test-official

# BeautifulReport
安装：pip install BeautifulReport
github: https://github.com/TesterlifeRaymond/BeautifulReport



1、用例标题
2、前置条件
3、执行步骤
4、测试数据
5、预期结果

优先级、模块名、编号、实际结果、复现概率、测试人员

Fixture（测试环境创建和销毁）
前置和后置之间夹的是：一个测试用例(肉夹馍)
1、测试用例的准备工作：setup()
2、测试用例的清理工作：teardown()

前置和后置之间夹的是：一个测试类(汉堡包)
@classmethod
3、测试类的准备工作：setupClass()
4、测试类的清理工作：teardownClass()
"""