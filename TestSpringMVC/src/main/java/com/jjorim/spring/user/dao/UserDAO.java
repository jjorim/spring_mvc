package com.jjorim.spring.user.dao;

import java.util.List;

import com.jjorim.spring.user.dto.UserVO; // VO �߰�

public interface UserDAO {

	public List<UserVO> selectUser() throws Exception;
	
}
