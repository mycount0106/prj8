package com.woniu.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.woniu.entity.PageBean;
import com.woniu.entity.User;
import com.woniu.entity.UserExample;
import com.woniu.entity.UserExample.Criteria;
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
	@Override
	public List findAll(User user,PageBean pb) {
	     UserExample ue=new UserExample();
	     Criteria c = ue.createCriteria();
	     if(user.getUname()!=null&&!user.getUname().equals("")) {
	    	 c.andUnameEqualTo(user.getUname());
	     }
	     if(user.getPhone()!=null&&!user.getPhone().equals("")) {
	    	 c.andPhoneEqualTo(user.getPhone());
	     }
	     List<User> users = userMapper.selectByExample(ue, new RowBounds(pb.getOffset(), pb.getLimit()));
	     int count = (int) userMapper.countByExample(ue);
	     pb.setCount(count);
	     return users;
	}
	@Override
	public void isdelete(Integer uid, Integer isdelete) {
		
		userMapper.isdelete(uid, isdelete);
	}
}
