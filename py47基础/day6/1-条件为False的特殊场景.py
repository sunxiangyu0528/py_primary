"""
======================
Author: 柠檬班-小简
Time: 2021/12/27 20:28
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
默认是False：0 "" {}  [] ()  None  False

"""
a = ()

if a:
    print("元组不为空")
else:
    print("元组为空！")

"""
1、用户输入
2、有效值：0-7   无效值：提示。
3、对于有效值：
   0,break
   1-5,周一到周五   6-7 周末
   1 周一  2 周二
"""

weekday = {"1": "周一", "2": "周二", "3": "周三", "4": "周四", "5": "周五", "6": "周末", "7": "周末"}
while True:
    day = input("请输入1-7七个数字，分别代表周一到周日：")
    if day == "0":
        print("退出程序！")
        break
    if day in weekday.keys():
        print(weekday[day])
    else:
        print("输入有误，请重新输入！")

# 运行程序，检测你写的代码有没有bug。多设计场景去测试你自己的代码。
