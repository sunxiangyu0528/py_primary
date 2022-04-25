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
"""
import os
import ntpath
# print(os.path)

mydir = r'E:\Pychram-Workspace\py47-编码技术\day10'
myfile = r'E:\Pychram-Workspace\py47-编码技术\day10\mylog.txt'

# mypath是否存在
if ntpath.exists(mydir):
    print(ntpath.isdir(mydir))
else:
    print("路径不存在。")

# mypath是否存在
if ntpath.exists(myfile):
    print(ntpath.isfile(myfile))
else:
    print("路径不存在。")


# 我给你一目录，请收集有多少个文件夹，多少个文件。
# 获取目录下所有的名字。
mypath = r'E:\Pychram-Workspace\py47-编码技术'
path_names = os.listdir(mypath)
file_counts = 0
dir_counts = 0
for name in path_names:
    # 路径拼接 - os.path.join()
    fullpath = ntpath.join(mypath, name)
    # print(ntpath.join(mypath, "小简", "2022", name))
    if ntpath.isfile(fullpath):
        file_counts += 1
    if ntpath.isdir(fullpath):
        dir_counts += 1

print(file_counts)
print(dir_counts)


# 写明的路径，没法跨操作系统。动态获取路径？


