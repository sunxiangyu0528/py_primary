from loguru import logger

def log():
    logger.add(sink="log.log", rotation="100 KB", format="{time} - {level} - {message}")
    logger.info("gogogo")
    return logger


loggers = log()
loggers.info("1243")