package com.woniu.action;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.entity.Invest;
import com.woniu.entity.Message;
import com.woniu.entity.PageBean;
import com.woniu.entity.Product;
import com.woniu.service.IInvestService;
import com.woniu.service.IProductService;
@RestController
@RequestMapping("/api")
public class InvestController {
	@Resource
	private IInvestService investServiceImpl;
	//增加
	@PostMapping("/save")
	public Message save(Invest invest) {
		Message msg = null;
		try {
			investServiceImpl.add(invest);
			msg = new Message(true, "投资增加成功");
		} catch (Exception e) {
			msg = new Message(false, "投资增加失败"+e.getMessage());
		}
		return msg;
	}
	//删除
	@DeleteMapping("/del")
	public void del(Integer id) {
		investServiceImpl.del(id);
		
	}
	@RequestMapping("/revoke")
	public void revoke(Integer id) {
		investServiceImpl.revoke(id);
		
	}
	//修改
	@PutMapping("/edit")
	public Message edit(Invest invest) {
		Message msg = null;
		try {
			investServiceImpl.update(invest);
			msg = new Message(true, "投资修改成功");
		} catch (Exception e) {
			msg = new Message(false, "投资修改失败"+e.getMessage());
		}
		return msg;
	}
	//查一个
	@GetMapping("/goedit")
	public Invest find(@PathVariable Integer id) {
		Invest invest = investServiceImpl.find(id);
		return invest;
	}
	//查所有
	@GetMapping("/findAll")
	public Map<String, Object> findAll(PageBean pb) {
		Map<String,Object>map = new HashMap<String,Object>();
		List<Invest> invests = investServiceImpl.findAll(pb);
		map.put("list", invests);
		map.put("page", pb);
		return map;
	}
}
