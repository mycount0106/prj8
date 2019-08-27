package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.woniu.entity.Invest;
import com.woniu.entity.InvestExample;
import com.woniu.entity.PageBean;
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
		Invest invest = new Invest();
		invest.setInvertid(id);
		invest.setStatus(0);
		investMapper.updateByPrimaryKeySelective(invest);
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
	public List<Invest> findAll(PageBean pb) {
		// TODO Auto-generated method stub
			InvestExample ie = new InvestExample();
			List<Invest> list = investMapper.selectByExample(null,new RowBounds(pb.getOffset(), pb.getLimit()));
			int count = (int) investMapper.countByExample(ie);
			pb.setCount(count);
			return list;
	}

	@Override
	public void revoke(Integer id) {
		// TODO Auto-generated method stub
		Invest invest = new Invest();
		invest.setInvertid(id);
		invest.setStatus(1);
		investMapper.updateByPrimaryKeySelective(invest);
		
	}

}
