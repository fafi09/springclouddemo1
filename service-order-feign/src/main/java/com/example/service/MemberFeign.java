package com.example.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.impl.MemberFeignImpl;

@FeignClient(value="service-member",fallback=MemberFeignImpl.class)
public interface MemberFeign {
	@RequestMapping("/getUserList")
	public List<String> getOrderByUserList();
}

