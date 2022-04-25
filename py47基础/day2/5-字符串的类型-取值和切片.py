"""
======================
Author: 柠檬班-小简
Time: 2021/12/18 20:45
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
字符串(str)
1、单引号、双引号：定义单行字符串
2、三引号、三双引号: 多行字符串定义
3、空字符串：s=''
4、注意点：字符串中有单引号时（外面用双引号注意区分）

方法(功能)：
1、len(字符串变量名) - 获取字符串的长度
2、取值-字符串变量名[索引]
   正序：索引从0开始，不能够超过字符串的长度-1。否则报错：IndexError: string index out of range
   倒序：索引从-1开始。
3、切片：从字符串面切取一部分/全部出来。
   [起始索引:终点索引]
   2、默认起始索引为0，默认步长为1
   3、左闭右开：含起始索引、不含结束索引。取头不取尾

"""
s = ''
print(s)
s1 = ' ' # 空格
s2 = '1111111111111111111111111111111'
print(len(s))
print(len(s1))
print(len(s2))

s3 = "abcbdefg"
# 取s3字符串的下标为7的值。
value = s3[7]
print(value)
# 取s3字符串的下标为-1的值。
value = s3[-8]
print(value)
# 取s3索引为2-5的值。 起始索引+步长=下一个索引
value = s3[2:6]  # 取的索引为2345
# value = s3[2:6:1]
print(value)
# 取s3索引为-1到-5的值。
value = s3[-1:-6:-1] # 索引为-1，-2，-3,-4,-5。起始索引+步长=下一个索引
print(value)
# 取整个s3.默认步长是1
print(s3[::])
# 经典面试题：字符串反转(倒序输出)
print(s3[::-1])

# 取最后一个值
print(s3[-1])
index = len(s3)-1
print(s3[index])
