package com.wiseshop.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wiseshop.service.TestService;

@RequestMapping("/test")
@Controller
public class testController {
	
	@Resource
	TestService ts;
	
	@RequestMapping("/cs")
	@ResponseBody
	public ModelAndView infoFb(HttpServletRequest request,HttpServletResponse response,HttpSession session) {
		Map<String,Object> map = ts.test();
		ModelAndView model = new ModelAndView((String) map.get("index"));
		return model;
	}

}
