package com.jjorim.spring.book.controller;

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

import com.jjorim.spring.book.dto.BookVO;
import com.jjorim.spring.book.service.BookService;

@Controller
public class BookContorller {

	private static final Logger logger = LoggerFactory.getLogger(BookContorller.class);
	
	@Inject
    private BookService service;
	
	
	@ResponseBody
	@RequestMapping(value = "book/list", method = {RequestMethod.GET,RequestMethod.POST})
	public Map<String, Object> bookInfo() throws Exception{
		
		System.out.println("문제없음1");
		List<BookVO> bookList = service.getBookList();
		System.out.println("문제없음2");
		Map<String,Object> map = new HashMap<String,Object>();
		
		//map.put("msg","성공");
		System.out.println("문제없음3");
		map.put("data", bookList);
		
		System.out.println(map);

		return map;
	}
	
}
