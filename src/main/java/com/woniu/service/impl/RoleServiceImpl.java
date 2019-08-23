package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Role;
import com.woniu.entity.RoletreeExample;
import com.woniu.entity.RoletreeKey;
import com.woniu.mapper.RoleMapper;
import com.woniu.mapper.RoletreeMapper;
import com.woniu.service.IRoleService;
@Service
public class RoleServiceImpl implements IRoleService{

	@Resource
	private RoleMapper roleMapper;
	@Resource
	private RoletreeMapper roletreeMapper;
	
	@Override
	public List<Role> findAll() {
		return roleMapper.selectByExample(null);
	}
	@Override
	public void save(Role role, String tids) {
		roleMapper.insert(role);
		String[] tidarr = tids.split(",");
		for (String tid : tidarr) {
			RoletreeKey key = new RoletreeKey();
			key.setRid(role.getRid());
			key.setTid(Integer.parseInt(tid));
			roletreeMapper.insert(key);
		}
	}
	@Override
	public void update(Role role, String tids) {
		roleMapper.updateByPrimaryKey(role);
		RoletreeExample example = new RoletreeExample();
		example.createCriteria().andRidEqualTo(role.getRid());
		roletreeMapper.deleteByExample(example);
		String[] tidarr = tids.split(",");
		for (String tid : tidarr) {
			RoletreeKey key = new RoletreeKey();
			key.setRid(role.getRid());
			key.setTid(Integer.parseInt(tid));
			roletreeMapper.insert(key);
		}
	}
	@Override
	public Role findById(Integer rid) {
		return roleMapper.selectByPrimaryKey(rid);
	}
}
