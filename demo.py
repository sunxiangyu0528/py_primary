import ssl
import json
import pytest
import time
from common.feishu_robot import FeishuRobot
from common.handle_db import DbTrade
from common.utils import get_now_time
from websocket import create_connection
from config.ws import LTP_URL

db_trade = DbTrade()


class TestTradeInsert(object):

    @pytest.mark.parametrize('symbol,exchange,channel',
                             [
                                 ("BTC_USDT", "1001", "bbo"),
                                 ("ETH_USDT", "1001", "trades"),
                                 ("BTC_USDT", "1001", "trades"),
                                 ("BTC_USDT", "1000", "bbo"),
                                 ("ETH_USDT", "1000", "trades"),
                                 ("BTC_USDT", "1000", "trades"),
                                 ("BTC_USDT", "1001", "book"),
                                 ("BTC_USDT", "1000", "book")
                             ])
    def test_01(self, symbol, exchange, channel):
        """
        author: Andre
        Logic : "channel": "book","exchange": "1001"的情况
        """
        data = {
            "args": {
                "exchange": exchange,
                "symbol": symbol,
                "channel": channel,
                "latencyPrint": 1,
            },
            "op": "subscribe"
        }

        def send_message():
            ws = create_connection(url=LTP_URL, sslopt={"cert_reqs": ssl.CERT_NONE})
            ws.send(json.dumps(data))
            result = ws.recv()
            result2 = ws.recv()
            result3 = ws.recv()

        try:
            send_message()
        except Exception as e:
            FeishuRobot.send(f"{exchange}交易所,{channel}频道,{symbol}币种30秒未返回数据")
            try:
                send_message()
            except Exception as e:
                FeishuRobot.send(f"{exchange}交易所,{channel}频道,{symbol}币种60秒未返回数据")
                try:
                    send_message()
                except Exception as e:
                    FeishuRobot.send(f"{exchange}交易所,{channel}频道,{symbol}币种90秒未返回数据")
