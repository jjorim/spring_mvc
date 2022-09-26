package com.jjorim.spring.book.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jjorim.spring.book.dto.BookVO;

@Repository
public class BookDAOImpl implements BookDAO{

	// SqlSession 주입 UserMapper.xml에 등록한 쿼리문 실행
		@Inject
	    private SqlSession sqlSession;

		private static final String Namespace = "com.jjorim.mapper.bookMapper"; // bookMapper.xml에 선언한 namespace

		// 쿼리 결과 데이터(여러개)를 List로 받아서 리턴
		@Override
		public List<BookVO> getBookList() throws Exception {
			// TODO Auto-generated method stub
			return sqlSession.selectList(Namespace+".getBookList");
		}
	
}
