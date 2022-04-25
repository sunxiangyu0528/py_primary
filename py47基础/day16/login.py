"""
============================
Project: py47
Author:柠檬班-木森
Time:2022/1/19 20:37
E-mail:3247119728@qq.com
Company:湖南零檬信息技术有限公司
Site: http://www.lemonban.com
Forum: http://testingpai.com 
============================
"""


def login_check(username=None, password=None):
    """
    登录校验的函数
    :param username: 账号
    :param password:  密码
    :return: dict type
    """
    if username and password:
        if username == 'python47' and password == 'lemonban':
            return {"code": 0, "msg": "登录成功"}
        else:
            return {"code": 1, "msg": "账号或密码不正确"}
    else:
        return {"code": 1, "msg": "所有的参数不能为空"}


if __name__ == '__main__':
    """
    1、账号密码正确 
    入参：账号python47  密码lemonban     
    预期结果：{"code": 0, "msg": "登录成功"}
    实际结果：
    """
    # 调用功能函数，获取实际结果
    # result = login_check('python47', "lemonban")  # 如果是做接口测试（调用接口）
    #
    # excepted = {"code": 0, "msg": "登录成功"}
    # if result == excepted:
    #     print("用例执行通过")
    # else:
    #     print("用例执行未通过")
