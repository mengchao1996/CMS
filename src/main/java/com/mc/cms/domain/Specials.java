package com.mc.cms.domain;

import java.io.Serializable;

public class Specials implements Serializable{
	
	private Integer id;
	private String title;
	private String abstracts;
	private String created;
	public Specials() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Specials(Integer id, String title, String abstracts, String created) {
		super();
		this.id = id;
		this.title = title;
		this.abstracts = abstracts;
		this.created = created;
	}
	@Override
	public String toString() {
		return "Specials [id=" + id + ", title=" + title + ", abstracts=" + abstracts + ", created=" + created + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAbstracts() {
		return abstracts;
	}
	public void setAbstracts(String abstracts) {
		this.abstracts = abstracts;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	
	
}
