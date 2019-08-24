package com.woniu.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.woniu.entity.Admin;
import com.woniu.entity.AdminroleExample;
import com.woniu.entity.AdminroleKey;
import com.woniu.mapper.AdminMapper;
import com.woniu.mapper.AdminroleMapper;
import com.woniu.service.IAdminService;
@Service
public class AdminServiceImpl implements IAdminService{
	
	@Resource
	private AdminMapper adminMapper;
	@Resource
	private AdminroleMapper  adminroleMapper;
	
	@Override
	public void save(Admin admin,Integer[] chk) {
		Date date = new Date();
		Timestamp timestamp = new Timestamp(date.getTime());
		admin.setRegtime(timestamp);
		@SuppressWarnings("unused")
		int a = adminMapper.insert(admin);
		if(chk!=null) {
			for (Integer rid : chk) {
				AdminroleKey key = new AdminroleKey();
				key.setAid(admin.getAid());
				key.setRid(rid);
				adminroleMapper.insert(key);
			}
		}
	}
	@Override
	public void delete(Integer aid) {
		Admin admin = new Admin();
		admin.setAid(aid);
		admin.setIsdelete(1);
		adminMapper.updateByPrimaryKeySelective(admin);
	}
	@Override
	public void update(Admin admin,Integer[] chk) {
		adminMapper.updateByPrimaryKeySelective(admin);
		
		AdminroleExample example = new AdminroleExample();
		example.createCriteria().andAidEqualTo(admin.getAid());
		adminroleMapper.deleteByExample(example);
		
		if(chk!=null) {
			for (Integer rid : chk) {
				AdminroleKey key = new AdminroleKey();
				key.setAid(admin.getAid());
				key.setRid(rid);
				adminroleMapper.insert(key);
			}
		}
	}
	@Override
	public Admin findById(Integer aid) {
		return adminMapper.selectByPrimaryKey(aid);
	}
	@Override
	public List<Admin> findAll() {
		List<Admin> list = adminMapper.selectByExample(null);
		return list;
	}
	@Override
	public void revoke(Integer aid) {
		Admin admin = new Admin();
		admin.setAid(aid);
		admin.setIsdelete(0);
		adminMapper.updateByPrimaryKeySelective(admin);
	}
	@Override
	public Admin login(Admin admin) {
		return adminMapper.login(admin);
	}
}
