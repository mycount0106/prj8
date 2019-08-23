package com.woniu.action;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Admin;
import com.woniu.entity.Role;
import com.woniu.service.IAdminService;
import com.woniu.service.IRoleService;
@Controller
@RequestMapping("/back/admin/")
public class AdminController {
	/**
	  *   后台用户的增删改查
	 * YYJ
	 */
	@Resource
	private IAdminService adminServiceImpl;
	@Resource
	private IRoleService roleServiceImpl;
	
	@RequestMapping("save")
	public String save(Admin admin,Integer[] chk,ModelMap map) {
		adminServiceImpl.save(admin,chk);
		return "redirect:findAll";
	}
	@RequestMapping("findAll")
	public String findAll(ModelMap map) {
		List<Admin> list = adminServiceImpl.findAll();
		map.put("admins", list);
		return "/back/admin/list";
	}
	@RequestMapping("findById")
	public String findById(Integer aid,ModelMap map) {
		Admin admin = adminServiceImpl.findById(aid);
		map.put("admin", admin);
		return "forward:goInput";
	}
	@RequestMapping("goInput")
	public String goInput(ModelMap map) {
		List<Role> roles = roleServiceImpl.findAll();
		map.put("roles",roles);
		return "/back/admin/input";
	}
	@RequestMapping("update")
	public String update(Admin admin,Integer[] chk,ModelMap map) {
		adminServiceImpl.update(admin, chk);
		return "redirect:findAll";
	}
	@RequestMapping("delete")
	public String delete(Integer aid) {
		adminServiceImpl.delete(aid);
		return "redirect:findAll";
	}
	@RequestMapping("revoke")
	public String revoke(Integer aid) {
		adminServiceImpl.revoke(aid);
		return "redirect:findAll";
	}
}
