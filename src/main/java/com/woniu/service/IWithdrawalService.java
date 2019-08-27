package com.woniu.service;

import java.util.List;

import com.woniu.entity.PageBean;
import com.woniu.entity.Withdrawal;;

public interface IWithdrawalService {
	void add(Withdrawal withdrawal);
	void del(Integer id);
	void update(Withdrawal withdrawal);
	Withdrawal find(Integer id);
	List<Withdrawal> findAll(PageBean pb);
	void revoke(Integer id);
}
