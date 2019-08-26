package com.woniu.service;
import java.util.List;
import com.woniu.entity.Recharge;
public interface IRechargeService {
	void add(Recharge recharge);
	void del(Integer id);
	void update(Recharge recharge);
	Recharge find(Integer id);
	List<Recharge> findAll();
}
