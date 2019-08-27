package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Inform;
import com.woniu.mapper.InformMapper;
import com.woniu.service.IInformService;
@Service
public class InformServiceImpl implements IInformService {
    @Resource
	private InformMapper informMapper;
	@Override
	public void save(Inform inform) {
		informMapper.insertSelective(inform);
	}

	@Override
	public void update(Inform inform) {
		informMapper.updateByPrimaryKeySelective(inform);
	}

	@Override
	public void delete(Integer informid) {
		informMapper.deleteByPrimaryKey(informid);
	}

	@Override
	public Inform findOne(Integer informid) {
		return informMapper.selectByPrimaryKey(informid);
	}

	@Override
	public List findAll() {
		return informMapper.selectByExample(null);
	}

}
