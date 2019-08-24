package com.woniu.service;

import java.util.List;

import com.woniu.entity.Admin;

public interface IAdminService {

	public void save(Admin admin,Integer[] chk);
	public void delete(Integer aid);
	public void update(Admin admin,Integer[] chk);
	public Admin findById(Integer aid);
	public List<Admin> findAll();
	public void revoke(Integer aid);
	public Admin login(Admin admin);
}
