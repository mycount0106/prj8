package com.woniu.service;

import java.util.List;

import com.woniu.entity.PageBean;
import com.woniu.entity.User;

public interface IUserService {
    public User login(User user);
    public void save(User user);
    public User findOne(Integer uid);
    public User findByUid(Integer uid,String password);
    public List findAll(User user,PageBean pb);
    public void isdelete(Integer uid,Integer isdelete);
}
