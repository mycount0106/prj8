package com.woniu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.LinkmanuserKey;
import com.woniu.mapper.LinkmanuserMapper;
import com.woniu.service.ILinkmanuserService;
@Service
public class LinkmanuserServiceImpl implements ILinkmanuserService {
    @Resource
	private LinkmanuserMapper linkmanuserMapper;
	@Override
	public void save(LinkmanuserKey linkmanuser) {
		linkmanuserMapper.insert(linkmanuser);
	}

}
