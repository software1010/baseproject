package cn.com.company.baseproject.api.service.impl;

import org.springframework.stereotype.Component;

import cn.com.company.baseproject.api.service.DemoService;

@Component
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
