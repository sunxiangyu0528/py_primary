"""
======================
Author: 柠檬班-小简
Time: 2022/1/5 20:23
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
文件操作：open函数 - 读 写(追加，覆盖重写)  保存
file: 你要操作的文件路径。
mode: 打开文件的模式。读(r-read)？写(w-write)？追加(a-append)？字符串(默认text)？字节(binary)？
      r w a
      rb  wb  ab
      r - 只读(默认)  文件的完整路径，必须在磁盘上存在。不然就会报错FileNotFoundError
encoding: 编码处理。如果有中文，加上utf-8

读取      
read() - 一次性全部读取。
readline() - 读取一行
readlines() - 一次性会部读取，但是按每行读取。返回的是个列表。
"""
# r 取消字符串当中的转义。 - 以只读模式打开。
fs = open(r"E:\Pychram-Workspace\py47-编码技术\day9\hello.txt", encoding="utf-8")
# fs 文件流对象

value = fs.readlines()
print(value)

# # 读取一行
# value = fs.readline()
# print(value)
# # 读取一行
# value =fs.readline()
# print(value)
# # 读取一行
# value =fs.readline()
# print(value)


# # 全部读取出来 - read()
# content = fs.read()
# print("读取所有内容：", content)

# # 接着读取。
# content2 = fs.read()
# print("读完之后的内容：", content2)


