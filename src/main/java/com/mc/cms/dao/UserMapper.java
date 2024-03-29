package com.mc.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mc.cms.domain.User;

public interface UserMapper {
	
	
	//列表查询
	List<User> selects(@Param("username")String username);
	
	User selectByUsername(String username);
	
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}