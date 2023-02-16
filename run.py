import unittest


# 创建测试套件
suite = unittest.TestSuite()

loader = unittest.TestLoader()
suite.addTest(loader.discover("/Users/sunxiangyu/Desktop/django/py_primary/api自动化部分/py26_api_test/testcases"))

runner=unittest.TextTestRunner()
runner.run(suite)


