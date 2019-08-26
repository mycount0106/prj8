package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Product;
import com.woniu.entity.Repay;
import com.woniu.mapper.ProductMapper;
import com.woniu.mapper.RepayMapper;
import com.woniu.service.IProductService;
import com.woniu.service.IRepayService;
@Service
public class RepayServiceImpl implements IRepayService {
	
	@Resource
	private RepayMapper repayMapper;

	@Override
	public void add(Repay repay) {
		// TODO Auto-generated method stub
		repayMapper.insert(repay);
	}

	@Override
	public void del(Integer id) {
		// TODO Auto-generated method stub
		repayMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Repay repay) {
		// TODO Auto-generated method stub
		repayMapper.updateByPrimaryKey(repay);
	}

	@Override
	public Repay find(Integer id) {
		// TODO Auto-generated method stub
		return repayMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Repay> findAll() {
		// TODO Auto-generated method stub
		return repayMapper.selectByExample(null);
	}

	
}
