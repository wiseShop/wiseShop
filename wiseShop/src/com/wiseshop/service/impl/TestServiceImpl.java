package com.wiseshop.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wiseshop.dao.TestMapper;
import com.wiseshop.service.TestService;

@Service("testServiceImpl")
public class TestServiceImpl implements TestService {
	
	@Resource
	private TestMapper testDao;
	
	@Override
	public Map<String, Object> test() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("index", "index");
		return map;
	}


}
