package com.woniu.action;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.woniu.entity.Userdata;
import com.woniu.service.IUserdataService;

@Controller
@RequestMapping("/userdata")
public class UserdataController {
       
	private IUserdataService userdataServiceImpl;
	@RequestMapping("save")
	public String save(@RequestParam("files") MultipartFile[] files, Userdata userdata,HttpServletRequest req) throws IllegalStateException, IOException {
		for(int i=0;i<files.length;i++) {
			String oldName = files[i].getOriginalFilename();
			int ext = oldName.lastIndexOf(".");
			String newName=UUID.randomUUID().toString().replace("-", "");
			newName=newName+ext;
			System.out.println(newName);
			String path=req.getRealPath("/images");
			files[i].transferTo(new File(path,newName));
			if(i==0) {
				userdata.setPhotoOne("/images"+newName);
			}else {
				userdata.setPhotoTwo("/images"+newName);
			}
		}
		System.out.println(userdata.toString());
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
