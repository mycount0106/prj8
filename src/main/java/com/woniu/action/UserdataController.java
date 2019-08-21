package com.woniu.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Userdata;
import com.woniu.service.IUserdataService;

@Controller
@RequestMapping("/userdata")
public class UserdataController {
       
	private IUserdataService userdataServiceImpl;
	@RequestMapping("save")
	public String save(Userdata userdata) {
		userdataServiceImpl.save(userdata);
		return null;
	}
	@RequestMapping("updata")
	public String update(Userdata userdata) {
		userdataServiceImpl.updata(userdata);
		return null;
	}
	@RequestMapping("findOne")
	public String findOne(Integer dataid) {  
		userdataServiceImpl.findOne(dataid);
		return null;
	}
}
