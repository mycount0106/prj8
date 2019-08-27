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
import com.woniu.entity.Withdrawal;
import com.woniu.service.IInvestService;
import com.woniu.service.IProductService;
import com.woniu.service.IWithdrawalService;
@RestController
@RequestMapping("/app")
public class WithdrawalController {
	@Resource
	private IWithdrawalService WithdrawalServiceImpl;
	//增加
	@PostMapping("/save")
	public Message save(Withdrawal withdrawal) {
		Message msg = null;
		try {
			WithdrawalServiceImpl.add(withdrawal);
			msg = new Message(true, "提现成功");
		} catch (Exception e) {
			msg = new Message(false, "提现失败"+e.getMessage());
		}
		return msg;
	}
	//删除
	@DeleteMapping("/del")
	public void del(Integer id) {
		WithdrawalServiceImpl.del(id);
		
	}
	@RequestMapping("/revoke")
	public void revoke(Integer id) {
		WithdrawalServiceImpl.revoke(id);
		
	}
	//修改
	@PutMapping("/edit")
	public Message edit(Withdrawal withdrawal) {
		Message msg = null;
		try {
			WithdrawalServiceImpl.update(withdrawal);
			msg = new Message(true, "修改成功");
		} catch (Exception e) {
			msg = new Message(false, "修改失败"+e.getMessage());
		}
		return msg;
	}
	//查一个
	@GetMapping("/goedit")
	public Withdrawal find(@PathVariable Integer id) {
		Withdrawal withdrawal = WithdrawalServiceImpl.find(id);
		return withdrawal;
	}
	//查所有
	@GetMapping("/findAll")
	public Map<String, Object> findAll(PageBean pb) {
		Map<String,Object>map = new HashMap<String,Object>();
		List<Withdrawal> withdrawals = WithdrawalServiceImpl.findAll(pb);
		map.put("list", withdrawals);
		map.put("page", pb);
		return map;
	}
}
