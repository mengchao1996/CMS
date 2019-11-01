package com.mc.cms.vo;

import com.mc.cms.domain.User;

public class UserVO extends User  {

	
	private static final long serialVersionUID = 4583054591399546760L;
	private String repassword;//确认密码

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
}
