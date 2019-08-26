package com.woniu.service;

import java.util.List;

import com.woniu.entity.Invest;

public interface IInvestService {
	void add(Invest invest);

	void del(Integer id);

	void update(Invest invest);

	Invest find(Integer id);

	List<Invest> findAll();


}
