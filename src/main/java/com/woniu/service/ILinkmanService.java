package com.woniu.service;

import java.util.List;

import com.woniu.entity.Linkman;

public interface ILinkmanService {
     public void save(Linkman linkman);
     public List findByUid(Integer uid);
}
