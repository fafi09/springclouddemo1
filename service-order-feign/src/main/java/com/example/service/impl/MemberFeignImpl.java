package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.service.MemberFeign;

@Component
public class MemberFeignImpl implements MemberFeign {

	@Override
	public List<String> getOrderByUserList() {
		List<String> listUser = new ArrayList<String>();
		listUser.add("not orderUser list");
		return listUser;

	}

}
