import time
import datetime

# 将一个时间戳转换为当前时区的struct_time
# print(time.localtime())
# time.struct_time(tm_year=2022, tm_mon=9, tm_mday=25, tm_hour=17,
# tm_min=11, tm_sec=3, tm_wday=6, tm_yday=268, tm_isdst=0)
t = time.time()
# print(t)  # 原始时间数据
# print(int(t))  # 秒级时间戳
# print(int(round(t * 1000)))  # 毫秒级时间戳
# print(int(round(t * 1000000)))  # 微秒级时间戳

# 把一个代表时间的元组或者struct_time（如由time.localtime()和time.gmtime()返回）转化为格式化的时间字符串
# a = time.strftime("%Y-%m-%d %X", time.localtime())
# print(a)
# 把一个代表时间的元组或者struct_time（如由time.localtime()和time.gmtime()返回）转化为格式化的时间字符串
# 获取当前时间
print(datetime.datetime.now())
# 2022-09-25 17:18:59.851632
# datetime.today()	返回当前本地时间
# datetime.now([tz])	返回当前本地时间，如果指定tz，则返回tz时区当地时间