package com.mc.cms.domain;

import java.io.Serializable;

public class SpecialArticles implements Serializable{
	
	private Integer sid;
	private Integer aid;
	
	
	
	public SpecialArticles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SpecialArticles(Integer sid, Integer aid) {
		super();
		this.sid = sid;
		this.aid = aid;
	}
	@Override
	public String toString() {
		return "SpecialArticles [sid=" + sid + ", aid=" + aid + "]";
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	
	
	
	
	
}
