package com.woniu.action;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.woniu.entity.User;
import com.woniu.entity.Userdata;
import com.woniu.service.ILinkmanService;
import com.woniu.service.IUserService;
import com.woniu.service.IUserdataService;

@Controller
@RequestMapping("/userdata")
public class UserdataController {
    @Resource
	private ILinkmanService linkmanServiceImpl;
	@Resource
	private IUserService userServiceImpl;
	@Resource
	private IUserdataService userdataServiceImpl;
	@RequestMapping("save")
	public String save(@RequestParam("files") MultipartFile[] files, Userdata userdata,HttpServletRequest req) throws IllegalStateException, IOException {
		System.out.println(userdata);
		if(files.length>0) {
		for(int i=0;i<files.length;i++) {
			String oldName = files[i].getOriginalFilename();
			int ext = oldName.lastIndexOf(".");
			oldName=oldName.substring(ext);
			String newName=UUID.randomUUID().toString().replace("-", "");
			newName=newName+oldName;
			System.out.println(newName);
			String path=req.getRealPath("/images");
			System.out.println(path);
			files[i].transferTo(new File(path,newName));
			if(i==0) {
				userdata.setPhotoOne("/images/"+newName);
				//System.out.println(newName);
			}else {
				userdata.setPhotoTwo("/images"+newName);
				//System.out.println(newName);
			}
		}
		}
		System.out.println(userdata.toString());
		userdataServiceImpl.save(userdata);
		return "redirect:/user/addLinkman.jsp";
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
	@RequestMapping("findMyCentre")
	public String findMyCentre(Integer uid,Model model) {
		Userdata userdata = userdataServiceImpl.findByUid(uid);
		User user = userServiceImpl.findOne(uid);
		List list = linkmanServiceImpl.findByUid(uid);
		model.addAttribute("userdata", userdata);
		model.addAttribute("user", user);
		model.addAttribute("list", list);
		return "/user/myCentre";
	}
	@RequestMapping("isdata")
	public String isdata(Integer uid) {
		Userdata userdata = userdataServiceImpl.findByUid(uid);
		List list = linkmanServiceImpl.findByUid(uid);
		if(userdata!=null&&list!=null) {
			return "redirect:/user/order.jsp";
		}else if(userdata!=null&&list==null) {
			return "redirect:/user/addLinkman.jsp";
		}else {
			return "redirect:/user/addata.jsp";
		}
	}
}
