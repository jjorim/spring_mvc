package com.jjorim.spring.book.dao;

import java.util.List;

import com.jjorim.spring.book.dto.BookVO;

public interface BookDAO {

	
	public List<BookVO> getBookList() throws Exception;
}
