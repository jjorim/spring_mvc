package com.jjorim.spring.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jjorim.spring.user.Serivce.UserService;
import com.jjorim.spring.user.dto.UserVO;


@Controller
public class UserContorller {
	private static final Logger logger = LoggerFactory.getLogger(UserContorller.class);
	
	@Inject
    private UserService service;
	
	
	@ResponseBody
	@RequestMapping(value = "rest/testvalue", method = RequestMethod.GET)
	public Map<String, Object> userInfo() throws Exception{
		
		List<UserVO> userList = service.selectUser();
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("msg","성공");
		map.put("userList", userList);
		
		System.out.println(map);

		return map;
	}

}
