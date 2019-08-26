package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Recharge;
import com.woniu.mapper.RechargeMapper;
import com.woniu.service.IRechargeService;
@Service
public class RechargeServiceImpl implements IRechargeService {
	
	@Resource
	private RechargeMapper rechargeMapper;

	@Override
	public void add(Recharge recharge) {
		// TODO Auto-generated method stub
		rechargeMapper.insert(recharge);
	}

	@Override
	public void del(Integer id) {
		// TODO Auto-generated method stub
		rechargeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Recharge recharge) {
		// TODO Auto-generated method stub
		rechargeMapper.updateByPrimaryKey(recharge);
	}

	@Override
	public Recharge find(Integer id) {
		// TODO Auto-generated method stub
		return rechargeMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Recharge> findAll() {
		// TODO Auto-generated method stub
		return rechargeMapper.selectByExample(null);
	}

}
