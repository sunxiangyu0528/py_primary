"""
======================
Author: 柠檬班-小简
Time: 2021/12/18 21:55
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
lower()
upper()
swapecase()
count()
find(子字符串)   查找子字符串是否存在，如果存在则返回在原字符串中的索引位置，如果没有返回-1
index(子字符串)       返回子字符串在原字符串当的索引。

"""
ss = "helloWorlfSSSworkdSSS11123223232324322111"
# 把字符串全部转成小写
res = ss.lower()
print(res)
# 把字符串全部转成大写
res = ss.upper()
print(res)
# 字符串大小写转换
res = ss.swapcase()
print(res)
# 统计字符在字符串当中出现的次数。 count(子字符串)
res = ss.count("SS")
print(res)
# 应用场景：你不确定这个子字符串到底有没有。
# 查找子字符串在字符串中的第一出现，且第一个字符的索引。 find(子字符串)
# 如果子字符串存在，索引>=0
# 如果不存在，find的返回值是-1
res = ss.find("SS")
print(res)
res = ss.find("ss")  # ss字符串当中没有小写的ss，所以返回-1
print(res)

# 应用场景：你已经明确子字符串是存在的，只是想知道它在哪个位置 。
# index - 找到字符串在原字符当中的下标。
# 如果子字符串不存在，则会报错：ValueError: substring not found
res = ss.index("ss")
print(res)
