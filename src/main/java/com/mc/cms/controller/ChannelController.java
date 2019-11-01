package com.mc.cms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mc.cms.domain.Category;
import com.mc.cms.domain.Channel;
import com.mc.cms.service.CategoryService;
import com.mc.cms.service.ChannelService;

@RequestMapping("channel")
@Controller
public class ChannelController {
	
	@Resource
	private ChannelService channelService;
	@Resource
	private CategoryService categoryService;


	
	//查询所有栏目
	@ResponseBody
	@RequestMapping("channels")
	public List<Channel> selects(){
		return  channelService.selects();
		
	}
	
	//根据栏目查询分类
	@ResponseBody
	@RequestMapping("selectCategorysByCid")
	public List<Category> selectCategorysByCid(Integer cid){
		return categoryService.selectsByChannelId(cid);
	}

}
