package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MemberService;

@RestController
public class OrderController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/getOrderbyUserList")
	public List<String> getOrderbyUserList() {
		return memberService.getOrderByUserList();
	}
}
