"""
======================
Author: 柠檬班-小简
Time: 2022/1/21 19:46
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
"""
excel : 数据
读read  写write  数据

xlrd  xlwt xlutil -- .xls

.xlsx  -- openpyxl

安装：pip install openpyxl

手工使用excel的流程：
 1、文件打开就是一个  工作薄(workbook)
 2、选择一个  表单(sheet)
 3、单元格(cell)
    读写操作


代码版：
1、打开一个excel,读取工作薄。 
   wb = load_workbook(excel_path)

2、获取表单，通过表单名称。
   sh = wb["表单名称"]

3、获取单元格。行和列起始下标是从1开始。
   行号、列号
   sh.cell(row,colum).value
   单元格如果没有值，那得到就是None

4、获取表单当中，行数和列数。
   print(sh.max_row)
   print(sh.max_column)

5、往单元格写入数据：
   sh.cell(row,colum).value = 值

6、保存修改的数据
   工作薄对象wb.save(文件路径)
   注意：保存数据时，excel文件要是关闭状态。


7、获取所有行数据，放在一个列表当中
   list(sh.values) 
"""