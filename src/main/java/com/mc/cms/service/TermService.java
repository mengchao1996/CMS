package com.mc.cms.service;

import com.mc.cms.domain.Term;

public interface TermService {
	
	//保存标签
	int insert(Term term);
	
	
	//根据标签查询标签对象
	Term selectByName(String name);
	
}
