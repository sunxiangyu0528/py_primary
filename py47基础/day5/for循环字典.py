"""
======================
Author: 柠檬班-小简
Time: 2021/12/24 21:45
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
for循环字典   从头到尾去取字典当中的每一个键值对。
for item in my_info.keys():
    取到的每一个成员的key，都会去执行的代码 。

# 常用。
for key,value in 字典.items():
    取到的每一个成员key-value，都会去执行的代码
"""
my_info = {"name":"xj", "age": 18, "city": "长沙", "sex":"女"}

for item in my_info.keys():
    print(item)
    print(my_info[item])


# 最常用的
for key,value in my_info.items():
    print(key,value)

"""
3、有一个咖啡自动贩卖机，售卖的咖啡和价格如下：
     coffees = {"拿铁": 7, "卡布奇诺": 7, "美式": 10, "摩卡": 12, "焦糖玛奇朵": 15, "意式咖啡": 15}
     用户输入要购买的咖啡品类，以及购买的数量
     coffee_name = input("要购买的咖啡：")
     coffee_num = input("要购买的杯数：")
     请判断要购买的咖啡是否有售卖，如果没有，请输出：暂不售卖此咖啡哦。
     如果有售卖，则计算要付多少钱，并输出：购买成功，共需支付xx元。xx用实际要支付的金额代替。
"""
# 拿铁，2杯
coffee_name = "拿铁"
coffee_num = "2"

coffees = {"拿铁": 7, "卡布奇诺": 7, "美式": 10, "摩卡": 12, "焦糖玛奇朵": 15, "意式咖啡": 15}
if coffee_name in coffees.keys():
    price = coffees[coffee_name] * int(coffee_num)
    print(f"你需要支付{price}元")
else:
    print("暂不售卖此咖啡哦")