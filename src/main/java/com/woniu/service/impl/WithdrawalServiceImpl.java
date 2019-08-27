package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.woniu.entity.PageBean;
import com.woniu.entity.Recharge;
import com.woniu.entity.Withdrawal;
import com.woniu.entity.WithdrawalExample;
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
		Withdrawal withdrawal = new Withdrawal();
		withdrawal.setDrawid(id);
		withdrawal.setStatus(0);
		withdrawalMapper.updateByPrimaryKey(withdrawal);
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
	public List<Withdrawal> findAll(PageBean pb) {
		// TODO Auto-generated method stub
		WithdrawalExample we = new WithdrawalExample(); 
		List<Withdrawal> list = withdrawalMapper.selectByExample(null, new RowBounds(pb.getOffset(), pb.getLimit()));
		int count = (int) withdrawalMapper.countByExample(we);
		pb.setCount(count);
		return list;
	}

	@Override
	public void revoke(Integer id) {
		// TODO Auto-generated method stub
		Withdrawal withdrawal = new Withdrawal();
		withdrawal.setDrawid(id);
		withdrawal.setStatus(1);
		withdrawalMapper.updateByPrimaryKey(withdrawal);
		
	}

	
}
