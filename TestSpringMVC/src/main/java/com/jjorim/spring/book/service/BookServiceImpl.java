package com.jjorim.spring.book.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jjorim.spring.book.dao.BookDAO;
import com.jjorim.spring.book.dto.BookVO;

@Service
public class BookServiceImpl implements BookService{
	
	@Inject
    private BookDAO dao;
	
	 @Override
	    public List<BookVO> getBookList() throws Exception {
	 
	        return dao.getBookList();
	    }

}
