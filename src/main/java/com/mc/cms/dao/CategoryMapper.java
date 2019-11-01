package com.mc.cms.dao;

import java.util.List;

import com.mc.cms.domain.Category;

public interface CategoryMapper {


	//查询某个栏目下的分类
	List<Category> selectsByChannelId(Integer channelId);
	
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}