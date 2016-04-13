/**
 * 
 */
package net.zhangwenbo.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @author Iver3oN Zhang
 * @date 2016年4月13日
 * @email grepzwb@qq.com
 * ServiceHello.java
 * Impossible is nothing
 */
@WebService
public class ServiceHello {
	
	
	//客户端调用的方法
	public String getValue(String name){
		return "我叫:"+name;
	}
	public static void main(String[] args) {
		//用于发布客户端 9001为端口号，可以选择任意未被占用的端口号
		Endpoint.publish("http://localhost:9001/Service/ServiceHello",new ServiceHello());
		System.out.println("service success!!");
	}

}
