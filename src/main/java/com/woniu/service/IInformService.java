package com.woniu.service;

import java.util.List;

import com.woniu.entity.Inform;

public interface IInformService {
       public void save(Inform inform);
       public void update(Inform inform);
       public void delete(Integer informid);
       public Inform findOne(Integer informid);
       public List findAll();
}
