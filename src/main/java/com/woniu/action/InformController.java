package com.woniu.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.entity.Inform;
import com.woniu.service.IInformService;

@Controller
@RequestMapping("/inform")
public class InformController {
      
	@Resource
	private IInformService informServiceImpl;
	@RequestMapping("save")
	public String save(Inform inform) {
		informServiceImpl.save(inform);
		return "redirect:/inform/findAll";
	}
	@RequestMapping("update")
	public String update(Inform inform) {
		informServiceImpl.update(inform);
		return "redirect:/inform/findAll";
	}
	@RequestMapping("delete")
	public String delete(Integer informid) {
		System.out.println("delete"+informid);
		informServiceImpl.delete(informid);
		return "redirect:/inform/findAll";
	}
	@RequestMapping("findOne")
	public String findOne(Integer informid,Model model) {
		System.out.println("findOne"+informid);
		Inform inform = informServiceImpl.findOne(informid);
		model.addAttribute("inform", inform);
		return "back/inform/input";
	}
	@RequestMapping("findAll")
	public String findAll(Model model) {
		List informs = informServiceImpl.findAll();
		model.addAttribute("informs", informs);
		return "/back/inform/list";
	}
	@RequestMapping("findAllByHelp")
	public String findAllByHelp(Model model) {
		List informs = informServiceImpl.findAll();
		model.addAttribute("informs", informs);
		return "/user/helpcenter";
	}
}
