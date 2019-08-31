package com.woniu.service;

import java.util.List;

import com.woniu.entity.Rate;

public interface IRateService {
      public List findAll();
      public void update(Rate rate);
      public void delete(Integer rateid);
      public void save(Rate rate);
}
