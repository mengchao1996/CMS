package com.mc.cms.dao; 

import org.apache.ibatis.annotations.Param;

import com.mc.cms.domain.Term;

public interface TermMapper {
	
	//保存标签
	int insert(Term term);
	
	
	//根据标签查询标签对象
	Term selectByName(String name);

	
	//向中间表插入数据
	int insertArticleTerm(@Param("aid")Integer aid,@Param("tid") Integer tid);

}
