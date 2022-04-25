"""
======================
Author: 柠檬班-小简
Time: 2022/1/21 22:07
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
import unittestreport
import unittest

s = unittest.defaultTestLoader.discover(r"E:\Pychram-Workspace\py47-编码技术\day16")

runner = unittestreport.TestRunner(s)
runner.run()