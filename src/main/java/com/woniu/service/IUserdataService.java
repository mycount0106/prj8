package com.woniu.service;

import com.woniu.entity.Userdata;

public interface IUserdataService {
       public void save(Userdata userdata);
       public Userdata findOne(Integer dataid);
       public void updata(Userdata userdata);
}
