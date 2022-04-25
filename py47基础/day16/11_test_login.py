"""
======================
Author: 柠檬班-小简
Time: 2022/1/21 20:28
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""

import unittest
from day16.login import login_check

class A:
    pass
a = A()

# setupClass teardownClass
# 类下面的所有用例，只做一次准备工作，清理工作。
# 夹心饼干-夹了1个类   准备工作  类下面的所有用例全部完成  清理工作。
# setup teardown
# 夹心饼干-夹了1个用例   准备工作 类下的第一个用例  清理工作
# 夹心饼干-夹了1个用例   准备工作 类下的第二个用例  清理工作
# 夹心饼干-夹了1个用例   准备工作 类下的第三个用例  清理工作
# 夹心饼干-夹了1个用例   准备工作 类下的第.......个用例  清理工作

class TestLogin(unittest.TestCase):

    def test_login_0_ok(self):
        print("------ 用例1：登陆成功  -------")
        # 用例步骤  执行之后，得到的实际结果。
        # 用例 - 实际结果与期望结果的比较。 - 断言。
        # 一定知道期望结果是什么。assert
        # 用例步骤，得到实际结果
        res = login_check('python47', 'lemonban')
        # 实际与期望的断言
        self.assertEqual(res, {"code": 0, "msg": "登录成功"})
        # # isinstance  某某对象是否为某类的对象。
        # self.assertIsInstance(a,A)
        # self.assertIsNotNone(res)

    def test_login_fail_1_wrong_user(self):
        print("------ 用例2：登陆失败，用户名错误  -------")
        # 用例步骤，得到实际结果
        res = login_check('python4777', 'lemonban')
        # 实际与期望的断言
        self.assertEqual(res,{"code": 1, "msg": "账号或密码不正确"})

    def test_login_fail_2_wrong_passwd(self):
        print("------ 用例3：登陆失败，密码错误  -------")
        # 用例步骤，得到实际结果
        res = login_check('python47', 'lemonban666')
        # 实际与期望的断言
        self.assertEqual(res, {"code": 1, "msg": "账号或密码不正确"})

    # @classmethod
    # def setUpClass(cls):
    #     print("====  准备测试类级别的帐号，不一定要有  ====")
    #
    # @classmethod
    # def tearDownClass(cls):
    #     print("====  测试类级别的清理工作，不一定要有 ====")
    #
    # def setUp(self) -> None:
    #     print("*****  开始执行用例  *****")
    #
    # def tearDown(self) -> None:
    #     print("*****  用例结束  *****")


class TestABC:
    pass

