import hashlib

string = "beyongjie1"
md5 = hashlib.md5()
md5.update(string.encode('utf-8'))  # 注意转码
res = md5.hexdigest()
print("md5加密结果:", res)
# md5加密结果: 82ef32c8f908e49c7f1b147c69989881
sha256 = hashlib.sha256()
sha256.update(string.encode('utf-8'))
print(sha256.hexdigest())
# fdb178de7d8fabf82380f67c0f71c141076ae4f49939a0f0ea68c31b5feea295
