package com.springboot.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="spring-boot-client",fallback=HelloServiceClientCallback.class)
public interface HelloServiceClient {
	@RequestMapping(value = "/testPg")
	public String testPg();
}
