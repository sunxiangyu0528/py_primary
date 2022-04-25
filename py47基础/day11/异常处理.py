"""
======================
Author: 柠檬班-小简
Time: 2022/1/8 20:27
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
什么是异常？

在异常抛出来之前，需要捕获一下，做一些额外的处理。处理完成之后，根据情况抛还是不抛出来。
拦截
代码   可能出问题做处理    python
你    拦截      测试总监

try:
    可能会报错的代码
[except Exception as e:
    如果try里的代码抛异常了，则执行此处的代码逻辑。
except xxxxError as e:
    如果try里的代码抛异常了，则执行此处的代码逻辑。]
except:
     如果try里的代码抛异常了，则执行此处的代码逻辑。
else:
    如果try里的代码没有抛异常，就接着执行此处的代码。 
finally:
    不管try里有没有异常，一定会执行此处的代码。  --- 收尾或者清理的工作。 
    
把异常拦截掉了，没有上报到python，所以程序执行的时候，你在控制台看不到异常报错。
1、把异常信息在控制台输出来

把异常拦截，处理完成之后，上报给python
raise

    
"""
import os

# mypath = r'E:\Pychram-Workspace\py47-编码技术\2022'
# path_names = os.listdir(mypath)

# 输入2个数字，输出相除的结果。
try:
    num1 = int(input("请输入数字1："))
    num2 = int(input("请输入数字2："))
except:
    print("输入的不是数字,请都输入数字 --- 类型")
    raise

# except TypeError as e:
#     print("输入的不是数字,请都输入数字 --- 类型")  # 你捕获到异常后，你做的处理。
#     print(e)
# except ValueError as e:
#     print("输入的不是数字,请都输入数字  -- value")  # 你捕获到异常后，你做的处理。
#     print(e)
# except Exception as e:
#     print("出错了")
#     print(e)

else:
    if num2 == 0:
            print("除数不能为0！")
    else:
        print(num1/num2)
finally:
    print("一定会执行的我！！！！")

print("程序结速！！！！")


# if num1.isdigit() and num2.isdigit():
#     num1 = int(num1)
#     num2 = int(num2)
#     if num2 == 0:
#         print("除数不能为0！")
#     else:
#         print(num1/num2)
# else:
#     print("输入的不是数字")
#
# print("6666666666666666")