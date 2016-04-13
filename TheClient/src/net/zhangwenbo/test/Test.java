/**
 * 
 */
package net.zhangwenbo.test;

import net.zhangwenbo.client.ServiceHello;
import net.zhangwenbo.client.ServiceHelloService;

/**
 * @author Iver3oN Zhang
 * @date 2016Äê4ÔÂ13ÈÕ
 * @email grepzwb@qq.com
 * Test.java
 * Impossible is nothing
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceHello service = new ServiceHelloService().getServiceHelloPort();
		String name = service.getValue("ZWB");
		System.out.println(name);
	}

}
