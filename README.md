# WebService
JAVA web service 客户端和服务端的简易实例代码，很清晰。

生成客户端代码：
命令提示窗口执行生成命令。
格式：wsimport -s "src目录" -p “生成类所在包名” -keep “wsdl发布地址”
示例：
wsimport -s G:\\workspace\\webService\\TheClient\\src -p net.zhangwenbo.client -keep http://localhost:9001/Service/ServiceHello?wsdl
说明：
1）"src目录"地址不可含空格
2）“wsdl发布地址”不要漏了“?wsdl”
