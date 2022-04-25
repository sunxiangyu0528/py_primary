"""
======================
Author: 柠檬班-小简
Time: 2022/1/5 20:57
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

写和追加：
open(文件路径，mode="w",encoding="utf-8")
open(文件路径，mode="a",encoding="utf-8")
若文件不存在，自动创建。
但是，若文件路径的某一个目录不存在，则会报告。不会自动创建目录。
w: 文件会被全部覆盖
a: 在文件原有的内容上，往后面继续写入内容。
只写入，不读取。

write(你要写入的内容) - 手动加上换行\n
writelines(列表) 列表里的成员都是字符串，手动加上换行\n
"""
# 打开文件的时候，会清除文件里的内容。
# fs = open(r"E:\Pychram-Workspace\py47-编码技术\day9\study.txt", mode="w", encoding="utf-8")
# 写入
# fs.write("6666666666666666666")
# fs.write("20222222 虎虎生威")
# fs.write("py47 ")

# 打开文件的时候，会保留文件里的内容，然后追加
fs = open(r"E:\Pychram-Workspace\py47-编码技术\day9\study.txt", mode="a", encoding="utf-8")
fs.write("\n")
fs.write("虎虎虎虎虎虎虎虎虎虎虎虎虎虎虎")

fs.writelines(["1111\n","True\n","2222\n"])

# 关闭文件 - 写是涉及到修改操作 - 与其它的文件交互。
fs.close()