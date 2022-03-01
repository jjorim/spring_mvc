package com.jjorim.spring.user.Serivce;

import java.util.List;

import com.jjorim.spring.user.dto.UserVO; // VO ¿¬°á

public interface UserService {

	public List<UserVO> selectUser() throws Exception;
}
