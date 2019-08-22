package com.woniu.service;

import com.woniu.entity.User;

public interface IUserService {
    public User login(User user);
    public void save(User user);
}
