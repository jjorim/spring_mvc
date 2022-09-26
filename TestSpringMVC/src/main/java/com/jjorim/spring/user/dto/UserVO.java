package com.jjorim.spring.user.dto;

public class UserVO {

	// 테이블 컬럼에 해당하는 변수 생성
	private String id;
    private String pw;
    private String name;
    
    // 각 변수에 대한 getter, setter 메서드 생성
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
	
}
