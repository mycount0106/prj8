package com.woniu.service;

import java.util.List;

import com.woniu.entity.Role;

public interface IRoleService {

	public List<Role> findAll();
	public void save(Role role, String tids);
	public void update(Role role, String tids);
	public Role findById(Integer rid);
}
