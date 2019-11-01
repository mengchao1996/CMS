package com.mc.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mc.cms.dao.ChannelMapper;
import com.mc.cms.domain.Channel;
import com.mc.cms.service.ChannelService;

@Service
public class ChannelServiceImpl implements ChannelService {

	@Resource
	private ChannelMapper channelMapper;
	@Override
	public List<Channel> selects() {
		return channelMapper.selects();
	}

}
