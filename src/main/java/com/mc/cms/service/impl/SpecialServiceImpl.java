package com.mc.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mc.cms.dao.SpecialMapper;
import com.mc.cms.domain.Special;
import com.mc.cms.service.SpecialService;
@Service
public class SpecialServiceImpl implements SpecialService {
	
	/*
	 * @Resource private SpecialMapper specialMapper;
	 * 
	 * @Override public int insert(Special special) { // TODO Auto-generated method
	 * stub return specialMapper.insert(special); }
	 * 
	 * @Override public int update(Special special) { // TODO Auto-generated method
	 * stub return specialMapper.update(special); }
	 * 
	 * @Override public List<Special> selects() { // TODO Auto-generated method stub
	 * return specialMapper.selects(); }
	 * 
	 * @Override public int insertSpecialArticle(Integer sid, Integer aid) { // TODO
	 * Auto-generated method stub return specialMapper.insertSpecialArticle(sid,
	 * aid); }
	 * 
	 * @Override public Special select(Integer sid) { // TODO Auto-generated method
	 * stub return specialMapper.select(sid); }
	 */
	
	
	@Resource
	private SpecialMapper specialmapper;
	
	
	//增加专题
	@Override
	public int insert(Special special) {
		// TODO Auto-generated method stub
		return specialmapper.insert(special);
	}
	
	
	// 修改专题
	@Override
	public int update(Special special) {
		// TODO Auto-generated method stub
		return specialmapper.update(special);
	}

	
	//专题列表
	@Override
	public List<Special> selects() {
		// TODO Auto-generated method stub
		return specialmapper.selects();
	}
	
	
	//向专题增加文章
	@Override
	public int insertSpecialArticle(Integer sid, Integer aid) {
		// TODO Auto-generated method stub
		return specialmapper.insertSpecialArticle(sid, aid);
	}
	
	
	//根据主键查询专题
	@Override
	public Special select(Integer sid) {
		// TODO Auto-generated method stub
		return specialmapper.select(sid);
	}
	
	
	
	
	
	
	
	
	
	
}
