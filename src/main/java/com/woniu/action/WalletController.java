package com.woniu.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.entity.User;
import com.woniu.entity.Wallet;
import com.woniu.service.IUserService;
import com.woniu.service.IWalletService;

@Controller
@RequestMapping("/wallet")
public class WalletController {
   @Resource
	private IUserService userServiceImpl;
	@Resource
	private IWalletService walletServiceImpl;
   @RequestMapping("findOne")
   public String findOne(Integer uid,Model model) {
	   System.out.println(uid);
	   Wallet wallet = walletServiceImpl.findOne(uid);
	   model.addAttribute("wallet", wallet);
	   return "/user/userWallet";
   }
   @RequestMapping("update")
   public @ResponseBody Wallet updatePas(Integer uid,String password,String password1) {
	   System.out.println(uid+"登陆密码"+password+"钱包密码"+password1);
	   User user = userServiceImpl.findByUid(uid, password);
	   System.out.println(user);
	   if(user!=null) {
		   Wallet wallet=new Wallet();
		   wallet.setUid(uid);wallet.setPassword(password1);
		   walletServiceImpl.update(wallet);
		   return wallet;
	   }
	   return null;
   }
}
