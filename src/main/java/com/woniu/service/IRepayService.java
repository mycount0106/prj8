package com.woniu.service;

import java.util.List;

import com.woniu.entity.Repay;

public interface IRepayService {

	void add(Repay repay);

	void del(Integer id);

	void update(Repay repay);

	Repay find(Integer id);

	List<Repay> findAll();

}
