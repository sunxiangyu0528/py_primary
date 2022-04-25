"""
======================
Author: 柠檬班-小简
Time: 2022/1/5 21:30
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
自动的关闭文件
with open() as fs:
    对文件的操作- 读和写

"""
# 打开文件 ，操作完成，关闭文件。
with open(r"E:\Pychram-Workspace\py47-编码技术\day9\study.txt", mode="a", encoding="utf-8") as fs:
    fs.write("\n")
    fs.write("虎虎虎虎虎虎虎虎虎虎虎虎虎虎虎")
    fs.writelines(["1111\n","True\n","2222\n"])