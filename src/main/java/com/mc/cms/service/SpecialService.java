package com.mc.cms.service;

import java.util.List;

import com.mc.cms.domain.Special;

public interface SpecialService {


	/*
	 * //增加专题 int insert(Special special);
	 * 
	 * 
	 * 
	 * // 修改专题 int update(Special special);
	 * 
	 * 
	 * 
	 * // 专题列表 List<Special> selects();
	 * 
	 * 
	 * // 向专题增加文章 int insertSpecialArticle(Integer sid ,Integer aid);
	 * 
	 * 
	 * 
	 * 
	 * // 根据主键查询专题 Special select(Integer sid);
	 */
	
	
	

	//增加专题
	int insert(Special special); 
	
	
	
	//修改专题
	int update(Special special);
	
	
	
	//专题列表
	List<Special> selects();
	
	
	//向专题增加文章
	int insertSpecialArticle(Integer sid ,Integer aid);
	
	
	//根据主键查询专题
	Special select(Integer sid);
	
	
	
}
