package com.jjorim.spring.user.Serivce;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jjorim.spring.user.dao.UserDAO;	// DAO 연결
import com.jjorim.spring.user.dto.UserVO;	// VO 연결

@Service
public class UserServiceImpl implements UserService {
	
	@Inject
    private UserDAO dao;
    
    @Override
    public List<UserVO> selectUser() throws Exception {
 
        return dao.selectUser();
    }

}
