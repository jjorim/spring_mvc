package com.jjorim.spring.book.service;

import java.util.List;

import com.jjorim.spring.book.dto.BookVO;


public interface BookService {
	
	public List<BookVO> getBookList() throws Exception;

}
