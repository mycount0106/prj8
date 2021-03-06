package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.woniu.entity.Tree;
import com.woniu.mapper.TreeMapper;
import com.woniu.service.ITreeService;
@Service
public class TreeServiceImpl implements ITreeService {

	@Resource
	private TreeMapper treeMapper;
	@Override
	public List<Tree> findAll() {
		return treeMapper.selectByExample(null);
	}
}
