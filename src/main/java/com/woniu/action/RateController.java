package com.woniu.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.entity.Rate;
import com.woniu.service.IRateService;

@Controller
@RequestMapping("/rate")
public class RateController {
    @Resource  
	private IRateService rateServiceImpl;
	@RequestMapping("findAll")
    public String findAll(Model model) {
    	List list = rateServiceImpl.findAll();
    	model.addAttribute("list", list);
    	return "back/rate/list";
    }
	@RequestMapping("update")
	public @ResponseBody void update(Rate rate) {
		System.out.println("正在修改利率。。。");
		rateServiceImpl.update(rate);
	}
	@RequestMapping("delete")
	public @ResponseBody void delete(Integer rateid) {
		rateServiceImpl.delete(rateid);
	}
	@RequestMapping("save")
	public @ResponseBody void save(Rate rate) {
		System.out.println("正在增加利率。。。");
		rateServiceImpl.save(rate);
	}
}
