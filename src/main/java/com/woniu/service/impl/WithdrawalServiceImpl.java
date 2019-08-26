package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Recharge;
import com.woniu.entity.Withdrawal;
import com.woniu.mapper.RechargeMapper;
import com.woniu.mapper.WithdrawalMapper;
import com.woniu.service.IRechargeService;
import com.woniu.service.IWithdrawalService;
@Service
public class WithdrawalServiceImpl implements IWithdrawalService {
	
	@Resource
	private WithdrawalMapper withdrawalMapper;

	@Override
	public void add(Withdrawal withdrawal) {
		// TODO Auto-generated method stub
		withdrawalMapper.insert(withdrawal);
	}

	@Override
	public void del(Integer id) {
		// TODO Auto-generated method stub
		withdrawalMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Withdrawal withdrawal) {
		// TODO Auto-generated method stub
		withdrawalMapper.updateByPrimaryKey(withdrawal);
	}

	@Override
	public Withdrawal find(Integer id) {
		// TODO Auto-generated method stub
		return withdrawalMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Withdrawal> findAll() {
		// TODO Auto-generated method stub
		return withdrawalMapper.selectByExample(null);
	}

	
}
