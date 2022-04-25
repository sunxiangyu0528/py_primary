"""
======================
Author: 柠檬班-小简
Time: 2022/1/24 21:02
Project: py47-编码技术
Company: 湖南零檬信息技术有限公司
======================
"""
# loguru第三方库使用说明
# 安装：pip install loguru
# 使用：
# 1、导入：from loguru import logger

from loguru import logger

# -- info级别的日志
logger.info("hello,world!!!")

# error级别的日志
logger.error("错了！请改正")

# warn级别的日志
logger.warning("警告！请注意")

# debug级别的日志
logger.debug("debug日志，详细内容！")

# fatal级别的日志
logger.critical("严重了！")
