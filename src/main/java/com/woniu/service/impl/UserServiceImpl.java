package com.woniu.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.User;
import com.woniu.mapper.UserMapper;
import com.woniu.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
    @Resource
	private UserMapper userMapper;
	@Override
	public User login(User user) {
		
		return userMapper.Login(user);
	}
	@Override
	public void save(User user) {
		
		user.setRegtime(new Date());
		userMapper.insertSelective(user);
		
	}
	@Override
    public User findOne(Integer uid) {
    	return userMapper.selectByPrimaryKey(uid);
    }
	@Override
	public User findByUid(Integer uid, String password) {
		
		return userMapper.findByUid(uid, password);
	}
}
