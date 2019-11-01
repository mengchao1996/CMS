package com.mc.cms.service;

import com.github.pagehelper.PageInfo;
import com.mc.cms.domain.Article;
import com.mc.cms.domain.ArticleWithBLOBs;

public interface ArticleService {

	
	/**
	 * 
	 * @Title: selects 
	 * @Description: 文章列表查询
	 * @param article
	 * @return
	 * @return: List<Article>
	 */
	PageInfo<ArticleWithBLOBs> selects(Article article,Integer page,Integer pageSize);
	
	
    int deleteByPrimaryKey(Integer id);

    int insertSelective(ArticleWithBLOBs record);

    ArticleWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleWithBLOBs record);

}
