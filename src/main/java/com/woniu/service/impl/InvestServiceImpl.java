package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Invest;
import com.woniu.entity.Product;
import com.woniu.mapper.InvestMapper;
import com.woniu.service.IInvestService;
@Service
public class InvestServiceImpl implements IInvestService {
@Resource
private InvestMapper investMapper;
	@Override
	public void add(Invest invest) {
		// TODO Auto-generated method stub
		investMapper.insert(invest);
	}

	@Override
	public void del(Integer id) {
		// TODO Auto-generated method stub
		investMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Invest invest) {
		// TODO Auto-generated method stub
		investMapper.updateByPrimaryKey(invest);
	}

	@Override
	public Invest find(Integer id) {
		// TODO Auto-generated method stub
		return investMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Invest> findAll() {
		// TODO Auto-generated method stub
		return investMapper.selectByExample(null);
	}

}
