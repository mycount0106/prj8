package com.woniu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Userdata;
import com.woniu.mapper.UserdataMapper;
import com.woniu.service.IUserdataService;
@Service
public class UserdataServiceImpl implements IUserdataService {
    /*
                * 插入、修改、查询用户资料业务层
     * */
	@Resource
	private UserdataMapper userdataMapper;
	@Override
	public void save(Userdata userdata) {
		userdataMapper.insertSelective(userdata);

	}

	@Override
	public Userdata findOne(Integer dataid) {
		
		return userdataMapper.selectByPrimaryKey(dataid);
	}

	@Override
	public void updata(Userdata userdata) {
		userdataMapper.updateByPrimaryKeySelective(userdata);

	}

}
