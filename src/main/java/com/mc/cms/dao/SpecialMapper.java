package com.mc.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mc.cms.domain.Special;

public interface SpecialMapper {

	/*
	 * //增加专题 int insert(Special special);
	 * 
	 * 
	 * 
	 * // 修改专题 int update(Special special);
	 * 
	 * 
	 * 
	 * 
	 * //专题列表 List<Special> selects();
	 * 
	 * 
	 * 
	 * 
	 * //向专题增加文章 int insertSpecialArticle(@Param("sid")Integer sid ,@Param("aid")
	 * Integer aid);
	 * 
	 * 
	 * //根据主键查询专题 Special select(Integer sid);
	 */
	
	
	
	//增加专题
	int insert(Special special); 
	
	
	
	// 修改专题
	int update(Special special);
	
	
	
	
	//专题列表
	List<Special> selects();
	
	
	
	
	//向专题增加文章
	int insertSpecialArticle(@Param("sid")Integer sid ,@Param("aid") Integer aid);
	
	
	//根据主键查询专题
	Special select(Integer sid);
	
	
	
	
}
