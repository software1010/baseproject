package cn.com.company.baseproject.api;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.company.baseproject.api.service.DemoService;

public class DemoClientService {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "consumer.xml" });
		context.start();

		DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
		String hello = demoService.sayHello("world"); // 执行远程方法

		System.out.println(hello); // 显示调用结果
	}

}
