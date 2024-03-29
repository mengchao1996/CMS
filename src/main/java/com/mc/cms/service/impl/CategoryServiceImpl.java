package com.mc.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mc.cms.dao.CategoryMapper;
import com.mc.cms.domain.Category;
import com.mc.cms.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Resource
	private CategoryMapper categoryMapper;
	@Override
	public List<Category> selectsByChannelId(Integer channelId) {
		// TODO Auto-generated method stub
		return categoryMapper.selectsByChannelId(channelId);
	}

}
