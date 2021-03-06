package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MemberFeign;

@RestController
public class OrderFeignController {

	@Autowired
	private MemberFeign service;
	
	@RequestMapping("/getFeignUserList")
	public List<String> getFeignUserList() {
		return service.getOrderByUserList();
	}
}
