package com.woniu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Linkman;
import com.woniu.mapper.LinkmanMapper;
import com.woniu.service.ILinkmanService;
@Service
public class LinkmanServiceImpl implements ILinkmanService {
    @Resource
	private LinkmanMapper linkmanMapper;
	@Override
	public void save(Linkman linkman) {
		linkmanMapper.insert(linkman);

	}

}
