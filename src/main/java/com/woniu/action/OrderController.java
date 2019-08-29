package com.woniu.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.entity.Order;
import com.woniu.service.IOrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
   @Resource
	private IOrderService orderServiceImpl;
   
   @RequestMapping("save")
   public @ResponseBody String save(Order order) {
	   System.out.println("正在提交订单"+order);
	   orderServiceImpl.save(order);
	   return null;
   }
   @RequestMapping("findOrder")
   public String findOrder(Integer status,Model model) {
	   System.out.println("正在查询订单 。。。。");
	   List orders = orderServiceImpl.findOrder(status);
	   model.addAttribute("orders", orders);
	   return "/back/order/list";
   }
   @RequestMapping("updateStatus")
   public @ResponseBody void updateStatus(Order order) {
	   System.out.println("正在审核订单"+order.getOid());
	   orderServiceImpl.updateStatus(order);
   }
}
