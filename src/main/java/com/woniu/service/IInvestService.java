package com.woniu.service;

import java.util.List;

import com.woniu.entity.Invest;
import com.woniu.entity.PageBean;

public interface IInvestService {
	void add(Invest invest);

	void del(Integer id);

	void update(Invest invest);

	Invest find(Integer id);

	List<Invest> findAll(PageBean pb);

	void revoke(Integer id);


}
