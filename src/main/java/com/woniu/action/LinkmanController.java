package com.woniu.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Linkman;
import com.woniu.entity.LinkmanuserKey;
import com.woniu.entity.User;
import com.woniu.service.ILinkmanService;
import com.woniu.service.ILinkmanuserService;
import com.woniu.service.IUserService;
import com.woniu.service.IWalletService;

@Controller
@RequestMapping("/linkman")
public class LinkmanController {
    @Resource
	private IWalletService walletServiceImpl;
	@Resource
	private IUserService userServiceImpl;
	@Resource
	private ILinkmanuserService linkmanuserServiceImpl;
	@Resource
	private ILinkmanService linkmanServiceImpl;
     @RequestMapping("save")
     public String save(String[] linkname,String[] relation,String[] phone,Integer uid) {
    	 System.out.println(uid);
    	 Linkman link=new Linkman();
    	 Linkman link2=new Linkman();
    	 for (int i = 0; i < linkname.length; i++) {
    		 if(i==0) {
    			 link.setLinkname(linkname[0]);
    		 }else {
    			 link2.setLinkname(linkname[1]);
    		 }
		}
    	 for (int i = 0; i < relation.length; i++) {
    		 if(i==0) {
    			 link.setRelation(relation[0]);
    		 }else {
    			 link2.setRelation(relation[1]);
    		 }
		}
    	 for (int i = 0; i < phone.length; i++) {
    		 if(i==0) {
    			 link.setPhone(phone[0]);
    		 }else {
    			 link2.setPhone(phone[1]);
    		 }
		}
    	 linkmanServiceImpl.save(link);
    	 linkmanServiceImpl.save(link2);
    	 linkmanuserServiceImpl.save(new LinkmanuserKey(link.getLinkid(),uid));
    	 linkmanuserServiceImpl.save(new LinkmanuserKey(link2.getLinkid(),uid));
    	 System.out.println(link);
    	 System.out.println(link2);
    	 User user = userServiceImpl.findOne(uid);
    	 walletServiceImpl.save(user);
    	 return "redirect:/user/index.jsp";
     }
}
