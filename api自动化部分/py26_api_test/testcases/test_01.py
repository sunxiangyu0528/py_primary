import unittest


class TestDemo(unittest.TestCase):

    def test_01(self):
        print("test01")

    def test_02(self):
        print("test02")


if __name__ == '__main__':
    suite = unittest.TestSuite()
    suite.addTest(TestDemo())
    # loader = unittest.TestLoader()