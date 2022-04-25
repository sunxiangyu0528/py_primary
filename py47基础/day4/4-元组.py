"""
======================
Author: 柠檬班-小简
Time: 2021/12/22 21:34
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
元组(tuple): ()
            有序的，有索引
            只可以读取，不可以修改。 --- 不可变类型。
            一般在元组当中存放的是不可变类型。
            
            len()
            +
            *
            in/not in

在表达一个数据的时候：   (值,)    
定义元组的形式：
    tuple = ()  空元组
    tuple_a = (1,2,3,4)
    typle_c = 1,2,3,4
"""
tuple_a = (1,2,3,4)
tuple_c = 1,2,3,4
print(tuple_a)
print(tuple_c)
# tuple_b = (1,2,3,["aa","bb"])
# tuple_b[3].append("cc")
# print(tuple_b)

lista = [1]
dicta = {"key":"value"}
tuple = (1,)