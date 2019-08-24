package com.woniu.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.entity.Role;
import com.woniu.entity.Tree;
import com.woniu.service.IRoleService;
import com.woniu.service.ITreeService;

@Controller
@RequestMapping("/back/role/")
public class RoleController {

	@Resource
	private IRoleService roleServiceImpl;
	@Resource
	private ITreeService treeServiceImpl;
	
	@RequestMapping("save")
	public String save(Role role,String tids) {
		roleServiceImpl.save(role,tids);
		return "redirect:findAll";
	}
	@RequestMapping("update")
	public String update(Role role,String tids) {
		roleServiceImpl.update(role,tids);
		return "redirect:findAll";
	}
	@RequestMapping("findAll")
	public String findAll(ModelMap map) {
		List<Role> list = roleServiceImpl.findAll();
		map.put("list", list);
		return "/back/role/list";
	}
	@RequestMapping("findById")
	public String findById(Integer rid,ModelMap map) {
		Role role = roleServiceImpl.findById(rid);
		
		map.put("role", role);
		return "forward:goInput";
	}

	@RequestMapping("goInput")
	public String goInput(ModelMap map) throws JsonProcessingException {
		List<Tree> list = treeServiceImpl.findAll();
		ObjectMapper objMapper = new ObjectMapper();
		String json = objMapper.writeValueAsString(list);
		map.put("alltree",json);
		return "/back/role/input";
	}

}
