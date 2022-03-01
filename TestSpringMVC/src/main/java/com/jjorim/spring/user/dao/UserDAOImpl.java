package com.jjorim.spring.user.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jjorim.spring.user.dto.UserVO; // VO ����

@Repository
public class UserDAOImpl implements UserDAO {
	
	// SqlSession ���� UserMapper.xml�� ����� ������ ����
	@Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.jjorim.mapper.userMapper"; // userMapper.xml�� ������ namespace
    
    //���� ��� ������(������)�� List�� �޾Ƽ� ����
    @Override
    public List<UserVO> selectUser() throws Exception {
 
        return sqlSession.selectList(Namespace+".selectUser");
    }

}
