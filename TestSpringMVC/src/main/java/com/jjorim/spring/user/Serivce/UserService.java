package com.jjorim.spring.user.Serivce;

import java.util.List;

import com.jjorim.spring.user.dto.UserVO; // VO ����

public interface UserService {

	public List<UserVO> selectUser() throws Exception;
}
