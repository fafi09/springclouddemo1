package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MemberService {
	@Autowired
	RestTemplate restTemplate;

	//Rest请求方式接口改造
	@HystrixCommand(fallbackMethod = "orderError")
	public List<String> getOrderByUserList() {
		return restTemplate.getForObject("http://service-member/getUserList", List.class);
	}	
	
	public List<String> orderError() {
		List<String> listUser = new ArrayList<String>();
		listUser.add("not orderUser list");
		return listUser;
	}

}

