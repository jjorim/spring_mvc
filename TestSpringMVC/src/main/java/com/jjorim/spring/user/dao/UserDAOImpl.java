package com.jjorim.spring.user.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jjorim.spring.user.dto.UserVO; // VO ����

@Repository
public class UserDAOImpl implements UserDAO {
	
	// SqlSession 주입 UserMapper.xml에 등록한 쿼리문 실행
	@Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.jjorim.mapper.userMapper"; // userMapper.xml에 선언한 namespace
    
    // 쿼리 결과 데이터(여러개)를 List로 받아서 리턴
    @Override
    public List<UserVO> selectUser() throws Exception {
 
        return sqlSession.selectList(Namespace+".selectUser");
    }

}
