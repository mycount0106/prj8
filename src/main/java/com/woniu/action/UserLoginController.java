package com.woniu.action;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.entity.User;
import com.woniu.service.IUserService;

@Controller
@RequestMapping("userLogin")
public class UserLoginController {
    @Resource
	private RedisTemplate<String, String> redisTemplate;
	@Resource
	private IUserService userServiceImpl;
    @RequestMapping("login")
    public @ResponseBody Integer Login(User user,HttpServletRequest req) {
    	System.out.println("正在登陆"+user);
    	User u = userServiceImpl.login(user);
    	System.out.println("查找到用户"+u);
    	if(u!=null) {
    		req.getSession().setAttribute("user", u);
    		return 0;
    	}else {
    		return 1;
    	}
    }
    @RequestMapping("SmS")
    public @ResponseBody String sendSms(String phone) {
    	System.out.println(phone);
    	Object obj = redisTemplate.opsForHash().get("sessionList", phone);
    	int count =0;
    	if(obj==null) {
    		count=1;
    	}else {
    		 count = Integer.parseInt(obj.toString());
    		count++;
    	}
    	if(count>3) {
    		return "今日已达上限";
    	}
    	redisTemplate.opsForHash().put("sessionList", phone, count+"");
    	Random rd=new Random();
    	String number=rd.nextInt(9999)+"";
    	System.out.println(number);
    	//String str=SmS.send(phone,number);
    	redisTemplate.opsForValue().set(phone, number);
    	redisTemplate.expire(phone, 30, TimeUnit.SECONDS);
    	return "已发送短信";
    }
    @RequestMapping("reg")
    public @ResponseBody String reg(User user,String code) {
    	System.out.println(user.toString());
    	System.out.println(code);
    	String str = redisTemplate.opsForValue().get(user.getPhone());
    	System.out.println(str);
    	redisTemplate.opsForValue().set(user.getPhone(), null);
    	if(str!=null&&user.getPhone()!=null&&str.equals(code)) {
    		userServiceImpl.save(user);
    		return "注册成功";
    	}else {
    		
    		return "注册失败";
    	}
    	
    }
    @RequestMapping("removeLogin")
    public @ResponseBody String removeLogin(HttpServletRequest req) {
    	System.out.println("退出登陆");
    	req.getSession().removeValue("user");
    	return "退出成功";
    }
}
