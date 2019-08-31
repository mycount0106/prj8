package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Rate;
import com.woniu.mapper.RateMapper;
import com.woniu.service.IRateService;
@Service
public class RateServiceImpl implements IRateService {
    @Resource
	private RateMapper rateMapper;
	@Override
	public List findAll() {
		
		return rateMapper.selectByExample(null);
	}
	@Override
	public void update(Rate rate) {
		rateMapper.updateByPrimaryKeySelective(rate);
		
	}
	@Override
	public void delete(Integer rateid) {
		rateMapper.deleteByPrimaryKey(rateid);
		
	}
	@Override
	public void save(Rate rate) {
		rateMapper.insertSelective(rate);
		
	}

}
