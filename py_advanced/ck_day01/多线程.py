import threading
import time

# 使用函数的方式创建线程

import threading


# 方法一：
# 在创建线程时必须先定义一个继承threading.Thread的类，然后重写子类中的run()方法，使用start()方法启动线程。
class threadTest(threading.Thread):
    # args为传入线程的参数，可根据自己的需求进行定义
    def __init__(self, args) -> None:
        # 初始化super()内的必须和类名一样
        super(threadTest, self).__init__()
        self.args = args

    # 定义run()方法，主要写线程的执行内容
    def run(self) -> None:
        print('test thread running...')
        print('args: ', self.args)
        return super().run()


def threadTest(arg):
    print("test thread running...")
    print("args: ", arg)


if __name__ == "__main__":
    # target传入函数名，注意不要写参数
    # args target传入的函数需要传入的参数，注意传入参数以元组的形式
    thread = threading.Thread(target=threadTest, args=('just test',))
    # 启动线程
    thread.start()
