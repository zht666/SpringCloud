package com.zht.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {//相当于application.xml

	//类比<bean id="" class=""/>
	@Bean
	@LoadBalanced // 获得Rest时加入Ribbon的配置
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
//	@Bean
//	public IRule getRule() {
//		return new RandomRule();
//	}
}
