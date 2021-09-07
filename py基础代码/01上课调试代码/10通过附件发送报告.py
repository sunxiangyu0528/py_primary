"""
============================
Author:柠檬班-木森
Time:2020/3/4   21:42
E-mail:3247119728@qq.com
Company:湖南零檬信息技术有限公司
============================
"""


import smtplib
from email.mime.text import MIMEText
from email.mime.application import MIMEApplication
from email.mime.multipart import MIMEMultipart

"""
smtp服务器：
smtp服务器地址：
qq邮箱：smtp.qq.com   端口：465
163邮箱：smtp.163.com  端口：465

账号：musen_nmb@qq.com
授权码：algmmzptupjccbab


"""

# 第一步：连接邮箱的smtp服务器，并登录
smtp = smtplib.SMTP_SSL(host="smtp.qq.com", port=465)
smtp.login(user="musen_nmb@qq.com", password="algmmzptupjccbab")

# 第二步：构建一封邮件
# 创建一封多组件的邮件
msg = MIMEMultipart()

with open("report1.html", "rb") as f:
    content = f.read()
# 创建邮件文本内容
text_msg = MIMEText(content, _subtype="html", _charset="utf8")
# 添加到多组件的邮件中
msg.attach(text_msg)
# 创建邮件的附件
report_file = MIMEApplication(content)
report_file.add_header('content-disposition', 'attachment', filename='26report.html')
# 将附件添加到多组件的邮件中
msg.attach(report_file)

# 主题
msg["Subject"] = "26期上课发送邮件"
# 发件人
msg["From"] = "musen_nmb@qq.com"
# 收件人
msg["To"] = "musen@qq.com"

# 第三步：发送邮箱
smtp.send_message(msg, from_addr="musen_nmb@qq.com", to_addrs="3247119728@qq.com")
