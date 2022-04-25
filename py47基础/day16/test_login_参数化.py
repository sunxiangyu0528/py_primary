"""
======================
Author: 柠檬班-小简
Time: 2022/1/21 20:28
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
1、所有用例的步骤是一样的，只是步骤当中的数据不一样的
2、所有用例的断言方法是一样的，只是断言的期望数据不一样。

应用场景：流程是一样的，多组数据不一样。 ==  ddt
DDT  Data Driven Test 数据驱动测试。
python有一个第三方库：ddt

1、疏理流程出来
2、把多组数据拎出来。
把多组数据当中的每一组，传递给流程，即每一组数据都要把这个流程跑一遍。

for循环实现：
1）只会当作一条用例。
2）当用例失败的时候，很难快速定位是哪一条数据造成的。
3）当某个数据执行流程失败的时候，后面的数据就都不会执行了。

ddt模块，解决以上问题
0）安装ddt    pip install ddt
1）导入ddt   import ddt 或者  from ddt import ddt,data
2）如果是from ddt import ddt,data，在测试类上面@ddt
3）在要参数的测试函数上面，@data(*多组数据对象)
   @ddt
   class TestA:
   
       @data(*数据组)
       def test_abc(self,变量-接收每一组数据)


unittestreport当中，对于ddt进行了修改
用法如下：
1）安装unittestreport
2) 导入：from unittestreport import ddt, list_data
3) 在测试类名上面@ddt
4）在测试方法上面 @list_data(数据组)
@ddt
class TestA:

   @list_data(数据组)  # 注意没有*
   def test_abc(self,变量-接收每一组数据)
"""
import unittest
# import ddt
# from ddt import ddt,data
from unittestreport import ddt, list_data

from day16.login import login_check


datas = [
    ('python47', 'lemonban', {"code": 0, "msg": "登录成功"}),
    ('python4777', 'lemonban', {"code": 1, "msg": "账号或密码不正确11"}),
    ('python47', 'lemonban666', {"code": 1, "msg": "账号或密码不正确"})
]

@ddt
class TestLogin(unittest.TestCase):

    # unittestreport中的ddt的使用机制  @list_data(数据组) 注意没有*
    @list_data(datas)
    def test_login_process(self, case_data):
        # 用例步骤，得到实际结果
        res = login_check(case_data[0], case_data[1])
        # 实际与期望的断言
        self.assertEqual(res, case_data[2])

    # 第三方库ddt的使用机制
    # @data(*datas)
    # def test_login_process(self,case_data):
    #     # 用例步骤，得到实际结果
    #     res = login_check(case_data[0], case_data[1])
    #     # 实际与期望的断言
    #     self.assertEqual(res, case_data[2])

    def test_hello(self):
        pass


    # def test_login_process(self):
    #     for case_data in datas:
    #         # 用例步骤，得到实际结果
    #         res = login_check(case_data[0], case_data[1])
    #         # 实际与期望的断言
    #         self.assertEqual(res, case_data[2])

    # def test_login_0_ok(self):
    #     print("------ 用例1：登陆成功  -------")
    #     # 用例步骤，得到实际结果
    #     res = login_check('python47', 'lemonban')
    #     # 实际与期望的断言
    #     self.assertEqual(res, {"code": 0, "msg": "登录成功"})

    # def test_login_fail_1_wrong_user(self):
    #     print("------ 用例2：登陆失败，用户名错误  -------")
    #     # 用例步骤，得到实际结果
    #     res = login_check('python4777', 'lemonban')
    #     # 实际与期望的断言
    #     self.assertEqual(res,{"code": 1, "msg": "账号或密码不正确"})

    # def test_login_fail_2_wrong_passwd(self):
    #     print("------ 用例3：登陆失败，密码错误  -------")
    #     # 用例步骤，得到实际结果
    #     res = login_check('python47', 'lemonban666')
    #     # 实际与期望的断言
    #     self.assertEqual(res, {"code": 1, "msg": "账号或密码不正确"})

