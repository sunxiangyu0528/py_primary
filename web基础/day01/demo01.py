import pytest


@pytest.fixture()
def test1():
    print('\n开始执行function')


def test_a(test1):
    print('---用例a执行---')

@pytest.mark.usefixtures()
def test_c():
    print('---用例c执行---')


class TestCase:

    def test_b(self, test1):
        print('---用例b执行')