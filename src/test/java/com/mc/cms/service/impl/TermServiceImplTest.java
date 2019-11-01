package com.mc.cms.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;

import com.mc.cms.domain.Term;
import com.mc.cms.service.TermService;
import com.mc.common.utils.StreamUtil;
import com.mc.common.utils.StringUtil;

public class TermServiceImplTest extends JunitParent{
	
	@Resource
	private TermService termService;
	
	@Test
	public void testInsert() {
		
		String file = StreamUtil.readTextFile(this.getClass().getResourceAsStream("/data.txt"));
		String[] split = file.split("\\|");
		for (String string : split) {
			Term term = new Term();
			term.setUniqueName(StringUtil.toUniqueTerm(string));
			termService.insert(term);
		}
		
		
		
	}

}
