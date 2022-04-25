"""
======================
Author: 柠檬班-小简
Time: 2022/1/7 21:29
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
os模块方法：https://www.runoob.com/python3/python3-os-file-methods.html
operating system 操作系统
windows,mac,linux
listdir()   获取给定目录下的所有文件夹和文件的名字。返回的是个列表。



在某某目录下面，创建一个文件？ -- 目录首先要存在？
os.path模块的方法：https://www.runoob.com/python3/python3-os-path.html

exists: - mypath存在于操作系统当中，返回True
isdir: 判断路径是否为目录。
       首先在操作系统当中要存在，再去确认是否为目录。
isfile：判断路径是否为文件
join(basedir,path1,path2...): 路径拼接。

os.path.abspath(__file__)  获取绝对路径。代码在哪个文件，就获取哪个文件的绝对路径
os.path.dirname(绝对路径)  获取当前文件/目录的父级目录

执行cmd命令
os.system
os.popen
"""
import os

# 我给你一目录，请收集有多少个文件夹，多少个文件。
# 获取目录下所有的名字。
mypath = r'E:\Pychram-Workspace\py47-编码技术'
path_names = os.listdir(mypath)
file_counts = 0
dir_counts = 0
for name in path_names:
    # 路径拼接 - os.path.join()
    fullpath = os.path.join(mypath, name)
    # print(ntpath.join(mypath, "小简", "2022", name))
    if os.path.isfile(fullpath):
        file_counts += 1
    if os.path.isdir(fullpath):
        dir_counts += 1

print(file_counts)
print(dir_counts)


# 写明的路径，没法跨操作系统。动态获取路径？
fullpath = os.path.abspath(__file__)
print(fullpath)

# 当前文件所在的包
mydir = os.path.dirname(fullpath)
print(mydir)

project_dir = os.path.dirname(mydir)
print(project_dir)

# project_dir = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
res = os.system("python --version")
print(res)

