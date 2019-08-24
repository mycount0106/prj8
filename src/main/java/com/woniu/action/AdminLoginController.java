package com.woniu.action;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.entity.Admin;
import com.woniu.entity.Tree;
import com.woniu.service.IAdminService;
import com.woniu.service.ITreeService;
@Controller
@RequestMapping("/back/")
public class AdminLoginController {
	/**
	  *   后台用户登录
	  * 	YYJ
	 */
	@Resource
	private IAdminService adminServiceImpl;
	@Resource
	private ITreeService treeServiceImpl;
	@RequestMapping("/login")
	public String login(Admin admin,HttpSession session) throws JsonProcessingException {
		 admin = adminServiceImpl.login(admin);
		if(admin==null) {
			return "/back/login";
		}else {
			List<Tree> tress = treeServiceImpl.findAll();
			ObjectMapper mapper =  new ObjectMapper();
			//String json = mapper.writeValueAsString(admin.getTrees());
			String json = mapper.writeValueAsString(tress);
			session.setAttribute("loginAdmin",admin);
			session.setAttribute("json", json);
			return "redirect:/back/admin/index.jsp";
		}
	}
}
